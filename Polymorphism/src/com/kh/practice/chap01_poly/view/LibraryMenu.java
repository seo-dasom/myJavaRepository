package com.kh.practice.chap01_poly.view;

import java.util.Scanner;
import com.kh.practice.chap01_poly.controller.*;
import com.kh.practice.chap01_poly.model.vo.*;

public class LibraryMenu {
	private Scanner sc = new Scanner(System.in);
	private LibraryController lc = new LibraryController();
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String memName = sc.next();
		System.out.print("나이 : ");
		int memAge = sc.nextInt();
		System.out.print("성별 : ");
		char memGender = sc.next().charAt(0);
		
		Member newMem = new Member(memName, memAge, memGender);
		lc.insertMember(newMem);
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.println(lc.myInfo().toString());
				continue;
			} else if(select == 2) {
				selectAll();
				continue;
			} else if(select == 3) {
				searchBook();
				continue;
			} else if(select == 4) {
				rentBook();
				continue;
			} else if(select == 9) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("잘못된 메뉴 번호입니다. 다시 입력해주세요.");
				continue;
			}
		}
	}
	
	public void selectAll() {
		
	}
	
	public void searchBook() {
		
	}
	
	public void rentBook() {
		
	}
}
