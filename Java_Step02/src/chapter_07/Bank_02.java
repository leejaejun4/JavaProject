package chapter_07;

public class Bank_02 {

	private String point;
	private String tel;
	static float interest;

	public Bank_02(String point, String tel) {
		this.point = point;
		this.tel = tel;
	}

	public void getBank() {
		System.out.println("지점: " + point + "\n" + "전화번호: " + tel + "\n" + "은행이자: " + interest);
	}

}
