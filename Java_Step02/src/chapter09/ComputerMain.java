package chapter09;

public class ComputerMain {

	public static void main(String[] args) {

		// 추사클래스는 객체를 만들수 없음
		// Computer c1=new Computer();
		// Computer c2=new NoteBook();

		Computer c3 = new DeskTop();
		Computer c4 = new MyNoteBook();

		c3.typing(); // DeskTop
		c3.display();// DeskTop
		c4.display();// NoteBook
		c4.typing();// MyNotBook

	}

}
