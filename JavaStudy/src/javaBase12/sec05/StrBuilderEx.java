package javaBase12.sec05;

public class StrBuilderEx {
	public static void main(String[] args) {
		//기존 String은 +=으로 값을 변경시 매번 새로운 객체를 참조한다.
		//StringBuilder는 내부 버퍼(데이터를 저장하는 메모리)에 문자열을 저장해두고 사용
		// delete 함수 - 3 이전까지
		String data = new StringBuilder().append("abc").insert(0,"A").delete(2,3).toString();
		System.out.println(data);
		
		StringBuilder data2 = new StringBuilder();
		data2.append("안녕");
		System.out.println(data2);
		data2.append("하세요");
		System.out.println(data2);
	}
}
