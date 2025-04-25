package chapter06;

import java.util.Random;

public class UpDown {

	private int pcnum = new Random().nextInt(50) + 1;
	private int count;
	private String result = "FALSE";

	public String check(int mynumber) {
		count++;
		if (mynumber < pcnum) {
			System.out.println("Up");
		} else if (mynumber > pcnum) {
			System.out.println("Down");
		} else {
			System.out.println(count);
			result = "SUCCESS";
		}
		return result;

	}
}
