package org.eureka.server01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka 第二台服务注册中心
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServe01Application {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServe01Application.class, args);
	}
}
