package exception11.sec03.exam01;
// 실행예외
public class ExHandlingEx {
	public static void main(String[] args) {
		String[] array = {"100","1oo"};
		
		for(int i=0; i<=array.length; i++) {
			try{
				System.out.println(array[i]);
				int value = Integer.parseInt(array[i]);
			// 첫번째 예외처리 후 다음 예외처리를 하지 않는다.
		    // 아래쪽으로 넓은 범위의 예외를 넣어주자.
			}catch (ArrayIndexOutOfBoundsException e) {	
				System.out.println("배열 확인");
			}catch (NumberFormatException e) {
				System.out.println("문자는 순자로 변환할수 없음");
			
			}catch (Exception e) {
				
			}
		}
	}
}
