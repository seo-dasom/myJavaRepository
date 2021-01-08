package com.kh.exam2;

/*
 * 	사용자 정의 Exception 만들기
 */

class NegativeException extends Exception {
	public NegativeException() {}
	
	public NegativeException(String msg) {
		super(msg);
	}
//	@Override
//	public String getMessage() {
//		return "음수 값을 사용하면 안됩니다.";
//	}
}

class NegativeExceptionCheck {
	public void check(int i) throws NegativeException {
		if(i < 0) {
			throw new NegativeException("음수 안됨");
		}
	}
}

class SamClass {
	public int sum(int x, int y) {
		try {
			new NegativeExceptionCheck().check(x);
			new NegativeExceptionCheck().check(y);
			return x + y;
		} catch (NegativeException e) {
			e.printStackTrace();
			return 0;
		}
	}
}

public class Sample2 {

	public static void main(String[] args) {
		SamClass sa = new SamClass();
		int res = 0;
		res = sa.sum(10, 20);
		System.out.println("결과 : " + res);
	}

}
