package chapter06;

public class TakeTrans {

	public static void main(String[] args) {

		// 학생 2명 생성 (studentJames, studentTom)
		StdInfo studentJames = new StdInfo("James", 20000);
		StdInfo studentTom = new StdInfo("Tom", 23000);

		// 버스타기
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		// studentJamse info
		studentJames.showinfo();
		bus100.showinfo();
		System.out.println("---------------------------------");

		studentTom.takeBus(bus100);
		studentTom.showinfo();
		bus100.showinfo();

		System.out.println("-----------------------------");
		Subway subwayGreen = new Subway("2호선");
		studentJames.takeSubway(subwayGreen);
		studentJames.showinfo();
		subwayGreen.showInfo();

		System.out.println("--------------------------------");
		Subway subwayRed = new Subway("1호선");
		studentTom.takeSubway(subwayRed);
		studentTom.showinfo();
		subwayRed.showInfo();

	}

}
