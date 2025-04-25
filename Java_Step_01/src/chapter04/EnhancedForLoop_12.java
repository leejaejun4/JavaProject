package chapter04;

public class EnhancedForLoop_12 {

	public static void main(String[] args) {

		int numbers[] = { 10, 20, 30, 40, 50 };

		for (int num : numbers) {
			System.out.print(num + " ");
		}

		System.out.println();

		int num[] = { 5, 10, 15, 20, 25 };
		int sum = 0;

		for (int num1 : num) {
			System.out.print(num1 + " ");
			sum += num1;
		}
		System.out.println("\n합계: " + sum);

	}

}
