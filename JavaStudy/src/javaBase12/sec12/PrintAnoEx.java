package javaBase12.sec12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnoEx {
	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			//PrintAnnotation 얻기
			PrintAnnotation printA = method.getAnnotation(PrintAnnotation.class);
			
			printLine(printA);
			
			try {
				method.invoke(new Service());
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			printLine(printA);
			
					
			
			
		}
	}
		public static void printLine(PrintAnnotation print) {
			if(print !=null) {
				int num = print.number();
				for(int i=0; i<num;i++) {
					//value 속성값 얻기
					String value = print.value();
					System.out.print(value);
				}
				System.out.println();
			}
		}
	
	
}
