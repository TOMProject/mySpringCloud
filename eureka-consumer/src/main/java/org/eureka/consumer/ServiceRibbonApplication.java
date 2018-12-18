package org.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费者
 * @author 
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix //使用熔断器组件注解
public class ServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run( ServiceRibbonApplication.class, args );
    }
    /**
     * restTemplate 远程调用方法，底层的实现是httpClient 
     * @return
     */
    @Bean
    //@LoadBalanced //本地的负载均衡器
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}