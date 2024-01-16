package Thread14.sec05.exam02;

public class JoinEx {
	public static void main(String[] args) {
		SumThread sum = new SumThread();
		sum.start();
		
		try {
			sum.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(sum.getSum());
	}
}
