package chapter06;

public class TeamMember_05 {

	// 필드=멤버변수
	public String teamName;// 팀명
	public String mName;// 팀장
	public String mPhone;// 팀장 전화번호
	public String sName;// 부팀장
	public String name;// 팀원명
	public String gender;// 팀원 성별

	// 기본 생성자
	public TeamMember_05() {

	}

	// Overload
	public TeamMember_05(String name, String gender) {
		this.name = name;
		this.gender = gender;
		// getter / setter
	}

	public String getTeamName() {
		return teamName;
	}

	public String getmName() {
		return mName;
	}

	public String getmPhone() {
		return mPhone;
	}

	public String getsName() {
		return sName;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public void setgender(String gender) {
		this.gender = gender;
	}

}
