package com.kh.variable.practice;

public class A_Variable {
	public void printValue() {
		// 변수를 사용하지 않았을 경우
		System.out.println(2 * 3.141592653589793 * 10);
		System.out.println(3.141592653589793 * 10 * 10);
		System.out.println(3.141592653589793 * 10 * 10 * 20);
		System.out.println(4 * 3.141592653589793 * 10 * 10);
		System.out.println(); // 콘솔에서 줄바꿈을 위해서 호출
		
		// 변수를 사용하면
		double pi = 3.141592653589793;
		int r = 10;
		int h = 20;
		
		System.out.println(2 * pi * r);
		System.out.println(pi * r * r);
		System.out.println(pi * r * r * h);
		System.out.println(4 * pi * r * r);
		
	}
    public void declear() {

	  /*
	   *  변수의 선언
	   *   [표현법]
	   *     자료형 변수명; 
	   *    
	   *    - 자료형은 어떤 값을 저장할지, 어떤 크기의 메모리를 할당 받을지에 대한 정보
	   *    - 변수명은 변수의 이름으로 값을 읽고, 쓰고, 지우고 변경하는 작업을 한다.
	   */
	   
      // 논리형
    	 boolean isTrue; // 1byte의 논리값을 담을 수 있는 변수를 선
    
     //  정수형
         byte bNum; // 1byte의 정수를 담을 수 있는 변수를 선언
         byte sNum; // 2byte의 정수를 담을 수 있는 변수를 선언
         int iNum; // 4byte의 정수를 담을 수 있는 변수를 선언
         long lNum; // 8byt의 정수를 담을 수 있는 변수를 선언
      
     //  실수형
         float fNum; // 4byte의 실수를 담을 수 있는 변수를 선언
         double dNum; // 8byte의 실수를 담을 수 있는 변수를 선언
         
     // 문자형
//         char ch; // 2byte의 문자를 담을 수 있는 변수를 선언 * 음수값은 넣을 수x
        char ch = 'a';
     
        		
     // 문자열
//         String name; // 문자열을 가리킬 수 있는 참조형 변수를 선언
//         String name = "문인수";
//         String name = new String ("문인수");
        String name = "문인수";
        
     // 변수의 명명 규칙 
     // 1) 대소문자 구분
      int number;
//    String number; // 자료형이 달라도 변수명이 같으면 오류 발생
      int NUMBER;
      int NumBer;
      // 2) 예약어를 사용할 수 없다. (변수,클래스, 메소드 등등)
//      int double;
//      int void;
//      int public;
       
      // 3) 숫자로 시작하면 안 된다.
//      int 1age;
      int age1;
      
      // 4) 특수 문자는 '_', '$' 만 사용이 가능하다.
      int _age;
      int $age;
//      int @age;
//      int %age;
 
      
      
      
       
      /*
       *  변수의 초기화
       *    [표현식]
       *       변수명 = 값; 
       *       
       *     - "="는 오른쪽에 데이터를 왼쪽의 변수에 대입 (저장)하는 연산자이다.
       */
       
     // 선언 후 초기화
        isTrue = false;
        
        
     // 로컬 변수를 생성 후 초기화가 되지 않은 경우 사용하려고 하면 에러가 발생
     // 로컬변수 : 메소드안에서 선언되는 변
     // System.out.println("bNum : " + bNum);
        
     bNum = 11;
     sNum = 12;
     iNum = 300;
     // 정수형 리터럴은 기본적으로 int 컴파일 된다. 따라서 long타입은 숫자 뒤에 l.L 붙여야한다.
     lNum = 3456342324934434l;

     // 실수형 리터럴은 기본적으로 double로 컴파일 된다.
     // float 타입의 리터럴은 숫자뒤에 F또는 f를 입력해야 한다.
     fNum = 3.14f;
     // double 타입의 리터럴에서 숫자뒤에 D 또는 d 생략이 가능하다.
     dNum = 1.23425235;
     
     System.out.println("isTrue : " + isTrue);
     System.out.println("bNum : " + bNum);
     System.out.println("sNum : " + sNum);
     System.out.println("iNum : " + iNum);
     System.out.println("lNum : " + lNum);
     System.out.println("fNum : " + fNum);
     System.out.println("dNum : " + dNum);
     System.out.println("ch : " + ch);
     System.out.println("name : " + name );
     }
    public void overflow() {
    	// byte 자료형의 저장 범위 : -128 ~ 127
    	byte bNum = 127;
    	byte result = (byte)(bNum + 1);
    	// (byte) 형태로 변환 해준 것, 일반적으로 프로그램에서 정수를 int로 인식
    	
       System.out.println("bNum : " + bNum);
       System.out.println("result : " + result);
       // 범위표현은 우선은 참고로 
//       System.out.println(Byte.MIN_VALUE);
//       System.out.println(Byte.MAX_VALUE);
//       System.out.println(Short.MAX_VALUE);
//       System.out.println(Short.MIN_VALUE); 
       
       // 상수의 선언
    
    }
    public void constant() {
    	/*
    	 * 상수
    	 *   [표현법]
    	 *     final 자료형 변수명;
    	 *     
    	 *   - 변하지 않는 값으로 특정 수의 값이 변경되는 걸 원하지 않을 때 사용한다.
    	 *   - 초기화 이후에는 값을 변경할 수 없다.  
    	 */
    	
        int age;
        final int AGE;
        
        age = 20;
        AGE = 30;
        
        System.out.println("age : " + age);
        System.out.println("AGE : " + AGE);
        
        age = 25;
//        AGE = 35;  이미 초기화가 되었기 때문에 변경이 불가능하다.
        
        
    }
        

}

