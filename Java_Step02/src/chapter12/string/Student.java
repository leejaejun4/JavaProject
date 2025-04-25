package chapter12.string;

public class Student {

	int studentId;
	String studentName;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	// 객체의 값(value)을 반환
	@Override
	public String toString() {
		return studentId + ", " + studentId;
	}

	// 물리적 주소
	@Override
	public int hashCode() {
		return studentId;
	}

	// 논리적 주소(내용을 비교)
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (studentId == std.studentId) {// 존재하는 id인지 확인
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}// equals

}
