package chapter_08;

public class StrawBerry extends Berry {

	private String color;
	private int price;

	// 초기화
	public void Set3(String a, int b) {
		color = a;
		price = b;
	}

	// 출력
	public void Disp3() {
		System.out.println("색깔 : " + color);
		System.out.println("가격 : " + price);
	}

}
