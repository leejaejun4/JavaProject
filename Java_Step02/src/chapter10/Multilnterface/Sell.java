package chapter10.Multilnterface;

public interface Sell {

	void sell();

	default void order() {
		System.out.println("판매 주문");
	}

	default void sellorder() {
		System.out.println("판매 주문");
	}
}
