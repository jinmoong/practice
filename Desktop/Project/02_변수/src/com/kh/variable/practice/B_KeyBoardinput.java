package com.kh.variable.practice;

import java.util.Scanner;

public class B_KeyBoardinput {
	
	public void inputByScanner() {
	    Scanner scanner = new Scanner(System.in);
	    String name = "";
	    
	    System.out.println("당신의 이름은 무엇입니까?");
	    
	    name = scanner.nextLine();
	    
	    System.out.println("당신의 이름은 " + name + "입니다.");
	    
	
	}

}
