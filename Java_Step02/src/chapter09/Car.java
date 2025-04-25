package chapter09;

public abstract class Car {

	// 추상메서드
	public abstract void drive();

	public abstract void stop();

	// 일반메서드
	public void startCar() {
		System.out.println("시통을 켭니다.");
	}

	public void turnOff() {
		System.out.println("시통을 끕니다.");
	}

	// 탭플릿 메서드(재정의가 안되게 구현)

	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
