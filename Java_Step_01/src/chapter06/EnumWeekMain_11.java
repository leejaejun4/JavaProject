package chapter06;

import java.util.Calendar;

public class EnumWeekMain_11 {

	public static void main(String[] args) {

		Week today = null;
		Calendar cal = Calendar.getInstance(); // 한국기준 현재의 요일
		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch (week) {
		case 1: {
			today = Week.SUNDAY;
		}
		case 2: {
			today = Week.MONDAT;
		}
		case 3: {
			today = Week.TUESDAY;
		}
		case 4: {
			today = Week.WEDNESDAY;
		}
		case 5: {
			today = Week.THURSDAY;
		}
		case 6: {
			today = Week.FRIDAY;
		}
		case 7: {
			today = Week.SATURDAY;
			break;
		}
		}

		System.out.println("오늘의 요일: " + today);
		if (today == Week.SATURDAY) {
			System.out.println("영화보기");
		} else {
			System.out.println("출근하기");
		}

	}

}
