package chapter_08;

public class WashMain {

	public static void main(String[] args) {

		/*
		 * Appliance s = new Washer("세탁기"); s.turnOn();
		 * System.out.println("-----------------------"); TV s1 = new TV("Samsung");
		 * s1.turnOff();
		 */

		Appliance[] list = new Appliance[3];
		list[0] = new Washer("LG");
		list[1] = new TV("Samsung");
		list[2] = new Washer("Daewoo");

		for (Appliance a : list) {
			a.turnOn();
		}
	}

}
