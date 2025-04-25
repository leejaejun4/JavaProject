package chapter03.whileTest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		/*
		 * 사용자가 "no"를 입력하기 전까지 계속해서 메시지를 입력받고, 출력하는 프로그램을 만들어보세요. (do-while사용)
		 */

		/*
		 * Scanner scan = new Scanner(System.in); int s;
		 * 
		 * System.out.println("메시지를 입력하세요."); System.out.println("종료하려면 no를 입력하세요.");
		 * 
		 * int inpuString;
		 * 
		 * do { inpuString =
		 * Integer.parseInt(JOptionPane.showInputDialog("메세지를 입력하세요.(no를 입력시 종료 됩니다)"));
		 * s = inpuString; } while (!inpuString.equals("no"));
		 * 
		 * System.out.println(); System.out.println("프로그램 종료");
		 */

		Scanner scan = new Scanner(System.in);
		int s;

		System.out.println("메시지를 입력하세요.");
		System.out.println("종료하려면 no를 입력하세요.");

		String inpuString;
		do {

			System.out.print("> ");
			inpuString = scan.next();
			System.out.println(inpuString);
		} while (!inpuString.equals("no")); // no 입력하면 실행 멈춤

		System.out.println();
		System.out.println("프로그램 종료");

	}// m

}// c
