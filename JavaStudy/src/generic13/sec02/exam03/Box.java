package generic13.sec02.exam03;

public class Box<T> {
	public T content;
	
	public boolean copare(Box<T>other) {
		boolean result = content.equals(other.content);
		return result;
	}

}
