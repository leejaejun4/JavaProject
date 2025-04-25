package chapter06;

public class TeamGroup {
	// 멤버변수
	private TeamMember_05[] s = new TeamMember_05[6];

	// 기본 생성자

	// 초기화 메서드
	public void init() {
		// 생성자 오버로드 사용
		s[0] = new TeamMember_05("김윤서", "남학생");
		s[1] = new TeamMember_05("나세종", "남학생");
		s[2] = new TeamMember_05("이재준", "남학생");
		s[3] = new TeamMember_05("호재영", "여학생");
		s[4] = new TeamMember_05("김동환", "남학생");
		s[5] = new TeamMember_05("정연", "남학생");

	}// init

	public void Disp() {

		for (int i = 0; i < s.length; i++) {
			System.out.print("성명:" + (s[i].getName()));
			System.out.println(", 성별:" + (s[i].getGender()));
		}

	}// Disp

}// class
