package chapter03.whileTest;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {

		boolean run = true;
		int balance = 0; // 예금 ( + ) 출금 ( - )

		Scanner scan = new Scanner(System.in);

		// 1. 예금 | 2.출금 | 3.잔고 | 4.종료
		while (run) {

			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.println("선택> ");
			int menuNum = scan.nextInt();

			// 선택한 값으로 은행업무 수행
			switch (menuNum) {
			case 1:
				System.out.println("예금액> ");
				int money = scan.nextInt();
				balance += money;
				break;
			case 2:
				System.out.println("출금액> ");
				int money1 = scan.nextInt();
				balance -= money1;
				break;
			case 3:

				System.out.print("잔고> " + balance);
				break;
			case 4:
				run = false;
				break;
			}// switch
			System.out.println();
		} // while
		System.out.println("프로그램 종료");

	}

}
