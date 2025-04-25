package chapter_08;

public class Manager extends Employee_09 {

	String department;

	// 생성자
	public Manager(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
		this.salary = salary;

	}

	@Override
	public void work() {
		name = "이재준";
		System.out.println(name + " 관리자가 " + department + " 부서를 관리하고 있습니다.");
	}

	// work

	public void approveLeave(String employeeName) {
		System.out.println(name + "관리자가" + employeeName + "의 휴가를 승인했습니다");
	}

}
