package com.cfgbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	Environment env;
	
	@RequestMapping(value="/info", method=RequestMethod.GET)
	public String sayInfo()
	{
		String msg="Welcome to my first microservice....the following are the various URIs available in this microservice";
		msg=msg+"<br><a href='hello'>Hello</a>";
		msg=msg+"<br><a href='welcome'>Welcome</a>";
		return msg;
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String sayHello()
	{
		
		return "Hello World Microservice "+env.getProperty("local.server.port")+" and "+env.getProperty("eureka.instance.instance-id");
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String sayWelcome()
	{
		return "Welcome to  World Microservice";
	}
}
