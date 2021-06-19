package com.spring.ThirdApplication;

public class Product 
{
	private int productId;
	private String productName;
	private double productPrice;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		System.out.println("Setting product Id");
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		System.out.println("Setting product name");
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		System.out.println("Setting product price");
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
}
