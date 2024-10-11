package org.fai.study.demo_consumer.services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void consume(String message) {
        System.out.println("Message: " + message);
    }
}
