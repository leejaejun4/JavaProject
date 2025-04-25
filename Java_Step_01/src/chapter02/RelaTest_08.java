package chapter02;

public class RelaTest_08 {

	public static void main(String[] args) {
	
		char a,b;
		a='A';
		b='B';
		
		boolean AL=a>b;
		System.out.println(AL);
		
		System.out.println("a>b: "+(a>b)); //f
		System.out.println("a<b: "+(a<b)); //t
		System.out.println("a==b: "+(a==b)); //f
		System.out.println("a<=b: "+(a<=b)); //t
		System.out.println("a!=b: "+(a!=b)); //t
		System.out.println("a>=b: "+(a>=b)); //f

	}

}
