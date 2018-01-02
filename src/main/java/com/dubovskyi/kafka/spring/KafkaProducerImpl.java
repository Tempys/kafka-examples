package com.dubovskyi.kafka.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerImpl  implements KafkaProducer{

    @Autowired
    private KafkaTemplate<String, String> template;

    @Override
    public void send(String topic,String message,String key) {

        template.send(topic,key,message);

    }
}
