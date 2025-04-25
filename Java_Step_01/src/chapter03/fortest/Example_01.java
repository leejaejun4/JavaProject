package chapter03.fortest;

import java.util.Scanner;

public class Example_01 {

	public static void main(String[] args) {
		// 몇명의 성적을 입력 받을 것인지 정수로 인원수를 입력 받고,
		// 총점과 평균을 구하시오.(단, 평균은 실수로 출력할 것)
		Scanner scan = new Scanner(System.in);

		System.out.print("인원수를 입력 해주세요: ");
		int cnt = scan.nextInt();
		int sum = 0;
		double avg = 0.0;

		for (int i = 1; i <= cnt; i++) {
			System.out.print(i + "번째 성적 입력: ");
			int score = scan.nextInt();
			sum += score;
		}

		avg = (double) sum / cnt;

		System.out.println("총점: " + sum);
		System.out.print("평균: " + avg);

	}

}
