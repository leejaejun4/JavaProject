package chapter06;

public class StdInfo {

	// 멤버변수=필드
	public String stufdentName;
	public int grade;
	public int money;

	// 생성자 오버로딩(studentName, money)
	public StdInfo(String stufdentName, int money) {
		this.stufdentName = stufdentName;
		this.money = money;
	}

	// 버스
	public void takeBus(Bus bus) {
		bus.take(1400);// 버스회사의 수입
		this.money -= 1400;// 학생 지출

	}

	public void takeSubway(Subway subway) {
		subway.take(1800);
		this.money -= 1800;
	}

	public void showinfo() {
		System.out.println(stufdentName + "님의 남은 잔액은 " + money + "원 입니다.");
	}

}
