package com.ddstudio.coffeemachine.vo;

import org.springframework.stereotype.Component;

@Component
public class DrinkVo {
	public int drinkNo;
	public String drinkName;
	public int price;
	public String drinkCategory;
	
	public int getDrinkNo() {
		return drinkNo;
	}
	public void setDrinkNo(int drinkNo) {
		this.drinkNo = drinkNo;
	}
	public String getName() {
		return drinkName;
	}
	public void setName(String name) {
		this.drinkName = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDrinkCategory() {
		return drinkCategory;
	}
	public void setDrinkCategory(String drinkCategory) {
		this.drinkCategory = drinkCategory;
	}
		
}