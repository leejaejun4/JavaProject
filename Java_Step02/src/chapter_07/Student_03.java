package chapter_07;

public class Student_03 {

	public static int serlaLNum = 10000;
	int studentID;
	String StudentName;
	int grade;
	String address;

	public Student_03() {
		serlaLNum++;
		this.studentID = serlaLNum;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public static int getSerlaLNum() {
		return serlaLNum;
	}

}
