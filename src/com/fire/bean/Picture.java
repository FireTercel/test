package com.fire.bean;

public class Picture {
	
	private String picName;
	
	private int price;
	
	private String command;

	public String getPicName() {
		return picName;
	}

	public void setPicName(String picName) {
		this.picName = picName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}
	
	public String toString(){
		
		return "名称："+picName+" 价格："+price+" 说明："+command;
	}

}
