package exception11.sec02.exam01;
// 실행예외
public class ExHandlingEx1 {
	public static void pLength(String data) {
		int result = data.length();
		System.out.println(result);
	}
	public static void main(String[] args) {
		System.out.println("시작\n");
		
		pLength("this java");
		
		//컴파일러가 체크 할 수 없다. 실행시 발생, 실행 예외
		// 예외 발생시 프로그램이 끝까지 실행이 안된다.
		
		pLength(null); 
		
		System.out.println("종료");
	}
}


