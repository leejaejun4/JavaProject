package chapter11;

class OutterRun {
	Runnable getRunnable(int i) {
		int num = 100;

		return new Runnable() {

			@Override
			public void run() {
				// num=200;
				// i=10;
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
}// OutterRun

public class AninyMousInnerMain {

	public static void main(String[] args) {

		OutterRun out = new OutterRun();
		Runnable runnable = out.getRunnable(10);
		runnable.run();

	}

}
