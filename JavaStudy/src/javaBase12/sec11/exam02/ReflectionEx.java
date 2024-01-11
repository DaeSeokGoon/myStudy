package javaBase12.sec11.exam02;

import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectionEx {
	public static void main(String[] args) {
		Class clazz = Car.class;
		
		//how 2
		//Class clazz = Class.forName("javaBase12.sec11.exam02.Car");
		
		//how 3
		//Car car = new Car();
		//Class clazz = car.getClass();
		
		System.out.println("생성자 정보");
		Constructor[] c = clazz.getConstructors();
		for(Constructor con : c) {
			System.out.println(con.getName());
			Class[] para = con.getParameterTypes();
			System.out.println(Arrays.toString(para));
		}
		
		System.out.println();
		
		System.out.println("필드정보");
		Field[] f = clazz.getDeclaredFields();
		for(Field fi : f) {
			System.out.println(fi.getType().getName()+" "+fi.getName());
		}
		
		System.out.println("메소드정보");
		Method[] m = clazz.getDeclaredMethods();
		for(Method me : m) {
			System.out.println(me.getName()+Arrays.toString(me.getParameterTypes()));
		}
		
	}
}
