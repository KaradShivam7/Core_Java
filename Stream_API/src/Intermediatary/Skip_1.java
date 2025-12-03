package Intermediatary;

import java.util.ArrayList;
import java.util.List;

public class Skip_1 {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		
		list.add("abc");
		list.add("xyz");
		list.add("shiv");
		list.add("karad");
		list.add("shivam");
		
		System.out.println(list);
		
		list.stream()
		.skip(4)
		.forEach((i)->{System.out.println(i);});
		
		System.out.println("***********************");
		
		list.stream()
		.skip(2)
		.limit(4)
		.forEach((i)->{System.out.println(i);});
	}

}
