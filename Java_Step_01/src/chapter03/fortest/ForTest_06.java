package chapter03.fortest;

public class ForTest_06 {

	public static void main(String[] args) {
		// 1에서부터 100까지의 수 중에서 3의 배수를 찾아 합을 계산하세요

		int i, sum = 0;
		for (i = 0; i <= 100; i += 3) {
			sum += i;
			System.out.print(i + " ");

		}
		System.out.println();
		System.out.println("1부터 100까지의 수중 3의 배수: " + sum);

		/*
		 * int sum = 0;
		 * 
		 * for (int i = 1; i <= 100; i ++) { if (i % 3 ==0) { System.out.print(i + " ");
		 * sum += i; } } System.out.println();
		 * System.out.println("1부터 100까지의 수중 3의 배수: " + sum);
		 */

	}

}
