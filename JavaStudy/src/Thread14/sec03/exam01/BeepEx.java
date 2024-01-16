package Thread14.sec03.exam01;

import java.awt.Toolkit;

public class BeepEx {

	public static void main(String[] args) {
		Toolkit tool = Toolkit.getDefaultToolkit();
		for(int i = 0; i <5; i++) {
			tool.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i <5; i++) {
			System.out.println("체크");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
