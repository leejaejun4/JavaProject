package chapter02;

public class Example02 {

	public static void main(String[] args) {
		// 534개의 책(books)을 학생(students) 30명에게 똑같은 갯수로 나눠줄 때,
				// 학생당 몇개씩 가지고, 최종적으로 몇개 남는지 구해보기



		/*soldesk 과수원
				 * 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5개, 7개, 5개 입니다.
				 * 과수원에서 하루에 생산되는 총 과일의 갯수를 출력하고,
				 * 시간당(24) 전체 과일의 평균 생산 갯수를 출력 하시오.
				 * (단, 평균값을 담는 데이터 타입은 float)로 정의한다.
				 */
		
		int books = 534;
		int students = 30;
		
		int books1 = books / students;
		int students1 = books % students;
		
		System.out.println("나눠주는 수: " + books1);
		System.out.println("남는 수: "  + students1);
		System.out.println("----------------------");
		System.out.println("과수원 갯수");
		
		int p=5;
		int a=7;
		int o=5;
		
		int totalsum = p + a + o;
		float totalday = (float) + totalsum /24;
		System.out.println("하루 총 생산 량: " + totalsum);
		System.out.println("24시간 평균 생산량: " + totalday); 
				
	}

}
