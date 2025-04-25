package chapter02;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		// #1
				// 삼항연산자를 이용하여 score1이 60 보다 크거나 같으면 합격
				// 그렇지 않으면 불합격으로 반환 하시오.
				// 조건?합격:불합격
		// #2
				// 삼항연산자를 이용하여 score2가 90보다 크면 'A'이고
				// score2가 80보다 크면 'B' 그 이하는 모두 'C'로 간주한다
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력: ");
		int score1 = scan.nextInt();
		
		String result;
		result= score1 >=60 ? "합격" : "불합격";
		System.out.println(result);
		System.out.println("---------------------");
		
				
		System.out.println("입력: ");
		int score2 = scan.nextInt();
		
		//String result1;
		//result= score2 >=90 ? "A" : "B";
		//result= score2 >=80 ? "B" : "C";
		
		char grade = score2 > 90 ? 'A' : score2 > 80?'B':'C';
				
		System.out.println(grade);
		
		
		
		
		
	}

}
