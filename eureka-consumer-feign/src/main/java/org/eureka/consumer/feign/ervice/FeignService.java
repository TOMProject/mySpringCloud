package org.eureka.consumer.feign.ervice;


import org.eureka.consumer.feign.ervice.impl.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 使用feign 消费模式回调接口的实现类
 * @author xyc
 *
 */

@FeignClient(value ="eureka-client",fallback=SchedualServiceHiHystric.class)             
public interface FeignService {

	@RequestMapping(value = "/hc",method = RequestMethod.GET)
	public String feignConsumer();
	
}


