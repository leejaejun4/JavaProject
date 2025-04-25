package chapter06;

public class Bus {

	// 멤버변수
	int busNumber;
	int passengerCount;
	int monry;

	// 생성자 오버로딩
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	// 메서드
	public void take(int money) { // 승객이 낸 돈
		this.monry += money; // 버스 수입
		passengerCount++; // 승객의 수 증가
	}

	public void showinfo() {
		System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 입니다, 수입은 " + monry + "원 입니다.");
	}

}
