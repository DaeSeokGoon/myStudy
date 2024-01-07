package exception11.sec04;
// 자동 리소스 닫기 인터페이스 구현
public class MyResource implements AutoCloseable{
	private String name;
	
	public MyResource(String name) {
		this.name = name;
		System.out.println(name+"오픈");
	}
	
	public String read1() {
		System.out.println(name+"읽기");
		return "100";
	}
	
	public String read2() {
		System.out.println(name+"읽기");
		return "abc";
	}
	
	
	
	@Override
	public void close() throws Exception {
		System.out.println(name+"닫기");
	}
}
