package com.kh.practice.chap01_poly.model.vo;

public class Member {
	private String name;		// 회원명
	private int age;			// 회원나이
	private char gender;		// 성별
	private int couponCount;	// 요리학원쿠폰개수 = 0
	
	public Member() {}
	
	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String toString() {
		return "";
	}
}
