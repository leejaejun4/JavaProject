package chapter05;

import java.util.Scanner;

public class FuncTest_05 {

	public static String EduStep(int step) {

		// switch
		String step1 = "";

		switch (step) {
		case 1:
			System.out.println("선택하신 step 단계는 1 단계 입니다.");
			step1 = "초급";
			break;
		case 2:
			System.out.println("선택하신 step 단계는 2단계 입니다.");
			step1 = "중급";
			break;
		case 3:
			System.out.println("선택하신 step 단계는 3단게 입니다.");
			step1 = "상급";
			break;
		default:
			System.out.println("없는 step번호를 입력하셨습니다. ");
			step1 = "X";
			break;

		}
		return step1;

	}

	public static void main(String[] args) {

		// 입력받아서 number
		Scanner scan = new Scanner(System.in);
		System.out.print("스터디 단계를 입력하세요: ");
		int number = scan.nextInt();

		// 1:초급 2: 중급 3:상급
		String step = EduStep(number);
		System.out.println("현재 수업 단계는 " + step + " 단계입니다.");

	}

}
