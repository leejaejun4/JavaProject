package chapter05;

public class MethodTest_13 {

	public static void main(String[] args) {

		int sum = add(5, 7);
		double sumDouble = add(3.5, 7.2);

	}
	// 정수의 합

	// 실수의 합
	public static int add(int a, int b) {
		int sum;
		sum = a + b;
		System.out.println(a + "와" + b + "의 합은: " + sum);

		return sum;
	}

	public static double add(double a, double b) {
		double sumdouble;
		sumdouble = a + b;
		System.out.println(a + "와" + b + "의 합은: " + sumdouble);

		return sumdouble;
	}
}
