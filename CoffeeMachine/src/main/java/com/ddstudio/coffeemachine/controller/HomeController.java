package com.ddstudio.coffeemachine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ddstudio.coffeemachine.service.CoffeeOrderService;
import com.ddstudio.coffeemachine.vo.OrderVo;

@Controller
public class HomeController {
	@Autowired
	public CoffeeOrderService coffeeOrderService;
	
//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main(Model model) {
		int currentRoom = coffeeOrderService.getCurrentRoom();
		
		List<OrderVo> orderVoList = coffeeOrderService.getOrders(currentRoom);
		
		System.out.println("HomeController currentRoom = " + currentRoom);
		System.out.println("HomeController orderCount = " + orderVoList.size());
		
		if(orderVoList.size() == 4) {
			// 주문이 진행되고 있으니, 잠시만 기다려 달라는 페이지 노출
			
			return "processing";
		}
		
		model.addAttribute("roomId", currentRoom);
		return "main";
	}
	
	
	@RequestMapping(value = "/order", method = RequestMethod.POST)
	public String order(OrderVo orderVo) {
		System.out.println("HomeController userName = " + orderVo.userName);
		coffeeOrderService.order(orderVo);
		return "main";
	}
	
}
