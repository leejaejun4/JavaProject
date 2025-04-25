package chapter10.Interface;

public interface Calc {

	double PI = 3.14;
	int ERROR = -9999999;

	int add(int num1, int num2);

	int substaract(int num1, int num2);

	int times(int num1, int num2);

	int divide(int num1, int num2);

	// 자바 8부터 제공 -> 기본 수행문을 구현할떄 사용(재정의 가능)
	default void description() {
		System.out.println("정수 계산기");
		myMethod();// private 메서드 호출
	}

	// private 현재의 클래스에서만 사용가능
	private void myMethod() {
		System.out.println("private 메서드");
	}

	static int total(int[] arr) {
		int total = 0;

		for (int i : arr) {
			total += i;
		}
		mystaticMethod();// private static 메서드 호출
		return total;
	}

	// 정적메서드 -> 객체 생성과 상관없이 클래스명으로 호출가능
	private static void mystaticMethod() {
		System.out.println("private static 메서드");
	}

}
