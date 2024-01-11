package javaBase12.sec11.exam03;

public class GetResourceEx {
	public static void main(String[] args) {
		Class clazz = Car.class;
		
		String p1Path = clazz.getResource("test.jpg").getPath();
		String p2Path = clazz.getResource("images/test2.jpg").getPath();
		
		System.out.println(p1Path);
		System.out.println(p2Path);
	}
}
