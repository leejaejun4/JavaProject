package chapter05;

import javax.swing.JOptionPane;

public class FuncTest_03 {

	// Display1, Display2(static)

	public static void Display1(String[] A) {
		String res = " ";

		// A 배영변수방의 요소를 몯구 res에 저장하는 method
		for (int i = 0; i < A.length; i++) {
			res += A[i] + " ";
		}

		System.out.println(res);
		JOptionPane.showMessageDialog(null, "배열의 요소\n" + res);

	}

	public static void Display2(String[] A) {
		String res = " ";

		// A 배영변수방의 요소를 몯구 res에 저장하는 method
		for (int i = 0; i < A.length; i++) {
			res += A[i] + " ";
		}

		System.out.println(res);
		JOptionPane.showMessageDialog(null, "배열의 요소\n" + res);
	}

	public static void main(String[] args) {

		String str[] = { "Java", "Oracle", "JSP", "HTML5", " CSS", "SpringBoot" };
		// static 메서드 호출(static 메서드)
		Display1(str);

		FuncTest_03 obj = new FuncTest_03();
		obj.Display2(str);

	}

}

//DATA 영역(sTATIC aREA) -> 프로그램이 실행될때 미리 할당되는 메모리
//Heap 영역(동적 메모리) -> new 등을 통해서 생성된 객체나 배열
//Stack 영역(메서드 호출/종료) -> 지역변수, 매개변수, 함수 
