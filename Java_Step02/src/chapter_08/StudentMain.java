package chapter_08;

public class StudentMain {

	public static void main(String[] args) {

		Student s = new Student("이재준", "010-1234-5678", 2021);

		System.out.println("name: " + s.name);
		System.out.println("ssn: " + s.ssn);
		System.out.println("studentNo: " + s.studentNo);

	}

}
