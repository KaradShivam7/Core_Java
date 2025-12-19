package method_reference;

import java.util.Arrays;
import java.util.List;

public class static2 {
	static int sum=0;
	public static void main(String[]args) {
		
		// starts with s
		//return length
		//square of length
		//addition of length square
		
		
		List<String> list=Arrays.asList("shiv","shivam","karad","shantaram","latur","solapur","pune");
	
	    list.stream().filter(demo::start)
	    .map(demo::length)
	    .map(demo::squre)
	    .forEach(demo::sum);
	    
	    System.out.println(sum);
	}

}

class demo{
	public static boolean start(String s) {
		return s.startsWith("s");
	}
	
	public static int length(String s1) {
		return s1.length();
	}
	
	public static int squre(Integer i) {
		return i*i;
	}
	
	public static void sum(Integer i) {
	    static2.sum += i;
	}

	
	
}