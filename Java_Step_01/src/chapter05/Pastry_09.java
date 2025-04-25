package chapter05;

import java.util.Scanner;

public class Pastry_09 {

	// 멤버변수

	// 생성자

	// 메서드 Overload 1

	public void makeBread() {
		System.out.println("빵을 만듭니다.");
	}

	// 메서드 Overload 2
	public void makeBread(int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.println((i + 1) + "번째 빵을 만들었어유");
		}
		System.out.println("요청하신 " + cnt + "개의 빵이 모두 완료되었습니다.");
	}

	// 메서드 Overload 3
	public void makeBread(int cnt, String name) {
		for (int i = 0; i < cnt; i++) {
			System.out.println((i + 1) + "번째 빵을 만들었어유");
		}
		System.out.println("요청하신 " + cnt + "개의" + name + "빵이 모두 완료되었습니다.");
	}

	void order() {
		boolean run = true;
		int cnt;
		String str;

		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1. 빵 개수만 선택 | 2.빵 개수와 종류 선택 | 3.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택>>");
			int input_num = Integer.parseInt(scan.nextLine());

			switch (input_num) {
			case 1:
				// 빵의 개수 입력
				System.out.print("빵의 개수 입력: ");
				cnt = Integer.parseInt(scan.nextLine());

				for (int i = 0; i < cnt; i++) {
					System.out.println("빵" + (i + 1) + "개");
				}

				System.out.println("빵" + cnt + "개가 완성 되었습니다.");
				break;
			case 2:
				System.out.print("빵의 개수 입력: ");
				cnt = Integer.parseInt(scan.nextLine());

				System.out.print("빵의 종류 받기: ");
				str = scan.nextLine();

				for (int i = 0; i < cnt; i++) {
					System.out.println(str + "빵 " + (i + 1) + "개");
				}

				System.out.println("요청하신 " + cnt + "개의 " + str + "빵이 완성 되었습니다.");
				break;
			case 3:
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:

			}
		}

	}
}
