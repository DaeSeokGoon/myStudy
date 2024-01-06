package exception11.sec03.exam03;
// 실행예외
public class ExHandlingEx {
	public static void main(String[] args) {
		String[] array = {"10","1oo",null,"200"};
		
		for(int i=0; i<=4; i++) {
			try{
				System.out.println(i+"번째"+array[i].length());
				int value = Integer.parseInt(array[i]);
			}catch (NumberFormatException e) {
				System.out.println("문자는 순자로 변환할수 없음");
				
			//특정 두개의 예외처리를 타도록 할때 '|' 를 넣는다.
			}catch (NullPointerException | ArrayIndexOutOfBoundsException e) { 
				System.out.println("문자열이 없거나 항목 수 부족");
			}catch (Exception e) {
				System.out.println("익셉션");
			}
		}
	}
}
