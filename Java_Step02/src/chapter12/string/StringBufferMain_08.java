package chapter12.string;

import java.lang.reflect.Constructor;

public class StringBufferMain_08 {

	public static void main(String[] args) throws ClassNotFoundException {

		StringBuffer buf = new StringBuffer("Nice Day");
		System.out.println(buf.toString());
		System.out.println(buf.length());// 8글자
		System.out.println(buf.capacity());// 기본용량 16 + 8=24

		buf.insert(0, "Hi");
		System.out.println(buf.toString());

		buf.insert(buf.length(), "Everybody!");
		System.out.println(buf);

		buf.delete(0, 2);
		System.out.println(buf);

		StringBuilder sb = new StringBuilder();
		sb.ensureCapacity(50);

		Student student = new Student();
		System.out.println(student);

		Class sClass = Class.forName("chapter12.string.Student");
		System.out.println(sClass);

		Constructor[] consl = sClass.getConstructors();
		for (Constructor c : consl) {
			System.out.println(c);
		}
		
		Method[] method1 =sClass.getMethod();
		for (Method m : method1) {
			System.out.println(m);
		}
		e

	}

}
