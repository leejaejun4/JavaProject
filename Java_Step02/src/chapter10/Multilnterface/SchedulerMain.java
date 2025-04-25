package chapter10.Multilnterface;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill 값이 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요 : ");

			char input = scan.next().charAt(0);
			// toUpperCase(): 대소문자 구분하지 않은
			// 방법1(char)
			// char input = scan.next().toUpperCase().charAt(0);
			// int ch=(int) input;
			// 방법2(String)
			// String mun=scan.nextLine();
			// int ch=mun.charAt(0); // ASCII 즉 문자를 int 숫자로 변경

			// ASCII 즉 문자를 int 숫자로 변경
			int ch = (int) input;

			Scheduler scheduler = null;

			// 객체를 생성
			if (ch == 'R' || ch == 'r') {
				scheduler = new RoundRobin();
			} else if (ch == 'L' || ch == 'l') {
				scheduler = new LeastJob();
			} else if (ch == 'P' || ch == 'p') {
				scheduler = new PriorityAllocation();
			} else if (ch == 'S' || ch == 's') {
				System.out.println("업무가 종료됩니다.");
				break;
			} else {
				System.out.println("지원하지 않는 서비스입니다.");
				continue;
			}

			scheduler.getNextCall();
			scheduler.sendCallToAgent();

		} // while

	}// main

}// class
