package chapter10.Interface;

public class SmartTelevisionMain_03 {

	public static void main(String[] args) {
		
		SmartTelevision tv=new SmartTelevision();
		
		tv.trunOn();
		tv.setVolume(10);
		tv.trunOff();
		tv.search("www.naver.com")
		System.out.println();
		
		//remote rc = tv
		Remote rc = tv;
		rc.trunOn();
		tv.setVolume(-7);
		tv.turnOff();
		//rc.search();
		System.out.println();
		
		//Seachable 클래스에 정의 되어 있는 메서드만 오버라이딩된 메소드 대입
		Searchable sc=tv;
		sc.seatch(null);
		
		
	}

}
