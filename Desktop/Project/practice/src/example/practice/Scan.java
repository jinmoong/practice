package example.practice;

import java.util.Scanner;

public class Scan {
	
	public void angel() {
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		System.out.println("당신은 누구십니까 ?");
		name = scanner.nextLine();
		System.out.println("당신은" + name + "입니다.");
		
	}

}
