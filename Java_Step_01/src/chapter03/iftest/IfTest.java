package chapter03.iftest;

import java.util.Scanner;

public class IfTest {

	static void order() {

		boolean run = true;
		int totalSum = 0;
		int oddSum = 0;
		int evenSum = 0;
		int sum;
		int start, end;

		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.총합 | 2.홀수 | 3.짝수 | 4.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택>>");
			sum = Integer.parseInt(scan.nextLine());

			switch (sum) {
			case 1:
				System.out.print("시작 숫자를 입력하세요: ");
				start = Integer.parseInt(scan.nextLine());
				System.out.print("끝 숫자를 입력하세요: ");
				end = Integer.parseInt(scan.nextLine());

				totalSum = 0; // 총합 초기화
				for (int i = start; i <= end; i++) {
					totalSum += i;
				}
				System.out.println(start + "부터 " + end + "까지의 총합: " + totalSum);
				break;
			case 2:
				System.out.print("시작 숫자를 입력하세요: ");
				start = Integer.parseInt(scan.nextLine());
				System.out.print("끝 숫자를 입력하세요: ");
				end = Integer.parseInt(scan.nextLine());

				oddSum = 0;
				for (int i = start; i <= end; i++) {
					if (i % 2 == 1) {
						oddSum += i;
					}
				}
				System.out.println(start + "부터 " + end + "까지의 홀수 총합: " + oddSum);
				break;
			case 3:
				System.out.print("시작 숫자를 입력하세요: ");
				start = Integer.parseInt(scan.nextLine());
				System.out.print("끝 숫자를 입력하세요: ");
				end = Integer.parseInt(scan.nextLine());

				evenSum = 0;
				for (int i = start; i <= end; i++) {
					if (i % 2 == 0) {
						evenSum += i;
					}
				}
				System.out.println(start + "부터 " + end + "까지의 짝수 총합: " + evenSum);
				break;

			case 4:
				System.out.println("프로그램 종료");
				run = false;
				break;

			default:
				System.out.println("정확한 값을 입력해주세요.");
				break;

			}

		}
		scan.close();

	}
}
