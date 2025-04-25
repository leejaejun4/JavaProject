package chapter12.wrapper;

public class IntegerMain_01 {

	public static void main(String[] args) {

		// Integer: 참조형 | int: 기본형
		Integer i = new Integer(100);// int i=100; 하는 것과 같다

		Integer num = 100;

		int iNum = num.intValue(); // 언박싱: 클래스(참조현) -> 일반형

		int jNum = 200;

		// 언박싱
		int sum = iNum + jNum;
		int total = num.intValue() + jNum;
		System.out.println(sum);
		System.out.println(total);

		// 오토박싱(int -> integer)
		Integer x = jNum;
		Integer y = Integer.valueOf(jNum);
		System.out.println(x);
		System.out.println(y);
	}

}
