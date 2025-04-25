package chapter_07;

public class CompanyMain {

	public static void main(String[] args) {
		// heap에 객체생성
		Company_05 company01 = new Company_05();
		Company_05 company02 = new Company_05();

		System.out.println(company01);
		System.out.println(company02);

		System.out.println("---------------singleton----------------");

		// Data영역에 객체 생성
		Company_05 mycompany1 = Company_05.getInstance();
		Company_05 mycompany2 = Company_05.getInstance();

		System.out.println(mycompany1);
		System.out.println(mycompany2);
		System.out.println(mycompany1 == mycompany2);

	}

}
