package chapter_08;

public class Car {

	public int speed;

	public void speedUp() {
		speed += 1;
	}

	// Override 가 불가능한 메서드
	public void stop() {
		System.out.println("자동차가 멈춥니다.");
		speed = 0;
	}

}
