package chapter_08;

public class SuperMain {

	public static void main(String[] args) {

		Paprika obj = new Paprika();

		obj.Set1("피망류", "여름", "초록색파프리카");// 부모 클래스의 메소드
		obj.Set2("노랑", 8000, "노랑파프리카");// 부모 클래스의 메소드

		obj.Disp1();
		System.out.println("-----------------------");
		obj.Disp2();
		System.out.println("-----------------------");

	}

}
