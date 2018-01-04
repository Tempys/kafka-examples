package com.dubovskyi.kafka.spring;

import com.dubovskyi.kafka.streams.NotificationEventDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerImpl  implements KafkaProducer{

    @Autowired
    private KafkaTemplate<String, NotificationEventDto> template;

    @Override
    public void send(String topic,NotificationEventDto message,String key) {

        template.send(topic,key,message);

    }
}
