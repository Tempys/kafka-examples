package com.dubovskyi.kafka.core;

import com.fasterxml.jackson.databind.JsonNode;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.kafka.connect.json.JsonDeserializer;

import java.util.Arrays;
import java.util.Properties;

public class KafkaConsumers {

    public static void main(String[] args) {
        Properties prop = new Properties();


        prop.setProperty("bootstrap.servers","localhost:9092");
        prop.setProperty("key.deserializer", StringDeserializer.class.getName());
        prop.setProperty("value.deserializer", StringDeserializer.class.getName());
        prop.setProperty("group.id", "testf2");
        prop.setProperty("enable.auto.commit", "true");
        prop.setProperty("auto.commit.interval.ms", "1000");
        prop.setProperty("auto.offset.reset","earliest");



        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(prop);
        consumer.subscribe(Arrays.asList("test2"));

        consumer.poll(1000).forEach(i -> System.out.println(i.value()));

        consumer.commitSync();



    }
}
