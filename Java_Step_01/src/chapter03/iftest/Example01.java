package chapter03.iftest;

import javax.swing.JOptionPane;

public class Example01 {

	public static void main(String[] args) {
		// wizard라는 이름과 일치하면 문이 열리고 
		//문이 열린후 퀴즈의 답은 fire다 퀴즈까지 맞히면 정답입니다 동굴의 문이 열립니다
		// 이름이 일치하지 않으면 "이름이 틀렸습니다. 접근이 거부됩니다"
		//이름은 일치 하지만 답변이 틀림 퀴즈의 답이 틀리면 "틀렸습니다."
		
		String ID="wizard";
		String PW="fire";
		
		String id=JOptionPane.showInputDialog("이름을 입력해주세요");
		
		if(ID.equals(id)) {
			String pass=JOptionPane.showInputDialog("퀴즈를 입력해주세요");
			if (PW.equals(pass)) {
				System.out.println("정답입니다 문이 열립니다.");
			}else {
				System.out.println("틀린 답입니다 문이 열리지 않습니다");
			}
		} else {
			System.out.println("이름이 틀렸습니 접근이 거부됩니다.");
		}
		
		/*
		 * String correctName = "wiazrd"
		 * String correctAnswer = "fire"
		 * 
		 * scanner scan = new Scanner(System.in);
		 * 
		 * System.out.println("---비밀동굴---")
		 * System.out.print("당신의 이름을 입력하세요")
		 * String name=scan.nextLine();
		 * 
		 *equalsIgnireCass: 대문자 구분 없이 비교
		 * if(correctName.equalsIgnoreCase(name)) {
		 * System.out.println("\n[문지기] 오, 위대한 마번사여. 마지막 관문은 퀴즈로 정해졌소.");
		 * System.out.println("문제: 불, 물 바람 중에서 드래곤이 가장 두려워하는 것은?.");
		 * System.out.println("정답을 입력하세요: ");
		 * String answer = scan.nextLine();
		 * 
		 * if(correctAnswer.equalsIgnoreCase(answer)) {
		 * System.out.println("정답입니다. 동굴의 문이 열립니다.. 들어가세요");
		 * }else {
		 * System.out.println("틀렸습니다. 드래곤이 소환 됩니다 맞서 싸우세요");
		 * }
		 * }else {
		 * System.out.println("이름이 틀렸습니다. 접근이 거부 되었습니다.");
		 * }//out if
		 * 
		 */
		

	}

}
