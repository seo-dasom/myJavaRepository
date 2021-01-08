package com.kh.exam1;

import java.io.*;

/*
 *  throws
 *  	- 예외 처리하는 것을 상위 메서드에 미루는 의미를 가지지만
 *  	  예외가 발생한다는 것을 상위 메서드에 알려서 올바른 코드를 작성
 *  	  할 수 있도록 명시하는 목적도 있다.
 *  throw
 *  	- 강제로 예외를 발생 시키기 위해 사용
 *  	- 데이터 확인(Check)를 통해서 사용할 수 없는 형식의 데이터가 생성된 경우
 *  	  강제로 예외를 발생 시켜서 올바른 데이터가 입력 될 수 있게 만든다.
 */

class SamClass {
	public int divion(int x, int y) throws IOException {
		return x / y;
	}
}

public class Sample1 {

	public static void main(String[] args) throws IOException {
		SamClass sa = new SamClass();
		int res = 0;
		res = sa.divion(10, 1);
		System.out.println("결과 : " + res);
	}

}
