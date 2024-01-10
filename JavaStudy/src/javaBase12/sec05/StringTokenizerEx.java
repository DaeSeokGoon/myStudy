package javaBase12.sec05;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TimeZone;

public class StringTokenizerEx {
	public static void main(String[] args) {
		// split 는 동일한 구분자가 없을때도 사용가능하다
		String data1 = "홍길동&어사,물고기";
		String [] darr= data1.split("&|,");
		System.out.println(Arrays.toString(darr));
		for(String d : darr) {
			System.out.println(d);
		}
		// StringTokenizer 는 동일한 구분자가 있을때 사용
		// 홍길동,어사,물고기가 토큰이 된다.
		String data2 = "홍길동,어사,물고기";
		StringTokenizer darr2 = new StringTokenizer(data2,",");
		while(darr2.hasMoreTokens()) {
			String token = darr2.nextToken();
			System.out.println(token);
		}
		
	}
}
