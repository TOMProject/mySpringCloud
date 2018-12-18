package com.bus.mq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus.mq.send.Sender;

@RestController
public class SendController {

	@Autowired
	Sender sender;
	
	@RequestMapping(value="/send")
	public String send() {
		String send = sender.send();
		return send;
		
		
	}
	
	
}
