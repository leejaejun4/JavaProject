package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfTest_07 {

	public static void main(String[] args) {
		// 데이터셋
		String ID = "Soldesk";
		int PW=250408;
		
		//고객
		String id=JOptionPane.showInputDialog("아이디를 입력해주세요");
		
		if(ID.equals(id)) {
			//비밀번호
			int pass=Integer.parseInt(JOptionPane.showInputDialog("비빌번호를 입력해주세요"));
			if(PW==pass) {
				System.out.println(ID+"님 환영합니다.");
			}else {
				System.out.println(id+ "와 비밀번호와 일치하는 아이디가 없습니다.");
			}
		}else {
			System.out.println("일치 하는 아이디가 존재 하지 않습니다.");
		}
		

	}

}
