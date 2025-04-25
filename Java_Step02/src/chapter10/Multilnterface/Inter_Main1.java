package chapter10.Multilnterface;

public interface Inter_Main1 {

	abstract String jajang();

	String jjambbong();

	default void show() {
		System.out.println("맛집~~~");
	}

}
