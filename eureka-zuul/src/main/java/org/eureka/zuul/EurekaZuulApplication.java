package org.eureka.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * zuul 接口网关
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy //@EnableZuulProxy注解开启Zuul的功能。
public class EurekaZuulApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaZuulApplication.class, args);
	}
}
