package com.dubovskyi.kafkaexample;

import com.dubovskyi.kafka.spring.KafkaProducer;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaExampleApplicationTests {

	@Autowired
	private KafkaProducer kafkaProducer;

	@Test
	@Ignore
	public void setKafkaProducerTest() {

		for(int i =0; i<= 10;i++) {

			String key = (i % 2)+"";

			kafkaProducer.send("test-queue",key,i+"");

		}



	}


}
