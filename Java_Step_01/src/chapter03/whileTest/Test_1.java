package chapter03.whileTest;

import javax.swing.JOptionPane;

public class Test_1 {

	public static void main(String[] args) {
		// 사용자가 비밀번호를 설정하고, 프로그램은 그 비밀번호가 맞게 입력될 때까지 반복해서 입력을 요구한다.
		// 입력이 맞으면 "접속 성공!"을 출력한다.

		int pw;
		int PW = 123456;

		do {
			pw = Integer.parseInt(JOptionPane.showInputDialog("비밀 번호를 입력해주세요"));
			if (pw == PW) {
				System.out.println("접속 성공!");
			} else {
				System.out.println("접속 실패");
			}

		} while (pw != PW);

	}

}
