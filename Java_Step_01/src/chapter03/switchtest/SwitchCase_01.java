package chapter03.switchtest;

public class SwitchCase_01 {

	public static void main(String[] args) {

		int ranking = 1;
		char madalColor;

		// Jump Table
		switch (ranking) {
		case 1: {

			madalColor = 'G';
			break;

		}
		case 2: {

			madalColor = 'S';
			break;

		}
		case 3: {

			madalColor = 'B';
			break;

		}
		default: {
			madalColor = 'A';
		}

		}// switch

		System.out.println(ranking + "등 메달은 " + madalColor + "입니다");

		System.out.println("-----------------------------------------------");

		if (ranking == 1) {
			madalColor = 'G';
		} else if (ranking == 2) {
			madalColor = 'S';
		} else if (ranking == 3) {
			madalColor = 'B';
		} else {
			madalColor = 'A';
		}
		System.out.println(ranking + "등 메달은 " + madalColor + "입니다");

	}// main

}// class
