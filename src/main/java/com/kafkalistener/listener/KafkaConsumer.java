package com.kafkalistener.listener;

import com.kafkalistener.model.FormSubmission;
import com.kafkalistener.service.FormSubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @Autowired
    FormSubmissionService formSubmissionService;

    @KafkaListener(topics = "Kafka_Example")
    public void consume(String message) {
        formSubmissionService.save(new FormSubmission(message));
        System.out.println("Consumed message: " + message);
    }
}
