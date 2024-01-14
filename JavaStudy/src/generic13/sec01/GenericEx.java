package generic13.sec01;

public class GenericEx {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.content = "테스트";
		String str = box.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<>();
		box2.content = 123;
		int ints = box2.content;
		System.out.println(ints);
	}
}
