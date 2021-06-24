package com.spring.AutowiringXmlByType;

public class Course 
{
	private String courseName;
	private String duration;
	private double price;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", duration=" + duration + ", price=" + price + "]";
	}
	
	
}
