package chapter11;

import javax.swing.JOptionPane;

class Out {

	static int a = 1;

	// 생성자

	// 메서드

	// 내부 클래스
	public class In {

		// 멤버 변수

		// 생성자

		// 메서드
		public String Infun() {

			return a + "번째 Non-Static 내부";
		}

	}// In class
}// out class

public class NonStatic_01 {

	public static void main(String[] args) {

		// #1 Out class 객체
		Out obj1 = new Out();
		// #2 In class 객체
		Out.In obj2 = obj1.new In();
		String str = obj2.Infun();

		JOptionPane.showMessageDialog(null, str + "\n Syccess");

	}

}