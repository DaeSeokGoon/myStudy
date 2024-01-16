package Thread14.sec05.exam03;

public class YieldEx {
	public static void main(String[] args) {
		WorkThread workA = new WorkThread("A쓰레드");
		WorkThread workB = new WorkThread("B쓰레드");
		workA.start();
		workB.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		workA.work = false;
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		
		}
		workA.work=true;
	}
}
