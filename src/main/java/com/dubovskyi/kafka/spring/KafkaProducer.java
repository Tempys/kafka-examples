package com.dubovskyi.kafka.spring;

public interface KafkaProducer {

   void send(String topic,String message,String key);
}
