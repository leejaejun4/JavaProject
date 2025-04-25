package chapter11;

public class StaticInner_03 {

	// 멤버변수
	int a = 10; // stack영역
	private int b = 100;
	static int c = 200;

	// 생성자
	// 메서드
	// 내부 클래스(Data 영역)
	static class Inner {

		// 필드
		static int d = 1000;

		// 생성자
		// 메서드
		public void printData() {
			// Data 영역이 아니여서 사용할 수 없음
			// System.out.println("int a: " + a);
			// System.out.println("private int b: " + b);
			System.out.println("static int c: " + c);
			System.out.println("private int d: " + d);
		}// printData

	}// Inner class

//-------------------------------------------------------------
	public static void main(String[] args) {

		Inner inner = new Inner();
		inner.printData();

	}

}
