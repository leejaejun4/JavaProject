package chapter03.switchtest;

import javax.swing.JOptionPane;

public class Example03 {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("등급을 입력하세요 (A~F): ");

		// nu11 (아무것도 입력안된 상황) -> Stting str=null
		// isEmpty(문자길이가 0) -> String str ="";

		// if문으로 input == nu11이거나 input.isEepty() 면 메세지 박스를 이용하여 출력
		// 입력값이 없습니다.
		if (input == null || input.isEmpty())
			JOptionPane.showMessageDialog(null, "입력 값이 없습니다");
		// 'A' 'B' 'C' 'D' 'F'
		// toUpperCase:대문자로 변환

		char grade = Character.toUpperCase(input.charAt(0));
		String message;

		// switch 사용

		switch (grade) {
		case 'A':
			message = "매우 우수한 성적입니다.";
			break;
		case 'B':
			message = "우수한 성적입니다.";
			break;
		case 'C':
			message = "평균적인 성적입니다.";
			break;
		case 'D':
			message = "보통입니다.";
			break;
		case 'E':
			message = "노력이 필요합니다.";
			break;
		case 'F':
			message = "분발하세요.";
			break;
		default:
			message = "없는 등급 입니다.";
			break;

		}
		JOptionPane.showMessageDialog(null, "당신은 " + grade + "등급입니다" + "\n코멘트: " + message);

		// MessageDialog 출력

	}

}
