package exception11.sec05;

public class ThrowEx {
	// main 에 throws 시 jvm 에서 처리한다
	public static void main(String[] args){
			try {
				finclass();
			} catch (ClassNotFoundException e) {
				System.out.println("클래스가 없습니다.");
			}
	}
	
	// 일반예외 , 컴파일러가 체크,  호출한 곳에 예외를 던진다.
	public static void finclass() throws ClassNotFoundException{
		Class.forName("java.lang.String2");
	}
}
