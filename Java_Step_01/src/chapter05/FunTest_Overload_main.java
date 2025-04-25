package chapter05;

public class FunTest_Overload_main {

	public static void main(String[] args) {

		FunTest_Overload_08 obj = new FunTest_Overload_08();

		obj.getResult(5);
		obj.getResult('A');
		obj.getResult("java");
		obj.getResult(6, "Java");

		obj.getResult("화이트");
		obj.getResult("레드");

	}

}
