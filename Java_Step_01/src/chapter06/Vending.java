package chapter06;

public class Vending {

	// 멤버변수
	private Can[] can = new Can[5];
	private int money;

	// 생성자

	// 메서드
	public void init() {
		can[0] = new Can("환타", 1000);
		can[0] = new Can("콜라", 1800);
		can[0] = new Can("사이다", 1600);
		can[0] = new Can("나랑드", 1100);
		can[0] = new Can("탄산수", 2000);
	}

	// 사용 가능한 음료만 출력하는 메서드
	public void showCan(int m) {
		money = m;
		for (int i = 0; i < can.length; i++) {
			if (can[i].getPrice() <= money) {
				System.out.println(can[i].getCanName() + "-" + can[i].getPrice() + "원");
			}
		}

	}// showCans

	// 선택한 음료만 출력
	public void outCan(String name) {
		for (int i = 0; i < can.length; i++) {
			if (name.equals(can[i].getCanName())) {
				System.out.println("선택하신" + can[i].getCanName() + "를(을) 출력합니다.");
				System.out.println("잔액" + (money - can[i].getPrice()) + "원 입니다.");
			}
		}
	}

}
