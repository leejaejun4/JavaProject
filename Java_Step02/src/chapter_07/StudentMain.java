package chapter_07;

public class StudentMain {

	public static void main(String[] args) {

		// studentLee에 이수정으로 설정후 seriaNum과 StudentName

		/*
		 * String getString;
		 * 
		 * Student_03 st = new Student_03();
		 * 
		 * String getString2 = JOptionPane.showInputDialog("이름 입력"); String Num =
		 * JOptionPane.showInputDialog("숫자 입력");
		 */

		Student_03 studentLee = new Student_03();
		studentLee.setStudentName("이수정");
		System.out.println(studentLee.StudentName);
		System.out.println(studentLee.serlaLNum);// 10000
		System.out.println(studentLee.studentID);// 10000

		System.out.println();
		Student_03 studentKim = new Student_03();
		studentKim.setStudentName("김우진");
		System.out.println(studentKim.StudentName);
		System.out.println(studentKim.serlaLNum);// 10001
		System.out.println(studentKim.studentID);// 10000

		System.out.println();
		Student_03 studentPark = new Student_03();
		studentPark.setStudentName("박재현");
		System.out.println(studentPark.StudentName);
		System.out.println(studentPark.serlaLNum);// 10002
		System.out.println(studentPark.studentID);// 10000

		System.out.println();
		Student_03 studentSin = new Student_03();
		studentSin.setStudentName("신수지");
		System.out.println(studentSin.StudentName);
		System.out.println(studentSin.serlaLNum);// 10003
		System.out.println(studentSin.studentID);// 10000

	}

}
