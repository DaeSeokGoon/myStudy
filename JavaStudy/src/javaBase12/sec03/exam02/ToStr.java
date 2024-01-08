package javaBase12.sec03.exam02;

public class ToStr {
	private String name;
	private String job;
	public ToStr(String name, String job) {
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
		return name+", "+job;
	}
	
}
