package javaBase12.sec03.exam02;

public class MyTestEx {
	public static void main(String[] args) {
		String test1 = "테스트";
		String test2 = "테스트";
		String test3 = new String("테스트");
		System.out.println(test1 == test2); // true -String 은 같은 값을 참조하면 true 가 나온다.
		System.out.println(test1 == test3); // false -String 새로운 객체 생성시 false
		System.out.println(test1.equals(test3)); // true -equals  사용시 String 의 값을 비교한다.
		
		
		//String 클래스에서는 hashCode() 메서드가 문자열의 내용을 기반으로 해시 코드를 생성하도록 재정의되어 있다.
		System.out.println(test2.hashCode()==test3.hashCode()); // true 
		
		
		MyTest my1 = new MyTest(1,"테스트");
		MyTest my2 = new MyTest(1,"테스트");
		
		// true - hashCode를 재정의 하면 true 가 나온다. 재정의 하지 않으면 false
		System.out.println(my1.hashCode() == my2.hashCode());  
		
		// true - equals를 재정의 하면 true 가 나온다. 재정의 하지 않으면 false
		System.out.println(my1.equals(my2));
		
	}
}
