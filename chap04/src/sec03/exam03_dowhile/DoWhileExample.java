package sec03.exam03_dowhile;

import java.util.Scanner;		//ctrl+shift+o

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		int i = 0;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();			//엔터키를 누르기 전까지의 입력된 문자열을 한꺼번에 스캔
			System.out.println(inputString);			//출력
		} while(!inputString.equals("q"));			//inputSting에 q가 입력되면 false가 되어 프로그램 중지ㅂ
		
		System.out.println();
		System.out.println("프로그램 종료");
		
	}

}
