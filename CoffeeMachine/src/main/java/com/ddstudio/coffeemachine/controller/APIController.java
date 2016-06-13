package com.ddstudio.coffeemachine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ddstudio.coffeemachine.service.CoffeeOrderService;
import com.ddstudio.coffeemachine.vo.DrinkVo;
import com.ddstudio.coffeemachine.vo.OrderVo;
import com.ddstudio.coffeemachine.vo.RoomVo;

@RestController
@RequestMapping(value ="/api")
public class APIController {
	@Autowired
	public CoffeeOrderService coffeeOrderService;
	
//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	@ResponseBody
	public List<DrinkVo> menu() {
		return coffeeOrderService.getAllDrinks();
	}

	@RequestMapping(value = "/room/{roomId}/orderer", method = RequestMethod.GET)
	@ResponseBody
	public List<OrderVo> menu(@PathVariable int roomId) {
		
		return coffeeOrderService.getOrders(roomId);
	}
	
	
	@RequestMapping(value = "/room", method = RequestMethod.GET)
	@ResponseBody
	public int room() {
		return coffeeOrderService.getCurrentRoom();
	}
	
	
	@RequestMapping(value = "/sendtest", method = RequestMethod.GET)
	@ResponseBody
	public int sendSMS() {
		return coffeeOrderService.sendSMS(null);
	}
	
	
	@RequestMapping(value = "/send", method = RequestMethod.POST)
	@ResponseBody
	public int sendSMS(RoomVo roomVo) {
		return coffeeOrderService.sendSMS(roomVo);
	}
	
}
