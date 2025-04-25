package chapter05;

public class Example07 {

	// 총점을 구한후 평균 리턴하기
	public double calculateAverage(int[] array) {// { 5, 10, 15, 20, 25 }

		int sum = 0;

		for (int num : array) {
			sum += num;
		}
		System.out.println("합계: " + sum);

		double avg = sum / array.length;

		return avg;

	}

	public static void main(String[] args) {

		Example07 calculator = new Example07();

		int[] numbers = { 5, 10, 15, 20, 25 };
		double average = calculator.calculateAverage(numbers);
		System.out.println("배열의 평균: " + average);

	}

}
