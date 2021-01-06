package com.kh.practice.student.model.vo;

// 학생 슈퍼클래스
// 초등학생, 중학생, 고등학생, 대학생
// 클래스별로 파일 개별 생성

public class Student {
	private String name;		// 이름
	private String subject;		// 과목
	private int score;			// 점수
	
	public Student() {};
	
	public Student(String name, String subject, int score) {
		this.name = name;		this.subject = subject;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String inform() {
		// Student 클래스의 모든 필드 값들을 합쳐 반환
		String result = "";
		result += "이름 : " + this.name + " / ";
		result += "과목 : " + this.subject + " / ";
		result += "점수 : " + this.score;
		return result;
	}
}
