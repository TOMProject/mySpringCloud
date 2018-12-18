package org.eureka.consumer.feign.controller;

import org.eureka.consumer.feign.ervice.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

	
	@Autowired
	FeignService feignService;
	
	@GetMapping(value="/consumer")
	public String dc() {
		
		return  feignService.feignConsumer();
	}
}
