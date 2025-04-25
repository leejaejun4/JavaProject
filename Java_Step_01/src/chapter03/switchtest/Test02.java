package chapter03.switchtest;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		int month;

		Scanner scan = new Scanner(System.in);
		System.out.println("계절을 알려드립니다");
		System.out.print("계절을 입력해주세요: ");

		month = scan.nextInt();

		switch (month) {
		case 1:
		case 2:
		case 12:
			System.out.println(month + "월은 겨울 입니다");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(month + "월은 봄 입니다");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "월은 여름 입니다");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "월은 가을 입니다");
			break;

		default:
			System.out.println("존재하지 않는 월 입니다");

		}

	}

}
