package chapter_08;

public class Employee_09 {

	String name;
	int salary;

	public Employee_09(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public void work() {
		System.out.println(name + "직원이 일하고 있습니다.");
	}

	public void getInfo() {
		System.out.println("이름: " + name + "+salary" + "만원");
	}

}
