package chapter03.whileTest;

import java.util.Scanner;

public class WhileTest_06 {

	public static void main(String[] args) {
		// if -> 60점 이상이고 100점이하면 합격
		// 0이상이고 60점 미만이면 불합격
		// 그밖에 "0~100까지의 점수만 입력 가능합니다."
		// AND -> &&

		/*
		 * Scanner scan=new Scanner(System.in); int sum;
		 * 
		 * while(true) { System.out.println("Jave 교과목 점수를 입력하세요 : "); int
		 * scr=scan.nextInt();
		 * 
		 * if(scr > 100 || scr <= 0){ System.out.println("정확한 숫자를 입력해주세요"); }else if
		 * (sum >= 60 ; sum <= 60){ System.out.println( scr + "합격입니다.");
		 */

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("Jave 교과목 점수를 입력하세요 : ");
			int scr = scan.nextInt();

			if (scr < 60 && scr > 100) {
				System.out.println("합격");
				break;
			} else if (scr > 0 && scr < 60) {
				System.out.println("불합격");
				break;
			} else {
				System.out.println("0~100까지의 점수만 입력 가능합니다.");
				break;
			} // if

		} // while
		System.out.println("프로그램 종료");

	}// main

}// class
