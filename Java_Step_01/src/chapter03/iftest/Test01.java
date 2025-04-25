package chapter03.iftest;

import javax.swing.JOptionPane;

public class Test01 {

	public static void main(String[] args) {
		/*
		 * 전시관으 ㅣ입장료는 미취학 아동은 1000원 ->7 전시관의 입장료는 초등학생은 2000원 ->13 전시관의 입장료는 중,고등학생은
		 * 3500원 -19 전시관의 입장료는 성인은 5000원 -> 20
		 */

		int age;
		int charge = 0;

		age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력해주세요"));

		if (age > 150 || age < 0) {
			System.out.println("정확한 나이를 입력해주세요.");
		} else if (age <= 7) {
			System.out.println("미취학 아동");
			charge = 1000;
		} else if (age <= 13) {
			System.out.println("초등학생");
			charge = 2000;
		} else if (age <= 19) {
			System.out.println("중,고등학생");
			charge = 3500;
		} else if (age >= 20) {
			System.out.println("성인");
			charge = 5000;
		} else if (age <= 60) {
			System.out.println("노약자");
		}
		System.out.println("전시관 입장료는: " + charge + "원 입니다.");
	}

}
