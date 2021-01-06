package com.kh.example.practice3.model.vo;

public class Circle {
	// public static final double PI = 3.14;
	private double PI = 3.14;
	private int radius = 1;
	
	public void getAreaOfCircle() {
		System.out.println("원의 넓이 : " + PI * (radius * radius));
	}
	
	public void getSizeOfCircle() {
		System.out.println("원의 둘레 : " + 2 * PI * radius);
	}

	public void incrementRadius() {
		this.radius++;
	}
	
}
