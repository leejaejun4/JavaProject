package chapter12.string;

public class StringEquals_03 {

	public static void main(String[] args) {

		String strVar1 = new String("홍길동");
		String strVar2 = "홍길동";

		if (strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}

	}

}
