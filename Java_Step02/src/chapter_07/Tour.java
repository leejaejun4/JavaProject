package chapter_07;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("관광색 수: ");
		int n = scan.nextInt(); // 3

		// 초기화를 통해서 메모리 확보 및 고객생성(Guide의 객체)
		// guide[0]; guide[1], guide[2]
		Guide_04 guide = new Guide_04(n);

		// 관광객 등록
		System.out.println();
		System.out.println("관광객 등록");
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + ". 이름: ");
			String name = scan.next();
			guide.guest[i].setName(name);

			System.out.print((i + 1) + ". 성별: ");
			String gender = scan.next();
			guide.guest[i].setGender(gender);
		} // for

		// while

		boolean run = true;

		while (run) {

			System.out.println("-----------------------------------");
			System.out.println("1.관광객 정보 | 2.목적지 변경 | 3.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			int menuNum = scan.nextInt();

			switch (menuNum) {
			case 1:
				System.out.println("관광객 정보 ");
				for (int i = 0; i < n; i++) {
					System.out.println(i + 1 + ". 이름: " + guide.guest[i].getName());
					System.out.println(i + 1 + ". 성별: " + guide.guest[i].getGender());
					System.out.println(i + 1 + ". 목적지: " + guide.point);
				}
				break;
			case 2:
				System.out.print("목적지 변경: ");
				guide.point = scan.next();
				System.out.println("목적지가 " + guide.point + "로 바뀌었습니다.");
				break;
			case 3:
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.println("종료");

	}
}
