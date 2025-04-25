package chapter04;

public class ArrayTest_08 {

	public static void main(String[] args) {
		// for이용 score점수 출력 => score[0]: 98 sim변수방에 점수 누적
		// avg변수방 선언후 평균 출력(단 실수타입)

		int score[] = { 98, 90, 87 };
		int sum = 0;

		score[0] = 98;
		score[1] = 90;
		score[2] = 87;

		for (int i = 0; i < score.length; i++) {// data[0], data[1], data[2]
			System.out.println("score[" + i + "]" + score[i]);
			sum += score[i];
		}
		System.out.println("총점: " + sum);
		// 평균
		double avg = sum / (double) (score.length);
		System.out.println("평균: " + avg);
		System.out.println("평균(반올림): " + Math.round(avg));

	}

}
