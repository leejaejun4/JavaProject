package chapter10.Multilnterface;

public interface Buy {

	void buy();

	default void order() {
		System.out.println("구매 주문");
	}

}
