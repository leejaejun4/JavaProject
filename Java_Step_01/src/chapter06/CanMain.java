package chapter06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int money = 0;

		// 음료 준비
		Vending ven = new Vending();
		ven.init();
		System.out.print("돈을 투입하세요: ");
		money = Integer.parseInt(scan.nextLine());// 돈 투입
		ven.showCan(money);// 1100
		System.out.println("===========================");

		System.out.println("음료를 선택하세요: ");
		String select = scan.next();
		ven.outCan(select);

	}

}
