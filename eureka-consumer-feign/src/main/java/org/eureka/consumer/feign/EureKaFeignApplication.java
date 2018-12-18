package org.eureka.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 使用feign 服务消费 自动本地负载均衡
 *
 */
@SpringBootApplication(scanBasePackages = {"org.eureka.consumer.feign"})
@EnableFeignClients
@EnableEurekaClient
@EnableDiscoveryClient
public class EureKaFeignApplication {
	public static void main(String[] args) {
        SpringApplication.run(EureKaFeignApplication.class, args );
    }

	//在feign 中是hystrix 断路器，feign中自带hystrix ,但是默认是关闭的，所以要使用必须设置：feign.hystrix.enabled=true
	
}
