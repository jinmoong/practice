package com.kh.first;

import com.kh.first.practice.ValuePrinter;

/*
  주석(Comment)
   - 소스 코드와는 무관하고 코드로 인식되지 않는다.
   - 주로 코드에 대한 설명을 작성할 때 사용한다.
 */

// 한 줄 주석

/**
 * 도큐먼트 주석
 *  - 도큐먼트 주석은 javadoc.exe API 도큐먼트를 생성하는데 사용된다.
 *  
 * @author eunjinlee
 *
 */

// 클래스 명은 클래스 파일명과 동일해야 한다.
// 클래스 안에는 여러 개의 메소드 가질 수 있고 메소드 안에 소스코드를 작성한다.
public class Application {

// main 메소는프로그램의 시작점으로
// java.exe가 Application.class를 실행시킬 때 실행되는 메소드이다.
	public static void main(String[] args) {
	// 1. 실행할 메소드가 있는 클래스를 생성(new) 해야 한다.
	// [표현법]
	// 클래스명 사용할 이름 = new 클래스명 ();
	
	// 방법 1)  import 문을 사용하지 않고 클래스 생
    //com.kh.first.practice.ValuePrinter printer = new com.kh.first.practice.ValuePrinter ();
	
    // 방법 2) import 문을 사용하여 클래스 생성 
	// com + shift + o 키를 누르면 자동으로 import문이 정리된다.
	// com + . 키를 누르면 에러가 발생한 곳으로 이동한다.
	// com + 1 키를 누르면 해당 에러에 대한 해결 방법을 제시해준다.
    ValuePrinter printer = new ValuePrinter();
    

    
			
	// 2. 클래스를 생성 -> 메소드를 호출(실행) 
	// [표현법]
	// 사용할이름.호출할메소드명();
    printer.printTest();
    
	

		
		
		
	}

}