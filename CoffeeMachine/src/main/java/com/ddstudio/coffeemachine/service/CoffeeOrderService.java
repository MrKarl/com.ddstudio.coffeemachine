package com.ddstudio.coffeemachine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddstudio.coffeemachine.dao.OrderDao;

@Service
public class CoffeeOrderService {
	@Autowired
	public OrderDao orderDao;
	
	
}
