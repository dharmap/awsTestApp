package com.fm.test.app.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@RequestMapping(value="/hello/{name}", method=RequestMethod.GET)
	public String hello(@PathVariable String name){
		return "Hello " + name + " badcow..!";
	}
	
	@RequestMapping(value="/helloInJson/{name}", method=RequestMethod.GET)
	public HelloObj helloInJson(@PathVariable String name){
		return new HelloObj(name, hello(name));
	}
	
}
