package com.kh.first.practice;

public class ValuePrinter {
	
	public void printTest() {
//  1. 숫자 출력 -> 따옴표 없이 입력
	System.out.println(123); // 정수값을 출력 
	System.out.println(3.14); // 실수값을 출력 
	
//  2. 연산 결과 출력
	System.out.println(40 + 150); // 190
	System.out.println(1.23 - 0.12); // 1.11(x) 실수값 연산은 불완전해서 오차가 생길 수 있다.
	
// 3. 문자 출력 - 작은 따옴표로 감싼다 ('') 하나의 문자를 출력할 때 사용
	// 문자열은 ("") 큰 따옴표로 입력해야한다.
	System.out.println('a');
	System.out.println('b');
	// 문자와 숫자 연산시 문자를 자동으로 숫자로 인식한다.
	// 각 문자마다 컴퓨터가 인식하는 고유한 숫자값을 가지고 있다.
	System.out.println('b' + 1);	
// 4. 문자열 출력 - 큰 따움표로 감싼다 ("")
	System.out.println("안녕하세요.");
	System.out.println("반갑습니다.");
	
// 5. 문자열과 그 외의 값들을 덧셈연산 - 하나의 문자열로 연결해서 만들어준다.
	
	System.out.println("반갑습니다." + 123);
	System.out.println("반갑습니다." + "네에~");
	System.out.println("반갑습니다." + (40+150));
	

	}
	// 일반적인 메소드는 개발자가 임의로 지정한다. 여기선 "print"로 지정
	/*
	 * 네이밍 규칙 (관습적인)
	 *  1. 클래스명
	 *   - 대문자로 시작, 여러 개의 단어가 있을 때는 단어 앞자리마다 대문자로 표기 (낙타표기법 / 관습적으로 사용)
	 *  2. 메소드명
	 *   - 소문자로 시작, 여러 개의 단어가 있을 때는 단어 앞자리마다 대문자로 표기 (낙타표기법 / 관습적으로 사용)
	 */
}
