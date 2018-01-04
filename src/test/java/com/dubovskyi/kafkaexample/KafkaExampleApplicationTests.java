package com.dubovskyi.kafkaexample;

import com.dubovskyi.kafka.KafkaExampleApplication;
import com.dubovskyi.kafka.spring.KafkaProducer;
import com.dubovskyi.kafka.streams.NotificationEventDto;
import com.dubovskyi.kafka.streams.SimpleStreamsWithTransformationApp;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

import static com.dubovskyi.kafka.streams.SimpleStreamsWithTransformationApp.INPUT_QUEUE;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = KafkaExampleApplication.class)
public class KafkaExampleApplicationTests {

	@Autowired
	private KafkaProducer kafkaProducer;

	/*@Test
	@Ignore
	public void setKafkaProducerTest() {

		for(int i =0; i<= 10;i++) {

			String key = (i % 2)+"";

			kafkaProducer.send("test-queue",key,i+"");

		}

	}*/


	@Test
	//@Ignore
	public void setKafkaProducerTest1() {
		NotificationEventDto eventDto = new NotificationEventDto(UUID.randomUUID().toString(),"1231234");

		kafkaProducer.send(INPUT_QUEUE,eventDto,"1");
	}
}
