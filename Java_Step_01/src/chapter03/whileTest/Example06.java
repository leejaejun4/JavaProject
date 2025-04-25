package chapter03.whileTest;

import java.util.Random;
import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Random random = new Random();

		int targetNumber = random.nextInt(100) + 1;
		int guest = 0;
		int count = 0;
		boolean run = true;

		System.out.println("==업 다운 게임==");

		do {
			System.out.print("추측한 숫자를 입력하세요: ");
			guest = scan.nextInt(); // 나
			count++;

			if (guest > targetNumber) {
				System.out.println("down:더 작은 숫자를 추측하세요");
			} else if (guest < targetNumber) {
				System.out.println("up:더 큰 숫자를 추측하세요");
			}

		} while (guest != targetNumber);

		System.out.println("축하합니다" + count + "회 만에 맞추었습니다.");
		System.out.println("PC가 선택한 숫자: " + targetNumber);
		System.out.println("user가 추측한 숫자: " + guest);

	}

}
