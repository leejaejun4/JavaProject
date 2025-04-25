package chapter_08;

public class DmbCellphoneMain {

	public static void main(String[] args) {

		DmbCellphone dmb = new DmbCellphone(11, "Java폰", "검정");

		// 상속받은 필드
		System.out.println("모델: " + dmb.model);
		System.out.println("색상: " + dmb.color);

		// 자식클래스 필드
		System.out.println("채널: " + dmb.channel);

		// 전화통화구현
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");
		dmb.receiveVoice("점심을 뭐 먹을까?");
		dmb.sendVoice("아무거나");
		dmb.hangUp();
		dmb.turnOnDmb();
		dmb.turnOffDmb();
		dmb.changeChannelDmb(5);
		dmb.turnOffDmb();

	}

}
