package chapter04;

public class TwoDimension_09 {

	public static void main(String[] args) {
		// 이차원 배열
		int arr[][] = new int[2][3];// <-앞에[]는 행 담당 뒤에 []는 열 담당
		int n = 0;
		int arr1[][] = { { 1, 2, 3, }, { 4, 5, 6 } };

		for (int i = 0; i < arr.length; i++) {// 2번
			for (int j = 0; j < arr[i].length; j++) {
				n++;
				System.out.print((arr[i][j] = n) + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
		System.out.println(arr.length + "행");// 2
		System.out.println(arr[0].length + "열");// 3
		System.out.println("---------------------------------");

		for (int i = 0; i < arr.length; i++) {// 2번
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
