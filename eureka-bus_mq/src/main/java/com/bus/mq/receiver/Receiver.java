package com.bus.mq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	@RabbitListener(queues = "hello")
    public void process(String hello){
        System.out.println("Receiver:" + hello);
    }

}

