package com.dubovskyi.kafka.spring;

import com.dubovskyi.kafka.streams.NotificationEventDto;

public interface KafkaProducer {

   void send(String topic, NotificationEventDto message, String key);
}
