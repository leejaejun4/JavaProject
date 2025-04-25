package chapter05;

public class Example05 {
	public static int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		// 반환값이 있는 메소드
		int result = sum(num1, num2);
		System.out.println("반환값 출력: " + result);

		// 반환값이 없는 메소드
		total(num1, num2);

	}

	private static void total(int num1, int num2) {
		int result = sum(num1, num2);
		System.out.println("출력: " + num1 + "," + num2 + "합:" + result);

	}

}
