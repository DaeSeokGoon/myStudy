package javaBase12.sec03.exam02;

import java.util.HashSet;

public class ToStrEx {
	public static void main(String[] args) {
		
		// toString 정의하지 않으면 javaBase12.sec03.exam02.ToStr@2a139a55
		// 정의하면 이름,직업이 출력된다.
		
		ToStr test1 = new ToStr("이름","직업");
		System.out.println(test1);
		
		String test2 = test1.toString();
		System.out.println(test2);
		
		
		HashSet hashSet = new HashSet(); // equals 가 같고 hascode 가 같다가 true 면 하나만 저장된다.
	}
	
}
