package com.ddstudio.coffeemachine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ddstudio.coffeemachine.service.CoffeeOrderService;

@RestController
public class APIController {
	@Autowired
	public CoffeeOrderService coffeeOrderService;
	
	
}
