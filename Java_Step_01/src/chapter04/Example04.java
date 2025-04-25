package chapter04;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		// 학생수을 입력받아, 점수를 입력하고 점수리스트를 출력하고 총점과 평균을 분석하는 프로젝트

		boolean run = true;

		int studentNum = 0;
		int[] score = null;

		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scan.nextLine());

			if (selectNo == 1) {
				System.out.println("학생수를 선택하셨습니다. ");
				System.out.print("학생수를 입력해주세요: ");
				studentNum = Integer.parseInt(scan.nextLine());
				score = new int[studentNum];

			} else if (selectNo == 2) {
				if (score == null) {
					System.out.println("먼저 학생 수를 입력해주세요.");
					continue;
				}
				System.out.println("점수를 입력하세요.");
				for (int i = 0; i < score.length; i++) {
					System.out.print((i + 1) + "번 학생 점수: ");
					score[i] = Integer.parseInt(scan.nextLine());
				}
			} else if (selectNo == 3) {
				if (score == null) {
					System.out.println("아직 점수가 입력되지 않았습니다.");
					continue;
				}
				System.out.println("점수 리스트.");
				for (int i = 0; i < score.length; i++) {
					System.out.println((i + 1) + "번 학생 점수: " + score[i]);
				}
			} else if (selectNo == 4) {
				if (score == null) {
					System.out.println("먼저 학생수를 입력해주세요.");
					continue;
				} else {
					int sum = 0;
					double avg;
					for (int sum1 : score) {
						sum += sum1;
					}
					avg = (double) sum / studentNum;
					System.out.println("총합: " + sum);
					System.out.println("평균: " + avg);
				}

			} else if (selectNo == 5) {
				run = false;
				System.out.println("프로그램을 종료합니다.");
			} else {
				System.out.println("없는 서비스 번호 입니다.");
			} // if
		}
	}

}
