package chapter12.clone;

import java.util.ArrayList;

class Book implements Cloneable {

	String title;

	public Book(String title) {
		this.title = title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return title;
	}

}// Book

public class MyBook {

	public static void main(String[] args) {

		ArrayList<Book> bookList = new ArrayList<Book>();

		Book book1 = new Book("자바");
		Book book2 = new Book("스프링");
		Book book3 = new Book("파이썬");

		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);

		System.out.println(bookList);

		ArrayList<Book> copyList = (ArrayList) bookList.clone();

		Book copybook = new Book("ai");
		copyList.add(copybook);
		copyList.add(new Book("C++"));
		book3.setTitle("Oracle");

		System.out.println(copyList);

	}

}
