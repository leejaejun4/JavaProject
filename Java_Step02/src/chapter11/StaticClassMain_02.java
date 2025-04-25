package chapter11;

import javax.swing.JOptionPane;

class Out2 {

	// 멤버변수
	static int a = 1;
	int b; // 객체마다 서로 다른 값을 가질 수 있음

	public static class In {

		// 메서드
		String Infun() {
			return a + "번째 static 내부 클래스";
		}// Infun

	}// In class
}// out class

public class StaticClassMain_02 {

	public static void main(String[] args) {
		// static 클래스는 직접 접근이 가능함
		Out2.In obj1 = new Out2.In();
		// 내부 클래스 메서드
		String str = obj1.Infun();
		JOptionPane.showMessageDialog(null, str + "\n syccess");

	}

}
