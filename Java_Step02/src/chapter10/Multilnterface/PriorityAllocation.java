package chapter10.Multilnterface;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 노ㅠ은 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill 값이 가장 높은 상담원에게 우선적으로 배분 합니다.");
	}

}
