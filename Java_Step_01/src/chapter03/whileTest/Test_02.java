package chapter03.whileTest;

import javax.swing.JOptionPane;

public class Test_02 {

	public static void main(String[] args) {
		// 비밀번호를 맞출 수 있는 기회는 3번.
		// 3번 틀리면 "계정이 잠겼습니다."를 출력하고 프로그램 종료.
		// 맞추면 "접속 성공!"

		int attempts = 0;
		int PW;
		int pw = 123456;

		do {
			PW = Integer.parseInt(JOptionPane.showInputDialog("비밀 번호를 입력해주세요"));
			if (PW == pw) {
				JOptionPane.showMessageDialog(null, "접속 성공!");
				System.out.println("접속 허용.");
				break;
			} else {
				attempts++;
				if (attempts <= 3) {
					System.out.println("비밀번호가 틀렸습니다. (" + attempts + " / 3)");
				}
			}
		} while (attempts < 3);

		if (attempts == 3) {
			JOptionPane.showMessageDialog(null, "계정이 잠겼습니다.");
			System.out.println("계정이 잠겼습니다.");
		}

	}

}
