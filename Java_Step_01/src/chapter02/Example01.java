package chapter02;

public class Example01 {

	public static void main(String[] args) {
		// 534개의 책(books)을 학생(students) 30명에게 똑같은 갯수로 나눠줄 때,
				// 학생당 몇개씩 가지고, 최종적으로 몇개 남는지 구해보기,
		/*soldesk 과수원
		 * 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5개, 7개, 5개 입니다.
		 * 과수원에서 하루에 생산되는 총 과일의 갯수를 출력하고,
		 * 시간당(24) 전체 과일의 평균 생산 갯수를 출력 하시오.
		 * (단, 평균값을 담는 데이터 타입은 float)로 정의한다.
		 */
		System.out.println("학생에게 나눠주는 책 갯수");
		int totalbooks = 534;
		int totalstudents = 30;
		
		int books = totalbooks / totalstudents; //<- 나눠주는 수 
		int students = totalbooks % totalstudents; // <-남는 수
		
		System.out.println("나눠주는 갯수: " + books + "권");
		System.out.println("남는 수: " + students + "권");
		
		System.out.println("------------------------------------------------");
		System.out.println("하루 평균 과일 생산 갯수");
		
		int b = 5;
		int a = 7;
		int o = 5;
		
		int totalsum = b + a + o;// <-하루 생산 갯수
		float total = (float) + totalsum / 24; //시간당 평균 생산 갯수
		
		System.out.println("하루 평균 생산 갯수: " + totalsum );
		System.out.println("시간당 생산 갯수: " + total);
		
		

	}

}
