package chapter03.iftest;

import java.util.Scanner;

public class IfTest_01 {

	public static void main(String[] args) {
		// 삼항연산자
		/*
		Scanner scan=new Scanner(System.in);
		System.out.println("나이를 입력하세요: ");
		int age=scan.nextInt();
		
		String str=age>=8 ? "학교에 다닙니다. " : "학교에 다니지 않습니다.";
		System.out.println(str);
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("나이를 입력해주세요: ");
		
		int age=scan.nextInt();
		
		if(age>=8){
		System.out.println("학교에 다닙니다.");

	}
		//System.out.println("학교에 다니지 않습니다. ");
		System.out.println();
		
		//#3.if ~ else
		
		System.out.println("나이를 입력해주세요: ");
		int age2=scan.nextInt();
		if(age2>=8){
			System.out.println("학교에 다닙니다.");
		}else {
			System.out.println("학교에 다니지 않습니다. ");
		}
			

	}
}