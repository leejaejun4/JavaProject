package chapter06;

public class StudentMain {

	public static void main(String[] args) {

		// 기본생성자를 이용한 student1 객체 생성
		Student_07 student1 = new Student_07();

		student1.studentName = "이재준";
		student1.address = "서대문";
		student1.showDtudentInfo();

		// 생성자를 이용한 초기화
		System.out.println();
		Student_07 student2 = new Student_07("솔데이터", "종로");
		student2.showDtudentInfo();

		// 기본생성자를 이용한 student3
		System.out.println();
		Student_07 student3 = new Student_07();
		student3.setStudentName("솔데스크");
		student3.setAddress("종로구");
		student3.showDtudentInfo();

		// getter/setter
		System.out.println();
		System.out.println(student3.getStudentName());
		System.out.println(student3.getAddress());
	}

}
