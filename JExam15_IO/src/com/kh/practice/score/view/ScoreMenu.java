package com.kh.practice.score.view;

import java.util.Scanner;
import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	
	public void mainMenu() {
		int input;
		System.out.println("1. 성적 저장");
		System.out.println("2. 성적 출력");
		System.out.println("9. 끝내기");
		while(true) {
			System.out.print("메뉴 번호 : ");
			input = sc.nextInt();
			switch(input) {
				case 1:
					saveScore();
					break;
				case 2:
					readScore();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				default :
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					continue;
			}
		}
	}
	
	public void saveScore() {
		int num = 0;
		System.out.println(num + "번 째 학생 정보 기록");
		System.out.print("이름 : ");
		System.out.print("국어 점수 : ");
		System.out.print("영어 점수 : ");
		System.out.print("수학 점수 : ");
	}
	
	public void readScore() {
		int count = 0;
		int sumAll = 0;
		double avgAll = 0.0;
	}
}
