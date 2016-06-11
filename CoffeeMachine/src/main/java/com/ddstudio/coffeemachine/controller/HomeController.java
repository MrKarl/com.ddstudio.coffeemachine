package com.ddstudio.coffeemachine.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ddstudio.coffeemachine.service.CoffeeOrderService;

@Controller
public class HomeController {
	@Autowired
	public CoffeeOrderService coffeeOrderService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	public HomeController(){
	    super();
	}
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		String pageName = "main";
		logger.info("pageName.", pageName);
		
		return pageName;
	}
	
	
	
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);
        
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        
        String formattedDate = dateFormat.format(date);
        
        model.addAttribute("serverTime", formattedDate );
        
        String pageName = "main";
        logger.info("pageName.", pageName);
        
        return pageName;
    }
}
