package com.tcf.Shopping;

public class Customer {
	private int cid;
	private String name;
	private String city;
	
	//interface reference
	private ShoppingMall sh;

	public Customer(int cid, String name, String city, ShoppingMall sh) {
		this.cid = cid;
		this.name = name;
		this.city = city;
		this.sh = sh;
	}

	
	public void order() {
		sh.purchase();
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", city=" + city + "]";
	}

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

	public ShoppingMall getSh() {
		return sh;
	}

	public void setSh(ShoppingMall sh) {
		this.sh = sh;
	}
	
	
}
