package chapter_08;

public class SportCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
		System.out.println("speed: " + speed);
	}

	// final메서드 이므로 재정의 안됨
	/*
	 * @Override public void stop() { System.out.println("스포츠카가 멈춥니다."); speed = 0;
	 * }
	 */
	public static void main(String[] args) {

		SportCar ac = new SportCar();
		ac.speedUp();
		ac.stop();

	}

}
