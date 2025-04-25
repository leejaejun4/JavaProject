package chapter_08;

public class TV extends Appliance {

	public TV(String brand) {
		super(brand);

	}

	@Override
	void turnOff() {
		super.turnOff();
		System.out.println("TV를 끕니다.");

	}

	void wash() {
		System.out.println(brand + "꺼집니다.");
	}

}
