package com.spring.ReferenceInjection;

public class A 
{
	private int x;
	private B bRef;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getbRef() {
		return bRef;
	}
	public void setbRef(B bRef) {
		this.bRef = bRef;
	}
}
