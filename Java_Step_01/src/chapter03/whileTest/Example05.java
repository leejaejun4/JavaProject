package chapter03.whileTest;

import java.util.Random;
import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		/*
		 * 숫자 맞추기 게임 1부터 100까지 무작위 숫자를 선택하고, 숫자를 맞추는 게임 만약 입력한 숫자가 컴퓨터가 선택한 숫자보다 크면
		 * "더 작은 숫자를 추측하세요" 출력 만약 입력한 숫자가 컴퓨터가 선택한 숫자보다 작으면 "더 큰 숫자를 추측하세요" 출력 선택한 숫자를
		 * 정확히 맞출 때까지 과정을 반복 맞출때까지 걸린 시도 횟수를 출력하여 축하의 메시지를 출력
		 */
		Scanner scan = new Scanner(System.in);

		Random random = new Random();

		int targetNumber = random.nextInt(100) + 1;
		int guest = 0;
		int count = 0;
		boolean run = true;

		System.out.println("==업 다운 게임==");

		while (run) {
			System.out.print("1부터 100까지 숫자를 입력하세요: ");
			guest = scan.nextInt();
			count++;
			if (guest > targetNumber) {
				System.out.println("down: 더 작은 숫자를 추측하세요");
			} else if (guest < targetNumber) {
				System.out.println("up: 더 큰 숫자를 추측하세요");
			} else if (guest == targetNumber) {
				run = false;
			}
		}
		System.out.println("축하합니다" + count + "회 만에 맞추었습니다.");
		System.out.println("PC가 선택한 숫자: " + targetNumber);
		System.out.println("user가 추측한 숫자: " + guest);

	}

}
