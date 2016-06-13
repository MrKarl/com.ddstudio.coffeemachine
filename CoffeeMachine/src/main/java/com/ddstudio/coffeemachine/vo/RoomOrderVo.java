package com.ddstudio.coffeemachine.vo;

import java.util.Map;

public class RoomOrderVo {
	public Map<String, String> orderInfo;
	public String senderPhoneNumber;
	public String receiverPhoneNumber;
	public String floor;
	
	
	public Map<String, String> getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(Map<String, String> orderInfo) {
		this.orderInfo = orderInfo;
	}
	public String getSenderPhoneNumber() {
		return senderPhoneNumber;
	}
	public void setSenderPhoneNumber(String senderPhoneNumber) {
		this.senderPhoneNumber = senderPhoneNumber;
	}
	public String getReceiverPhoneNumber() {
		return receiverPhoneNumber;
	}
	public void setReceiverPhoneNumber(String receiverPhoneNumber) {
		this.receiverPhoneNumber = receiverPhoneNumber;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
}
