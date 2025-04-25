package chapter02;

import java.util.Scanner;

public class Example_08 {

	public static void main(String[] args) {
		// 두 개의 숫자를 입력 받아서 첫 번째(num1) 숫자가 두 번째(num2) 숫자보다
		// 큰지 여부를 출력하는 프로그램을 작성하
		
		Scanner scan=new Scanner(System.in);
		System.out.print("첫 번째 숫자입력 : " );
		int num1 = scan.nextInt();
		System.out.print("두 번째 숫자입력 : " );
		int num2 = scan.nextInt();
		
		String result;
		result= (num1 > num2) ? "큽니다." :(num1 == num2) ? "값이 동일합니다":"작습니다.";		
		System.out.print(result);
		
		
	

	}

}
