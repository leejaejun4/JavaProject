package chapter05;

public class Example06 {

	// 최대값을 메소드로 구현
	public static int findMax(int[] arr) {// { 7, 2, 9, 7, 5 }

		int max = 0;
		/*
		 * for (int i = 0; i < arr.length; i++) { if (max < arr[i]) { max = arr[i]; } //
		 * if } // for
		 */
		for (int num : arr) {
			if (max < num) {
				max = num;
			} // if
		} // for

		return max;
	}

	public static void main(String[] args) {

		int[] numbers = { 7, 2, 9, 7, 5 };
		int maxnum = findMax(numbers);
		System.out.println("최대값: " + maxnum);

	}

}
