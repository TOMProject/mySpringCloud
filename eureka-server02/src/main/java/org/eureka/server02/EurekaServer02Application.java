package org.eureka.server02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka第三个服务
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer02Application {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer02Application.class, args);
	}
}
