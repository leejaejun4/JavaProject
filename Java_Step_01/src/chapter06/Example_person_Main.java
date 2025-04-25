package chapter06;

public class Example_person_Main {

	public static void main(String[] args) {

		// 이름: 홍길동 키: 180 몸무게: 80

		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * System.out.print("이름을 입력하세요: "); String name = scan.nextLine();
		 * 
		 * System.out.print("키를 입력해주세요: "); String height = scan.nextLine();
		 * 
		 * System.out.print("몸무게를 입력해주세요: "); String weight = scan.nextLine();
		 * 
		 * System.out.println("이름:" + name + " 키:" + height + " 몸무게:" + weight);
		 */

		Example_person person = new Example_person("홍길동");
		person.height = 180f;
		person.weight = 80f;

		System.out.println("이름 " + person.name + " 키" + person.height + "몸무게 " + person.weight);

		Example_person person1 = new Example_person("홍길동", 180, 80);

		System.out.println("이름 " + person1.name + " 키" + person1.height + "몸무게 " + person1.weight);
	}

}
