package reflection_api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class fourth {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException {
		Class<?> cl= Class.forName("reflection_api.demo");
		
		Field[] cl1=cl.getDeclaredFields();
		
		for(Field i:cl1) {
			System.out.println(i.getName());
		}
		
		System.out.println("**************************");
		
		Field f=cl.getDeclaredField("id");
		System.out.println("single field is = "+f.getName());
		
		System.out.println("**************************");
		
		Constructor<?> c[]=cl.getDeclaredConstructors();
		for(Constructor<?> c1:c) {
			System.out.println(c1);
			System.out.println(c1.getParameterCount());
			Class<?>[] con1=c1.getParameterTypes();
		
			for(Class<?> j:con1) {
				System.out.println(j);
			}
		}
		
		System.out.println("**************************");
		
		Constructor<?> con=cl.getDeclaredConstructor(int.class);
		System.out.println(con);
		
		System.out.println("**************************");
		
		Method [] m=cl.getDeclaredMethods();
		for(Method m1:m) {
			System.out.println(m1);
		}
		
		System.out.println("**************************");
		
		Method me=cl.getDeclaredMethod("get");
		System.out.println(me);
	}

}
class demo{
	int id;
	String name;
	int marks;
	
	public demo() {
		
	}
	
	public demo(int id) {
		
	}
	
	public demo(int id,String name) {
		
	}
	
	public demo(int id,String name,int marks) {
		
	}
	
	void get() {
		
	} 
	
	void show() {
		
	}
	
	void print() {
		
	}
}