package chapter_08;

public class A {

	// 상속전용 -> public 역할이 있어서 같은 패키지에서 사용가능 다른 패키지에서는 상속받은 클래스에서만 사용
	// 상속 받지 않은 클래스에서는 사용할 수 없음 즉 private 역할도 있음
	protected String field;

	// 생성자

	protected void method() {
		System.out.println("A Class");
		System.out.println("field");
	}

}
