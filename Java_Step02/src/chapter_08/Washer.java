package chapter_08;

public class Washer extends Appliance {

	public Washer(String brand) {
		super(brand);
	}

	@Override
	void turnOn() {
		super.turnOn();
		System.out.println("세탁기를 작동시킵니다.");
	}

	void wash() {
		System.out.println(brand + "세탁이 진행됩니다.");
	}

}
