package chapter03.iftest;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		/*놀이공원에서는 12세 이상이거나 키가 140cm 이상이어야 놀이기구를 탈 수 있다.
		사용자에게 나이와 키를 입력받아, 놀이기구를 탈 수 있는지 출력하는 프로그램을 if문으로 작성하세요
		
		
		나이를 입력하세요: 10  
		키를 입력하세요(cm): 145  
		=> 탑승 가능합니다!

		나이를 입력하세요: 9  
		키를 입력하세요(cm): 130  
		=> 탑승 불가입니다.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요: ");
		int age = scan.nextInt();
		
		System.out.print("키를 입력하세요: ");
		int height = scan.nextInt();
		
		if(age >=12 || height>=145) {
			System.out.println("탑승 가능합니다.");
			}else {
				System.out.println("탑승 불가능합니다.");
			}
		
		scan.close();

	}

}
