package org.eureka.consumer.feign.ervice;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="eureka-client")
public interface FeignService {

	@RequestMapping(method = RequestMethod.GET, value = "/hc")
	public String feignConsumer(@RequestParam(value = "name") String a);
	
}


