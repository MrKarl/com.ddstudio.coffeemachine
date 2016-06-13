package com.ddstudio.coffeemachine.vo;

import java.time.LocalDateTime;

public class RoomVo {
	public int roomId;
	public int howManyPeople;
	public int totalPrice;
	public boolean isFinished;
	public String smsMessage;
	public String senderPhoneNumber;
	public String receiverPhoneNumber;
	public LocalDateTime createdTime;
	public LocalDateTime finishedTime;
	
	public boolean isFinished() {
		return isFinished;
	}
	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}
	public String getSmsMessage() {
		return smsMessage;
	}
	public void setSmsMessage(String smsMessage) {
		this.smsMessage = smsMessage;
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
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public int getHowManyPeople() {
		return howManyPeople;
	}
	public void setHowManyPeople(int howManyPeople) {
		this.howManyPeople = howManyPeople;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public LocalDateTime getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
	}
	public LocalDateTime getFinishedTime() {
		return finishedTime;
	}
	public void setFinishedTime(LocalDateTime finishedTime) {
		this.finishedTime = finishedTime;
	}
}
