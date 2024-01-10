package javaBase12.sec06;

public class BoxingUnBoxingEx {
	public static void main(String[] args) {
		//Boxing
		Integer obj = 100;
		System.out.println(obj.intValue());
		
		//Unboxing
		int value = obj;
		System.out.println(value);
		
		int result = obj + 100;
		System.out.println(result);
		
//		parser란
//		컴파일러나 인터프리터에서 원시 프로그램을 읽어 들여 그 문장의 구조를 알아내는 parsing(구문
//		분석)을 행하는 프로그램
//		Integer 객체를 int 로 변환하는 과정에서 parse가 있어서 알아보았다.
		String num = "5";
		int i = Integer.parseInt(num);
		System.out.println(i);
	}
}
