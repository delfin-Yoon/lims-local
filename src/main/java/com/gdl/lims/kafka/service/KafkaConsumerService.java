package com.gdl.lims.kafka.service;

import java.io.IOException;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
	
//	@KafkaListener(topics = "kafkatest", groupId = "group-id-kafkatest")
	public void consume(String message) throws IOException {
		System.out.println("receive message : " + message);
	}
}
