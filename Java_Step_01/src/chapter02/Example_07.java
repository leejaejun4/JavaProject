package chapter02;

import java.util.Scanner;

public class Example_07 {

	public static void main(String[] args) {
		// 한 자릿수 숫자를 입력받아 (scan)
		// 숫자가 짝수인지 홀수인지 출력하는 프로그램(삼항 연산자 사용)
		
		Scanner scan = new Scanner(System.in);
		System.out.print("수 입력: ");
		int num = scan.nextInt();
		
		String result;
		result= num % 2==0 ? "짝수 입니다." : "홀수 입니다.";
		System.out.print(result);
		

	}

}
