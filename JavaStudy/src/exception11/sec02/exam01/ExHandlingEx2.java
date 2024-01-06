package exception11.sec02.exam01;
// try catch 사용
public class ExHandlingEx2 {
	public static void pLength(String data) {
		try {
			int result = data.length();
			System.out.println(result);
			
		}catch(NullPointerException e) { // 예외 객체 생성
			//System.out.println(e.getMessage()); // 간단 이유 메세지 생성
			//System.out.println(e.toString()); // 예외 종류 , 사유
			e.printStackTrace(); // e 의 메소드, 예외 정보 출력
			
		}finally {
			System.out.println("마무리\n");
			
		}
		
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


