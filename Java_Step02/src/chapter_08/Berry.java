package chapter_08;

//상속 키워드: extends
public class Berry extends Fruit_01 {

	private String name;
	private String size;

	// 초기화
	public void Set2(String a, String b) {
		name = a;
		size = b;
	}

	// 출력
	public void Disp2() {
		System.out.println("과일이름: " + name);
		System.out.println("크기: " + size);
	}
}
