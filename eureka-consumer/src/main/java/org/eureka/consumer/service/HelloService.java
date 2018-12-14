package org.eureka.consumer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
	
	@Autowired
	RestTemplate restTemplate;

//	public String hiService(String name) {
//		return restTemplate.getForObject("http://localhost:8762/hi?name=" + name, String.class);
//	}
//	
	
	/**
	 * 使用discoveryClient通过反射的方式获取需要访问项目的路径达到多个项目之间的相互访问
	 * 
	 * 
	 */
	
	@Autowired
	DiscoveryClient discoveryClient;
	
	public String hiService(String name) {
		String nameid ="eureka-client";
		List<ServiceInstance> instances = discoveryClient.getInstances(nameid);
		if(instances == null || instances.isEmpty()) {
			return null;
		}
		ServiceInstance serviceInstance = instances.get(0);
		serviceInstance.getHost();//主机名称
		serviceInstance.getPort();//端口号
		String url = "http://"+serviceInstance.getHost()+":"+serviceInstance.getPort();
		
		return restTemplate.getForObject(url+"/hi?name=" + name, String.class);
		
	}
	
	
	
	
}
