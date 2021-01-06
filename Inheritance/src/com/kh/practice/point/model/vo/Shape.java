package com.kh.practice.point.model.vo;

public interface Shape {
	String shapeName();		// 도형명을 문자열로 리턴
	int areaInt();
	double areaDouble();
	int roundInt();
	double roundDouble();
	
	String toString();
}
