package chapter06;

public class CarMain {

	public static void main(String[] args) {
		Car_04 s = new Car_04();

		System.out.println("제작회사:" + s.company);
		System.out.println("모델명: " + s.model);
		System.out.println("색깔:" + s.color);
		System.out.println("최고속도:" + s.maxSpeed + "km");
		System.out.println("최저속도:" + s.speed);

		s.speed = 60;
		System.out.println("변경된 현재속도:" + s.speed + "km");

	}

}
