package com.tcf.training;

public class Customer {
	private int cid;
	private String name;
	private String city;
	public int getcid;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getGetcid() {
		return getcid;
	}
	public void setGetcid(int getcid) {
		this.getcid = getcid;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", city=" + city + ", getcid=" + getcid + ", getCid()="
				+ getCid() + ", getName()=" + getName() + ", getCity()=" + getCity() + ", getGetcid()=" + getGetcid()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
