package chapter11;

class OutterRunnable {
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명의 클래스 변수");
		}
	};
}

public class AninyMousInnerMain2 {

	class OutterRunnable {

	}// OutterRunnable

	public static void main(String[] args) {

		chapter11.OutterRunnable out = new chapter11.OutterRunnable();
		out.runner.run();
	}

}
