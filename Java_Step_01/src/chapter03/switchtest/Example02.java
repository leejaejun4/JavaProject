package chapter03.switchtest;

import javax.swing.JOptionPane;

public class Example02 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 요일을 입력받아(1~7) 해당 요일에 어떤 음식을 먹을지 출력하는 프로그램을 작성하세요.
		 * (월요일:떡볶이,화요일:스파게티,------,일요일:초밥)-->여러분이 먹고싶은거 아무거나
		 */

		// Scanner scan = new Scanner(System.in);
		// System.out.print("원하시는 요일에 맞는 숫자를 입력해주시면 음식을 골라드려요!");
		// food = scan.nextInt();
		String str = JOptionPane.showInputDialog("요일을 입력하세요");
		String cooking;

		switch (str) {
		case "월요일":
			cooking = "샌드위치 ";
			break;

		case "화요일":
			cooking = "라멘";
			break;

		case "수요일":
			cooking = "텐동";
			break;

		case "목요일":
			cooking = "삼겹살";
			break;

		case "금요일":
			cooking = "피자";
			break;

		case "토요일":
			cooking = "치킨";
			break;

		case "일요일":
			cooking = "짜장면";
			break;
		default:
			cooking = "없는 요일 입니다.";
		}

		JOptionPane.showMessageDialog(null, cooking + "이 준비 되었습니다.");

		/*
		 * 
		 */

		// switch

	}// main

}
