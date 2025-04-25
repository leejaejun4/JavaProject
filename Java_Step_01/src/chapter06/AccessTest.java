package chapter06;

public class AccessTest {

	// 멤버변수 = 필드// 접근지정자로 현재 클래스에서만 사용가능
	private int aa;
	public int bb; // 접근지정자 공용(다른 클래스에서도 사용가능)
	int cc;// public생략

	// 생성자 생략

	// 메서드
	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void Disp() {
		System.out.println("aa값:" + aa + " bb값: " + bb + " cc값: " + cc);
	}

	public static void main(String[] args) {

		AccessTest s = new AccessTest();
		s.aa = 10;
		// System.out.println("aa=10 -> " + s.aa);
		s.setAa(20);
		System.out.println("setAa(20) -> " + s.aa);
		s.setBb(30);
		System.out.println("setBb(30) -> " + s.bb);
		s.setCc(40);
		System.out.println("setCc(40) -> " + s.cc);

		s.Disp();

	}

}
