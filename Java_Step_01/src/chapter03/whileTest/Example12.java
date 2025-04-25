package chapter03.whileTest;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Example12 {

	public static void main(String[] args) {
		Set<Integer> lottoNumbers = new TreeSet<>();

		Random random = new Random();

		while (lottoNumbers.size() < 6) {
			int number = random.nextInt(45) + 1; // 1 ~ 45 사이의 숫자
			lottoNumbers.add(number);
		}

		System.out.println("생성된 로또 번호: " + lottoNumbers);

	}

}
