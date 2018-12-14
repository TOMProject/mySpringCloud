package org.eureka.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 使用feign 服务消费 自动本地负载均衡
 *
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"org.eureka.consumer.feign"})
public class EureKaFeignApplication {
	public static void main(String[] args) {
        SpringApplication.run(EureKaFeignApplication.class, args );
    }

}
