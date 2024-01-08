package javaBase12.sec03.exam02;

public class MyTest {
	private int num;
	private String name;
	
	public MyTest(int num,String name) {
		this.num = num;
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	@Override
	public int hashCode() {
		int hashCode = num + name.hashCode();
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyTest) {
			MyTest m = new MyTest(((MyTest) obj).getNum(),((MyTest) obj).getName());
			if(num == m.getNum()&& name.equals(m.getName())) {
				return true;
			}
		}
		return false;
	}
	
}
