package com.kh.practice.point.model.vo;

public class Triangle extends Point {
	private int a;
	private int height;
	
	public Triangle() {}
	
	public Triangle(int x, int y, int a, int height) {
		super(x, y);
	}

	@Override
	public int areaInt() {
		return 0;
	}

	@Override
	public int roundInt() {
		return 0;
	}

	@Override
	public double areaDouble() {
		return 0;
	}

	@Override
	public double roundDouble() {
		return 0;
	}
	
	@Override
	public String toString() {
		return super.toString() + " , " + (this.a * this.height / 0.5);
	}
}
