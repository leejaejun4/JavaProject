package chapter12.string;

public class StringobjectMain {

	public static void main(String[] args) {

		Stringobject v1 = new Stringobject();
		v1.setVlaue(v1);

		System.out.println(v1.getVlaue());

		// ----------------------------------
		Stringobject v2 = new Stringobject();
		v2.setVlaue(100);// AutoBoxing 객체는 오토박싱 객체는 Integer
		System.out.println(v2.getVlaue());

		// 캐스팅
		int i = (int) v2.getVlaue();// unBoxing
		System.out.println(i + 2);

		// chapter12.string.Stringobject@2f92e0f4
		// 패키지 클래스 스트링 주소
	}

}
