package com.dubovskyi.kafka.streams;

import com.codahale.metrics.Meter;
import com.dubovskyi.kafka.onesignal.OneSignal;
import com.dubovskyi.kafka.onesignal.model.notification.NotificationRequest;
import io.confluent.kafka.schemaregistry.client.CachedSchemaRegistryClient;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.avro.Schema;
import org.apache.avro.reflect.ReflectData;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.serialization.Serializer;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KStreamBuilder;
import com.codahale.metrics.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SimpleStreamsWithTransformationApp {

    public static final String INPUT_QUEUE ="single-event-queue";
    public static final String OUTPUT_QUEUE ="history-event-queue";
    static final MetricRegistry metrics = new MetricRegistry();

    public static void main(String[] args) {

        final Meter requests = metrics.meter("requests");

        startReport();

        Properties config = new Properties();

        config.put(StreamsConfig.APPLICATION_ID_CONFIG,INPUT_QUEUE);
        config.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "http://127.0.0.1:9092");
        config.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        config.put(StreamsConfig.COMMIT_INTERVAL_MS_CONFIG,"1000");
        config.put("schema.registry.url","http://127.0.0.1:8081");

        Serializer serializer = new KafkaAvroSerializer();
        Map<String, Object> serProps = new HashMap<>();
        serProps.put("schema.registry.url","http://127.0.0.1:8081");
        serializer.configure(serProps,false);

        final Deserializer<NotificationEventDto> deserializer = new JsonPOJODeserializer<>();
        Map<String, Object> serdeProps = new HashMap<>();
        serdeProps.put("JsonPOJOClass", NotificationEventDto.class);
        deserializer.configure(serdeProps, false);



        final Serde serdes = Serdes.serdeFrom(serializer, deserializer);
        // register schema
        schemaRegistration(config);

        System.out.println("start stream");

        KStreamBuilder builder = new KStreamBuilder();

        KStream<String,NotificationEventDto> stream = builder.stream(Serdes.String(), serdes, INPUT_QUEUE);



        stream.mapValues(i -> {
            requests.mark();
           System.out.println("data: "+i.getAuthkey());
            NotificationRequest request = new NotificationRequest();

            request.setId("ddfrjnfruiefnuerfner");
            long start = System.currentTimeMillis();
          //  OneSignal.createNotification(i.getAuthkey(),request);
            long finish = System.currentTimeMillis();
            System.out.println("time: " + ((finish-start)));

            HistorySO so = new HistorySO();

            so.setSystemRequestId("dsdfsdfsdfsdfsd");
            so.setProviderId("1");
            so.setResponseStatus("test");
            so.setErrorMessage("fdfdfdf");
            so.setProviderRequestId("dsfsdfsdfsd");
            so.setRecipients(1);
            return so;
        })
              .to(Serdes.String(),serdes,OUTPUT_QUEUE);

        KafkaStreams streams = new KafkaStreams(builder, config);
        streams.start();

        // print the topology
       // System.out.println(streams.toString());

    }

    static void startReport() {
        ConsoleReporter reporter = ConsoleReporter.forRegistry(metrics)
                .convertRatesTo(TimeUnit.SECONDS)
                .convertDurationsTo(TimeUnit.SECONDS)
                .build();
        reporter.start(1, TimeUnit.SECONDS);
    }

    private static void schemaRegistration(Properties config) {

        int schemaId;
        Schema.Parser parser = new Schema.Parser();
        CachedSchemaRegistryClient client = new CachedSchemaRegistryClient(config.get("schema.registry.url").toString(), 20);
        Schema schema;
        try {
            schemaId = client.getLatestSchemaMetadata("test_schema").getId();
            schema = client.getByID(schemaId);
        } catch (Exception ex) {
            System.out.println("exception: "+ex);
            schema = ReflectData.get().getSchema(HistorySO.class);
            ;
            try {
                schemaId = client.register("test_schema", schema);
            } catch (Exception e) {
                System.out.println("exception1: "+e);
            }
        }
    }

}
