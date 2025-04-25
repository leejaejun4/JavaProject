package chapter03.switchtest;

import java.util.Scanner;

public class SwitchCase_04 {

	public static void main(String[] args) {
		// A, a -> 최우수고객
		// B, b -> 우수고객
		// C, c -> 일반고객

		Scanner scan = new Scanner(System.in);

		// charAt(0):String -> char
		System.out.println("고객님의 등급을 입력하세요(A,a,B,b,C,c): ");
		char grade = scan.nextLine().charAt(0);

		switch (grade) {
		case 'A':
		case 'a': {
			System.out.println("최우수 고객입니다. ");
			break;
		}
		case 'B':
		case 'b': {
			System.out.println("우수 고객입니다. ");
			break;
		}
		case 'C':
		case 'c': {
			System.out.println("일반 고객입니다. ");
			break;
		}
		default:
			System.out.println("저희 은행에 가입해주세요.");

		}

	}
}
