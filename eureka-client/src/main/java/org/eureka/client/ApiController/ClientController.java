package org.eureka.client.ApiController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@Value("${server.port}")
	String port;

	@RequestMapping(value = "/clientTest")
	public String clientTest() {
		return "this celient Test !";
	}

	@RequestMapping("/hi")
	public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
		return "hi " + name + " ,i am from port:" + port;
	}

	@RequestMapping("/hc")
	public String hi() {
		return "hc --->>> hc----i am from port:" + port;
	}

}
