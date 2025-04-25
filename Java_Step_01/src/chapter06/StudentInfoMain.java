package chapter06;

public class StudentInfoMain {

	public static void main(String[] args) {

		StudentInfo studentchoi = new StudentInfo(1004, "최백설", 1, "일산");
		System.out.println(studentchoi.studentID);
		System.out.println(studentchoi.grade);
		System.out.println(studentchoi.address);
		// System.out.println(studentchoi.studentName);//private이므로 사용불가
		// getters / setters 이용한 초기화 또는 출력
		System.out.println(studentchoi.getStudentName());

		// 기본 생성자를 이용해서 객체 생성(studentkim)
		StudentInfo studentkim = new StudentInfo();

		studentkim.studentID = 123;
		studentkim.grade = 1;
		// 주소를 직관적으로 초기화 하고 출력
		studentkim.address = "종로구";
		System.out.println(studentkim.address);

		// 기본 생성자를 이용해서 객체 생성(studentlee)
		StudentInfo studentlee = new StudentInfo();
		// getters / setters
		studentlee.setStudentName("이재준");
		System.out.println(studentlee.getStudentName());

	}

}
