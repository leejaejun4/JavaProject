package chapter03.fortest;

public class ForTest_12 {

	public static void main(String[] args) {
		System.out.println("미로 맵(O:길, X:벽 )");

		for (int i = 0; i < 5; i++) { // 행

			for (int j = 0; j < 5; j++) { // 열
				if ((i + j) % 2 == 0) {
					System.out.print("O " + "\t");
				} else {
					System.out.print("X " + "\t");
				} // if

			} // in
			System.out.println();
		} // out

	}// main

}// class
