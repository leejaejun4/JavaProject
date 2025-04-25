package chapter04;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		// 사용자에게 찾고 싶은 숫자를 1에서부터 10까지 입력 받아,
		// 해당 숫자의 인덱스를 찾아 출력하는 프로그램을 만드세요.
		// 단, 사용자가 입력한 값이 배열 인덱스로 나타낼 수 없는 경우 찾을 수 없다는 문구를 출력하세요.

		int[] numbers = { 10, 3, 2, 1, 4, 8, 7, 9, 5, 6 };
		int target; // 알고싶은 숫자
		int index = -1;

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 (1~10): ");
		target = scan.nextInt();

		// 배열에서 숫자를 찾아 인덱스 저장
		for (int i = 0; i < numbers.length; i++) {
			if (target == numbers[i]) {
				index = i; // 인덱스를 저장
				break; // 찾았으면 반복문 종료
			}
		}

		// 결과 출력
		if (index != -1) {
			System.out.println("숫자의 위치는: " + (index + 1) + "번째에 있어요");
		} else {
			System.out.println("찾을 수 없습니다.");
		}
		scan.close();
	}
}