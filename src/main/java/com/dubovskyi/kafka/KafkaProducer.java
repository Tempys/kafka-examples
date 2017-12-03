package com.dubovskyi.kafka;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import java.util.Properties;

public class KafkaProducer
{
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("bootstrap.servers","192.168.99.100:9092");
        prop.setProperty("key.serializer", StringSerializer.class.getName());
        prop.setProperty("value.serializer", StringSerializer.class.getName());
        prop.setProperty("acks","1");
        prop.setProperty("retries","3");
        prop.setProperty("linger.ms","1");


        Producer<String,String> producer= new org.apache.kafka.clients.producer.KafkaProducer<String, String>(prop);

        ProducerRecord<String,String> record = new ProducerRecord<String, String>("third_topic","2","this is the test message1");

        for(int i =0;i<= 10;i++){
            producer.send(record);
        }


     //   producer.flush();
        producer.close();

    }
}
