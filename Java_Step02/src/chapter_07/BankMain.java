package chapter_07;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankMain {

	public static void main(String[] args) {

		// 일산점 031-1234-5678 5.3f
		// 종로점 02-852-9856

		String point = JOptionPane.showInputDialog("지점명");
		String tel = JOptionPane.showInputDialog("전화번호");

		Bank_02 bank = new Bank_02(point, tel);

		Scanner scan = new Scanner(System.in);
		System.out.print(point + "지점의 퇴직연금의 이자를 입력하세요: ");
		Bank_02.interest = scan.nextFloat();
		bank.getBank();
		System.out.println("----------------------------------------------");

		String point2 = JOptionPane.showInputDialog("지점명");
		String tel2 = JOptionPane.showInputDialog("전화번호");

		Bank_02 bank2 = new Bank_02(point, tel);
		bank2.getBank();

	}

}
