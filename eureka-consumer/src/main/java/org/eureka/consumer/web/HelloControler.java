package org.eureka.consumer.web;

import org.eureka.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;
    
    /**
     * hystrix 熔断器组件的使用，调用的的方法上添加上注解，编写回调的函数 ，断路打开后，可用避免连锁故障，fallback方法可以直接返回一个固定值。
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "hiError")
    @GetMapping(value = "/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return helloService.hiService( name );
    }
    
    
	public String hiError(@RequestParam(value = "name", defaultValue = "forezp") String name) {

		return "hi," + name + ",sorry,error!";
	}
    
}