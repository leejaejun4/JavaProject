package chapter03.whileTest;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		// 숫자 암호(3자리) 해제
		/*
		 * 1.컴퓨터가 100~999 사이의 무작위 암호를 설정 2.사용자가 맞출 때까지 입력 3.틀릴 경우 "틀렸습니다. 다시 입력하세요." 출력
		 * 4.맞추면 "성공! 암호해제 완료" 5.몇 번 만에 맞췄는지 count 출력
		 */

		Scanner scan = new Scanner(System.in);
		int password = (int) (Math.random() * 900) + 100;// PC
		int userinput;
		int count = 0;

		do {
			System.out.print("비밀번호를 맞춰주세요: ");
			userinput = scan.nextInt(); // 나
			count++;
			if (userinput < password) {
				System.out.println("더 큰수를 작성해주세요.");
			} else if (userinput > password) {
				System.out.println("더 작은수를 작성해주세요.");
			}

		} while (userinput != password);

		System.out.println("성공! 암호 해제 완료 (시도 횟수: " + count + "번)");

	}

}
