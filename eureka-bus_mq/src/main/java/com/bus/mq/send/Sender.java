package com.bus.mq.send;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {

	@Autowired
    private AmqpTemplate rabbitmqTemplate;
 
    public String send(){
        String content = "hello-->message bud rabbitmq " + new Date();
        System.out.println("Sender:" +content);
        this.rabbitmqTemplate.convertAndSend("bus.mq.exchange","topic.routingkey.message",content);

        return content;
    }


	
	
}
