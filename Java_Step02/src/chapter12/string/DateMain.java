package chapter12.string;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateMain {

	public static void main(String[] args) {
		Date now = new Date(0, 0, 0);
		System.out.println(now);
		String strNow1 = now.toString();
		System.out.println("-----DATE------");
		System.out.println(strNow1);

		SimpleDateFormat sdf = new SimpleDateFormat("yyy년 mm월 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println("-----SimpleDateFormat------");
		System.out.println(strNow2);

	}

}
