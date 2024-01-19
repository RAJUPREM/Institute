package com.shreemanancareercenter.controller;

public class Address {
	
	public Address() {
		super();
	}
	public Address(String addressDetails, String city, int pinCode, String state) {
		super();
		this.addressDetails = addressDetails;
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
	}
	private String addressDetails;
	private String city;
	private int pinCode;
	private String state;
	public String getAddressDetails() {
		return addressDetails;
	}
	public void setAddressDetails(String addressDetails) {
		this.addressDetails = addressDetails;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [addressDetails=" + addressDetails + ", city=" + city + ", pinCode=" + pinCode + ", state="
				+ state + "]";
	}
	

}
