package chapter_07;

import java.util.Scanner;

public class Guide_04 {

	// 멤버변수
	static String point;
	Guest[] guest;
	Scanner scan;

	// 생성자
	public Guide_04(int n) {
		// 목적지
		point = "발리";
		// 관광객수 만큼 메모리 확보
		guest = new Guest[n];

		for (int i = 0; i < n; i++) {
			guest[i] = new Guest();
		} // for
	}// 생성자

	// 메서드
	public String getPoint() {
		return point;
	}

}
