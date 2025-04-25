package chapter_08;

public class Company {

	public static void main(String[] args) {

		Employee_09 emp = new Employee_09("김직원", 4000);
		emp.work();
		emp.getInfo();

		Manager mgr = new Manager("박관리자", 5000, "영업");
		mgr.work();
		mgr.getInfo();
		mgr.approveLeave("김직원");

		// 다형성
		Employee_09 emp2 = new Manager("최팀장", 5500, "개발");
		emp2.work();
		emp2.getInfo();
		// em2.approveLeave("김직원"); //컴파일 에러

	}

}
