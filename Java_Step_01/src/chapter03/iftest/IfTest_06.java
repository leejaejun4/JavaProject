package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfTest_06 {

	public static void main(String[] args) {
		// 두수를 입력받아 어떤 수가 큰지 판단하는 프로그램
		// num1, num2 의 수가 num1이 큽니다. 또는 num2가 큽니다. 또는 같습니다의 결과가 나오도록 구현
		// 그외값은 다시 입력하세요 로 출력
		
		int num1;
		int num2;
		
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("첫번째 숫자를 입력해주세요: "));
		num2=Integer.parseInt(JOptionPane.showInputDialog("두번째 숫자를 입력해주세요: "));
		
		if(num1 > num2) {
			System.out.println("큰 수 값 입니다: "+ num1);
			System.out.println("number1" + "값이 큽니다.");
		}else if (num1 < num2) {
			System.out.println("큰 수 값 입니다: "+ num2);
			System.out.println("number2" + "값이 큽니다.");
		}else if (num1 == num2){
			System.out.println("num1과 num2에 입력 값이 동일합니다.");
		}else {
			System.out.println("다시 입력해주세요");
			
		}
			
		
		
		
		
		
		
	}


}
