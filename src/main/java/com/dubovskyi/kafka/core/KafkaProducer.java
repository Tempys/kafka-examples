package com.dubovskyi.kafka.core;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class KafkaProducer
{
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("bootstrap.servers","localhost:9092");
        prop.setProperty("key.serializer", StringSerializer.class.getName());
        prop.setProperty("value.serializer", StringSerializer.class.getName());
        prop.setProperty("acks","1");
        prop.setProperty("retries","3");
        prop.setProperty("linger.ms","1");


        Producer<String,String> producer= new org.apache.kafka.clients.producer.KafkaProducer<String, String>(prop);

        ProducerRecord<String,String> record = new ProducerRecord<String, String>("js1","{ \"a\": 1 }");


        long start1 = System.currentTimeMillis();
        for(int i =0;i<= 10;i++){
            try {
                long start = System.currentTimeMillis();
                long offset =  producer.send(record).get().offset();

                System.out.println("send time: "+ (System.currentTimeMillis() - start) +" for offest : "+offset);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        System.out.println("total sending time: "+ (System.currentTimeMillis() - start1));


     //   producer.flush();
        producer.close();

    }
}
