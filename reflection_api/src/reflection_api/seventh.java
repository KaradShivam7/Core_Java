package reflection_api;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class seventh {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> cl = Class.forName("reflection_api.addd");
		Constructor<?> co=cl.getDeclaredConstructor();
		
		Object obj=co.newInstance();
		
		Method [] m=cl.getDeclaredMethods();
		for(Method m1:m) {
			System.out.println(m1.getName());
		}
		
		Method m2=cl.getDeclaredMethod("add", int.class,int.class);
		Method m3=cl.getDeclaredMethod("mul", int.class);
		m2.setAccessible(true);
		m2.invoke(obj, 10,12);
		m3.invoke(obj, 10);
		
	}

}
class addd{
	private void add(int i,int j) {
		int sum=i+j;
		System.out.println(sum);
		
	}
	
	public void mul(int i) {
		System.out.println(i*2);
	}
}