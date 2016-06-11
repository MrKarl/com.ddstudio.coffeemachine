package com.ddstudio.coffeemachine.vo;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class UserVo {
	public int userNo;
	public String userName;
	public String phoneNumber;
	public String floor;
    public LocalDateTime lastOrderDateTime;
    public int orderCount;
    
    
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getName() {
		return userName;
	}
	public void setName(String name) {
		this.userName = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public LocalDateTime getLastOrderDateTime() {
		return lastOrderDateTime;
	}
	public void setLastOrderDateTime(LocalDateTime lastOrderDateTime) {
		this.lastOrderDateTime = lastOrderDateTime;
	}
	public int getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}
    
    
    
}
