package javaBase12.sec03.exam05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class BytesToStringEx {

	public static void main(String[] args) {
		String data = "자바";
		
		//String -> byte 배열(기본 UTF-8 인코딩)
		byte[]arr1 = data.getBytes();
		System.out.println(Arrays.toString(arr1));
		
		//byte배열 -> String(기본 UTF-8 디코딩)
		String str1 = new String(arr1);
		System.out.println(str1);
		
		try {
			//String -> byte배열(EUC-KR 인코딩)
			byte[]arr2 = data.getBytes("EUC-KR");
			System.out.println(Arrays.toString(arr2));
			
			//byte배열 -> String(기본 EUC-KR 디코딩)
			String str2 = new String(arr2,"EUC-KR");
			System.out.println(str2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
