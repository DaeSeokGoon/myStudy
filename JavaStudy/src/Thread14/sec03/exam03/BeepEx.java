package Thread14.sec03.exam03;

import java.awt.Toolkit;

public class BeepEx {

	public static void main(String[] args) {
		Thread thread = new Thread() {
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
		};
	
		thread.start();
//		for(int i = 0; i <5; i++) {
//			System.out.println("체크");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
		//PrintThread pt = new PrintThread();
		Thread pt = new PrintThread();
		pt.start();
		
	}

}
