package org.eureka.consumer.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

public class ComsumerReceiver {

	@RabbitListener(queues="hello")
	public void receiver(String name) {
		
		System.out.println("eureka-consumer receiver ==>"+name);
		
	}
	
}
