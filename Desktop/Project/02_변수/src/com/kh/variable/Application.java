package com.kh.variable;

import com.kh.variable.practice.B_KeyBoardinput;

public class Application {

	public static void main(String[] args) {
	 // 클래스 생성
//		A_Variable variable = new A_Variable();
	
	// 메소드 호출 (실행)
//		variable.printValue();
//		variable.declear();
//		variable.overflow();
//		variable.constant();
		
		// 클래스를 생성하고, 바로 호출 가능하다.
		// 주소값이 저장되지 않아 다른 메소드를 호출하기 위해서는 새로운 클래스를 생성해야한다.
	    new B_KeyBoardinput().inputByScanner();
	

  }
}
