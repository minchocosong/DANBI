package com.swm.domain;

public class SimpleCounsel {
	
	String type;
	int date;
	int value;	
	
	
	public SimpleCounsel(int date,String type, int value) {
		super();
		this.type = type;
		this.date = date;
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	

}
