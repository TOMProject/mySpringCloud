package org.eureka.consumer.feign.ervice.impl;

import org.eureka.consumer.feign.ervice.FeignService;
import org.springframework.stereotype.Component;

/**
 *feign 使用hystrix 需要实现接口
 * 
 * 
 * @author 
 *
 */

@Component
public class SchedualServiceHiHystric implements FeignService{

	@Override
	public String feignConsumer() {
		// TODO Auto-generated method stub
		return "i eureka-clent sorry";
	}

	
	
}
