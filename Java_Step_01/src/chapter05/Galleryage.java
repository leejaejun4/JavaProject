package chapter05;

import javax.swing.JOptionPane;

public class Galleryage {

	public void gallery() {
		System.out.println("미술관 입장 금액입니다.");
	}

	void order() {

		int age;
		int charge = 0;

		age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력해주세요."));

		if (age > 150 || age < 0) {
			System.out.println("나이를 정확하게 입력해주세요.");
		} else if (age <= 7) {
			System.out.println("미취학");
			charge = 1000;
		} else if (age <= 13) {
			System.out.println("초등학생");
			charge = 1500;
		} else if (age <= 19) {
			System.out.println("중,고등학생");
			charge = 3000;
		} else if (age < 60) {
			System.out.println("성인");
			charge = 5000;
		} else {
			System.out.println("노약자");
			charge = 0;
		}
		System.out.println("미술관 요금은:" + charge + "원 입니다.");

	}
}
