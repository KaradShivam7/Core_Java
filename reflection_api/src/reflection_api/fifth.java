package reflection_api;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class fifth {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> cl=me.class;
		
		Constructor<?> [] c=cl.getDeclaredConstructors();
		for(Constructor<?> c1:c) {
			System.out.println(c1);
		}
		
		Constructor<?> co=cl.getDeclaredConstructor(int.class);
		co.setAccessible(true);
		
		co.newInstance(10);
	}

}
class me{
	
	
	private me(int id) {
		System.out.println("constructor called");
	}
}