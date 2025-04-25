package chapter03.iftest;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class IfTest_05 {

	public static void main(String[] args) {
		/*BMI = 체중(kg) / 신장 (m) *2
		 * 25이상: 과체중
		 * 18.5이상 25 미만: 정상
		 * 18.5 미만: 저체중
		 */
		
		/*double weight=Double.parseDouble(JOptionPane.showInputDialog("몸무게(kg)를 입력하세요"));
		double height=Double.parseDouble(JOptionPane.showInputDialog("신장(cm)를 입력하세요"));
		
		double BMI = weight/(height * height);
		
		if(BMI >= 25) {
			System.out.println("과제중입니다.");
		}else if (BMI >= 18.5 && BMI < 25 ) {
			System.out.println("정상 체중입니다.");
		}else if (BMI >= 18.5 && BMI <25 ){
			System.out.println("저체중 입니다.");
		}
			*/
		
		double weight=Double.parseDouble(JOptionPane.showInputDialog("몸무게(kg)를 입력하세요"));
		double height=Double.parseDouble(JOptionPane.showInputDialog("신장(cm)를 입력하세요"))/100.0;
		
		double BMI = weight/(height *2);
		String result=" ";
		
		if(BMI >=25) {
			result="과체중";
		}else if(BMI >= 18.5) {
			result="정상체중";
		}else {
			result ="저체중";
		}
		
		System.out.printf("당신의 BMI는 %2f 이며, %s 입니다." , BMI, result);
				
				
		
		
		

	}

}
