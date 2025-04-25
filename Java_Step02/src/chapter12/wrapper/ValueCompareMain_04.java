package chapter12.wrapper;

public class ValueCompareMain_04 {

	public static void main(String[] args) {
		// 오토박시의 범위
		System.out.println("[[-128 ~ 128초과할 경우]]");// 1byte=8bit
		Integer obj1 = 300; // 4byte=32
		Integer obj2 = 300;

		// 주소비교
		System.out.println("==결과: " + (obj1 == obj2));
		System.out.println("===언박싱한 후 결과: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("-----------------------------------------");

		// 오토박시의 범위
		System.out.println("[[-128 ~ 128범위내인 경우]]");// 1byte=8bit
		Integer obj3 = 100; // 4byte=32
		Integer obj4 = 100;

		// 주소비교(오토받싱된 선언은 1byte내에서는 캐싱(cache)되어 같은 객체를 재사용)
		System.out.println("==결과: " + (obj3 == obj4));// 외부
		System.out.println("===언박싱한 후 결과: " + (obj3.intValue() == obj4.intValue()));// 내부
		System.out.println("===equals: " + obj3.equals(obj4));// 내부

	}

}
