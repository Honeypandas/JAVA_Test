package ywq;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ywq {

	private String name;
	private int age;
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		 Ywq ywq=new Ywq();
		 ywq.show();
		 
		Class c= Class.forName("ywq.Ywq");
		 Method[] m=c.getDeclaredMethods();
		System.out.println(m.length);
		m[1].invoke(ywq);
		 
	}

	public void  print() {
		System.out.println("HelloWorld!");
	}
	public void show(){
		
		System.out.println("Reflection!");
	}
	
	
}
