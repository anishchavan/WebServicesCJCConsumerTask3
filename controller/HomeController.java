package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
	@Autowired
	RestTemplate rt;
	
	@GetMapping("/getdata")
	public List getData() {
		String url = "http://localhost:8082/getdata";
		List al = rt.getForObject(url, List.class);
		return al;
	}
	
	@GetMapping("/getbyaddress/{address}")
	public List getByAddress(@PathVariable String address) {
		String url ="http://localhost:8082/getbyaddress/"+ address;
		List al = rt.getForObject(url, List.class);
		return al;
		
	}
}
