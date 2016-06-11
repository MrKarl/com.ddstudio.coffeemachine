package com.ddstudio.coffeemachine.vo;

import java.time.LocalDateTime;

public class OrderVo {
	public int orderId;		// 한명이 주문하면 자동으로 올라
	public int roomId;		// 주문 방번호
	public int userNo;
	public int drinkNo;
	public String floor;
	public LocalDateTime orderTime;
	public int canPay;
	
	
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int orderNo) {
		this.roomId = orderNo;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public int getDrinkNo() {
		return drinkNo;
	}
	public void setDrinkNo(int drinkNo) {
		this.drinkNo = drinkNo;
	}
	public LocalDateTime getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(LocalDateTime orderTime) {
		this.orderTime = orderTime;
	}
	public int getCanPay() {
		return canPay;
	}
	public void setCanPay(int canPay) {
		this.canPay = canPay;
	}	
}
