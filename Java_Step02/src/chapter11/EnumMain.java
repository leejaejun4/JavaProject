package chapter11;

import java.util.Scanner;

public class EnumMain {

	public enum Item {
		Start, Pause, Exit
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("숫자를 입력하세요[0:게임시작, 1:일지성지. 2:게임종료] :");

			int n = scan.nextInt();// 0, 1, 2

			Item start = Item.Start; // start를 0으로정의
			Item Pause = Item.Pause;// pause를 1로 정의
			Item Exit = Item.Exit;// exir를 2로 정의

			if (n == start.ordinal()) {
				System.out.println("게임이 시작합니다.");
			} else if (n == Pause.ordinal()) {
				System.out.println("게임이 일시정지됨");
			} else if (n == Exit.ordinal()) {
				System.out.println("게임이 종료됩니다.");
				return;
			} else {
				System.out.println("지원하지 않는 서비스 입니다.");
			} // if

		} // while
	}

}
