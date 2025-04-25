package chapter11;

public class FunInterMain {

	public void test() {

		new FunInter() {// FunInter funinter=new FunInter()

			@Override
			public void printData() {
				System.out.println("목요일!!");
			}

		}.printData();// 객체 생성후 호출

	}// test

	public static void main(String[] args) {
		FunInterMain funinter = new FunInterMain();
		funinter.test();
	}

}
