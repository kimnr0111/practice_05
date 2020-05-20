package com.javaex.ex02;

public class Goods {
	
	private String name;
	private int price;
	
	//원래있던 생성자가 사라져서 new Goods()에서 오류
	//새로 생성자를 생성해줘야됨
	
	public Goods() {}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}

}
