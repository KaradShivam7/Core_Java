package reflection_api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class logicalquestion {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> cl=logic.class;
		Constructor<?> [] con=cl.getDeclaredConstructors();
		for(Constructor<?> c:con) {
			System.out.println(c);
		}
		
		Constructor<?> c1=cl.getDeclaredConstructor(int.class);
		c1.setAccessible(true);
		
		Object obj=c1.newInstance(10);
		
		Field[] f=cl.getDeclaredFields();
		for(Field f1:f) {
			f1.setAccessible(true);
	        if(f1.get(obj).equals("Honda")) {
	        	f1.set(obj, "Honda-Shine");
	        }
	        if(f1.get(obj).equals("Hero")) {
	        	f1.set(obj, "Hero-Splender");
	        }
		}
		
		Method[] m=cl.getDeclaredMethods();
		for(Method m1:m) {
			System.out.println(m1.getName());
		}
		
		Method m2=cl.getDeclaredMethod("print");
		m2.setAccessible(true);
		m2.invoke(obj);
		
	}

}
class logic{
	private String name="Honda";
	private String name1="Hero";
	
	private logic(int i) {
		System.out.println("object created");
	}
	
	private void print() {
		System.out.println(name);
		System.out.println(name1);
	}
}