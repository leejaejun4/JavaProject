package chapter_08;

public class DriverMain {

	public static void main(String[] args) {

		Driver d = new Driver();
		d.drive(new Bus());

		Taxi t = new Taxi();
		d.drive(t);

	}

}
