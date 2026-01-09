package reflection_api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class sixth {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
		Class<?> cl=karad.class;
		Constructor<?> co=cl.getDeclaredConstructor();
		Object obj=co.newInstance();
		
		Field[] f=cl.getDeclaredFields();
		for(Field f1:f) {
			System.out.println(f1.getName());
		}
		
		Field f2=cl.getDeclaredField("name");
		f2.setAccessible(true);
		f2.set(obj, "shivam");
		
		
		System.out.println(f2.get(obj));
	}

}
class karad{
	private String name;
	String city;
}