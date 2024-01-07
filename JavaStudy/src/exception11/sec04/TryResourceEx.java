package exception11.sec04;

public class TryResourceEx {
	public static void main(String[] args) throws Exception{
		MyResource res1 = null;
		try {
			// 리소스 열기
			res1 = new MyResource("res1");
			// 리소스 읽기
			System.out.println(Integer.parseInt( res1.read1()));
			System.out.println(Integer.parseInt( res1.read2()));
			//리소스 닫기
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			//리소스닫기
			res1.close();
		}
		
		// AutoCloseable의 구현 객체로 별도 res2.close(); 를 구현하지 않아도 닫힌다.
		try(MyResource res2 = new MyResource("res2")) {
			// 리소스 읽기
			System.out.println(Integer.parseInt( res2.read1()));
			System.out.println(Integer.parseInt( res2.read2()));
			//리소스 닫기
		}catch(Exception e){
			e.printStackTrace();
		}
		
	
		try(MyResource res3 = new MyResource("res3")) {
			// 리소스 읽기
			System.out.println(Integer.parseInt( res3.read1()));
			System.out.println(Integer.parseInt( res3.read2()));
			//리소스 닫기
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try(MyResource res4 = new MyResource("res4"); MyResource res5 = new MyResource("res5")) {
			// 리소스 읽기
			System.out.println(Integer.parseInt( res4.read1()));
			System.out.println(Integer.parseInt( res4.read2()));
			//리소스 닫기
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
