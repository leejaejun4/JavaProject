package chapter03.switchtest;

public class SwitchCase_05 {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 10) + 1;

		switch (num) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6: {
			System.out.println(num + "점 획득");
			break;
		}
		default:
			System.out.println(num + "은(는) 잘못 입력된 숫자입니다.");
		}// switch

	}// main

}// class
