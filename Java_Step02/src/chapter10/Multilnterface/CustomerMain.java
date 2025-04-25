package chapter10.Multilnterface;

public class CustomerMain {

	public static void main(String[] args) {

		Customer customer = new Customer();
		System.out.println("-------Buy--------");
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		System.out.println("-------Buy--------");

		System.out.println("-------Sell-------");
		Sell seller = customer;
		seller.sell();
		seller.sellorder();
		seller.order();
		System.out.println("-------Sell-------");

		System.out.println("------------------");
		Sell sb = new Customer();
		sb.order();
		System.out.println("------------------");

		// seller 부모 | customer 자식
		if (seller instanceof Customer) {
			Customer customer2 = (Customer) seller;
			customer2.buy();
			customer2.sell();
			customer2.sellorder();
			System.out.println("------------------");
		}
	}

}
