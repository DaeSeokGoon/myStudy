package collection15.sec07;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapEx {
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer, String>();
		//Map<Integer,String> map = Collections.synchronizedMap(new HashMap<>());
		
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					map.put(i, "내용"+i);
			//		System.out.println("A실행");
				}
			}
		};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i=1001; i<=2000; i++) {
					map.put(i, "내용"+i);
				//	System.out.println("B실행");
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
		}
		
		
		int size = map.size();
		System.out.println("총 객체수 :"+ size);
	}
}
