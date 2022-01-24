package com.prive.brokering.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prive.brokering.dto.BrokerOrderDto;

@RestController
public class TestController {

	@GetMapping("/hi")
	public String message() {
		return "Hi";
	}
	
	@PostMapping("/create-order")
	public void createOrder(@RequestBody BrokerOrderDto dto) {
		System.out.println(dto);
	}
	
}
