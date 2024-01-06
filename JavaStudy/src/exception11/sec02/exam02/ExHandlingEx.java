package exception11.sec02.exam02;
// 일반예외
public class ExHandlingEx {
	public static void main(String[] args) {
		// 컴파일러가 예외 오류 미리 알려준다. 
		try {
			//일반예외 
			Class.forName("java.lang.String"); // 정적 메소드 호출
			
			System.out.println("해당 클래스가 있다");
		}catch(ClassNotFoundException e) {
			System.out.println("해당 클래스가 없다");
		}
			
		System.out.println();
		
		try {
			//일반예외 
			Class.forName("java.lang.String2"); // 정적 메소드 호출
			
			System.out.println("해당 클래스가 있다");
		}catch (ClassNotFoundException e) {
			System.out.println("해당 클래스가 없다");
			e.printStackTrace();
		}
		
		
	}
}
