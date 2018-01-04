package com.dubovskyi.kafka.streams;

import com.fasterxml.jackson.databind.JsonNode;
import io.confluent.kafka.schemaregistry.client.CachedSchemaRegistryClient;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.avro.Schema;
import org.apache.avro.reflect.ReflectData;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.serialization.Serializer;
import org.apache.kafka.connect.json.JsonSerializer;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KStreamBuilder;


import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

public class SimpleStreamsWithTransformationApp {

    public static final String INPUT_QUEUE ="input-stream-application";
    public static final String OUTPUT_QUEUE ="output-stream-application";

    public static void main(String[] args) {



        Properties config = new Properties();

        config.put(StreamsConfig.APPLICATION_ID_CONFIG,INPUT_QUEUE);
        config.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "http://127.0.0.1:9092");
        config.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
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
            System.out.println("data: "+i);
            HistorySO historySO = new HistorySO();
            historySO.setUuid(i.getUuid());
            historySO.setResponse(i.getAuthkey());
            return historySO;
        })
              .to(Serdes.String(),serdes,OUTPUT_QUEUE);

        KafkaStreams streams = new KafkaStreams(builder, config);
        streams.cleanUp();
        streams.start();

        // print the topology
        System.out.println(streams.toString());

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
