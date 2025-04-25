package chapter_08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Example p = new CalPlus(); Example m = new CalsMinus();
		 * 
		 * int resultPlus = p.getResult(20, 10); int resultMinus = m.getResult(20, 5);
		 * 
		 * System.out.println("CalPius: " + resultPlus); System.out.println("CalMinus: "
		 * + resultMinus);
		 */

		Scanner s = new Scanner(System.in);

		// 방법1
		Example[] calExamples = { new CalPlus(), new CalsMinus() };

		System.out.print("정수 A를 입력하세요: ");
		int a = s.nextInt();
		System.out.print("정수 B를 입력하세요: ");
		int b = s.nextInt();

		for (Example ca : calExamples) {
			System.out.println(ca.getClass().getSimpleName() + ": " + ca.getResult(a, b));
		}
		System.out.println();

		// 방법2
		int plus = calc(new CalPlus(), a, b);
		System.out.println("두 수의 합: " + plus);
		int minus = calc(new CalsMinus(), a, b);
		System.out.println("두 수의 차: " + minus);
		System.out.println();

		// 방법3
		System.out.println("두 수의 합: " + calc(new CalPlus(), a, b));
		System.out.println("두 수의 차: " + calc(new CalsMinus(), a, b));

	}

	public static int calc(Example c1, int a, int b) {
		return c1.getResult(a, b);
	}

}
