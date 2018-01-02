package com.dubovskyi.kafka.core;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Arrays;
import java.util.Properties;

public class KafkaConsumers {
    public static void main(String[] args) {
        Properties prop = new Properties();


        prop.setProperty("bootstrap.servers","192.168.99.100:9092");
        prop.setProperty("key.deserializer", StringDeserializer.class.getName());
        prop.setProperty("value.deserializer", StringDeserializer.class.getName());
        prop.setProperty("group.id", "test");
        prop.setProperty("enable.auto.commit", "true");
        prop.setProperty("auto.commit.interval.ms", "1000");

        KafkaConsumer<String,String> consumer = new KafkaConsumer<String, String>(prop);
        consumer.subscribe(Arrays.asList("third_topic"));

        consumer.poll(1000).forEach(i -> System.out.println(i.value()));

        consumer.commitSync();



    }
}
