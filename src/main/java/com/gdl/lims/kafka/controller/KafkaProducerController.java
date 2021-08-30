package com.gdl.lims.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gdl.lims.kafka.service.KafkaProducerService;

@RestController
public class KafkaProducerController {

	@Autowired
	private KafkaProducerService producerService;
	
	@PostMapping("/kafka/sendMessage")
	public void sendMessage(String message) {
		producerService.sendMessage(message);
	}
	
	@PostMapping("/kafka/post")
	public String kafkaPost(@RequestBody String message) {
		System.out.println("message : " + message);
		return "kafka Post connection test()";
	}
	
}
