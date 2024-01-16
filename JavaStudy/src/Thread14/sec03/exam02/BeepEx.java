package Thread14.sec03.exam02;

import java.awt.Toolkit;

public class BeepEx {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit tool = Toolkit.getDefaultToolkit();
				for(int i = 0; i <5; i++) {
					tool.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		
		thread.start();
		
		
		
//		for(int i = 0; i <5; i++) {
//			System.out.println("체크");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		Task pt = new Task();
//		Thread thread2 = new Thread(pt);
		Thread thread2 = new Thread(new Task());
		thread2.start();
		
	}

}
