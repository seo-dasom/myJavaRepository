package com.kh.practice.token.view;

import java.util.*;
import com.kh.practice.token.controller.*;

public class TokenMenu {
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		String menuStr = new String("");
		menuStr += "1. 지정 문자열\n";
		menuStr += "2. 입력 문자열\n";
		menuStr += "3. 프로그램 끝내기\n";
		menuStr += "메뉴 번호 : ";
		while(true) {
			System.out.println(menuStr);
			switch(this.sc.next()) {
				case "1":
					this.tokenMenu();	break;
				case "2":
					this.inputMenu();	break;
				case "3":
					System.out.println("프로그램을 종료합니다.");
					System.exit(0); 	// break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		str = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : " + str);
		System.out.println("토큰 처리 후 개수 : " + str.length());
		System.out.println("모두 대문자로 변환 : " + str.toUpperCase());
	}
	
	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		String str = tc.firstCap(sc.next());
		System.out.println("첫 글자 대문자 : " + str);
		System.out.print("찾을 문자를 하나 입력하세요 : ");
		char c = sc.next().charAt(0);
		int count = tc.findChar(str, c);
		System.out.println(c + " 문자가 들어간 개수 : " + count);
	}
}
