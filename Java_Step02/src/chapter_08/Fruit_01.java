package chapter_08;

public class Fruit_01 {

	private String sort;
	private String season;

	// 생성자

	// 초기화
	public void Set1(String a, String b) {
		sort = a;
		season = b;
	}

	// 출력
	public void Disp1() {
		System.out.println("분류: " + sort);
		System.out.println("계절: " + season);
	}

}
