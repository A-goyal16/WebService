package org.paycorp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ControllerClass 
{
	@RequestMapping("/web")
	public String m1()
	{
		return "Welcome to the Page";
	}
	
	@GetMapping("/load")
	public String m2()
	{
		String url="http://localhost:8080/web";
		RestTemplate rt=new RestTemplate();
		String result=rt.getForObject(url, String.class);
		return result;
	}

}
