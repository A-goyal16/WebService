package org.paycorp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController 
{
	@GetMapping("/send")
	public String send()
	{
		String url="http://localhost:8080/load";
		RestTemplate rt=new RestTemplate();
		String result=rt.getForObject(url, String.class);
		return result;
	}
}
