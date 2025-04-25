package chapter03.switchtest;

public class SwitchCase_06 {

	public static void main(String[] args) {

		int time = (int) (Math.random() * 10) + 9;
		System.out.println("[현재 시간] " + time + "시");
		System.out.print("할 일: ");

		switch (time) {
		case 9:
			System.out.println("강아지 산책하기");
			break;
		case 10:
			System.out.println("개인 운동");
			break;
		case 11:
			System.out.println("간단하게 음식 섭취");
			break;
		case 12:
			System.out.println("개인 업무");
			break;
		case 13:
			System.out.println("늦은 점심");
			break;
		case 14:
			System.out.println("낮잠");
			break;
		case 15:
			System.out.println("공부");
			break;
		case 16:
			System.out.println("공부");
			break;
		case 17:
			System.out.println("저녁 운동");
			break;
		case 18:
			System.out.println("단백질 위주 음식 섭취");

		default:
			System.out.println("휴식");
		}

	}

}
