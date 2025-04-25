package chapter05;

public class FuncTest_04 {

	// 반환값이 있음 ~ return
	public int channe1up(int volume) {
		System.out.println("현재 소리는 " + volume + "입니다.");
		System.out.println("소리를 높이겠습니다.");

		String str = "Up";

		return volume + 2;
	}

	public void channelDown(int volume) {
		System.out.println("현재 소리를 " + volume + "만큼 내립니다.");

	}

	public static void main(String[] args) {

		FuncTest_04 tv = new FuncTest_04();

		int volume = 5;
		int v = tv.channe1up(volume);
		System.out.println("소리를 " + v + "로 올립니다.");
		System.out.println("============================");
		System.out.println("소리를 " + tv.channe1up(volume) + "로 올립니다.");
		System.out.println("============================");
		tv.channelDown(volume);
	}

}
