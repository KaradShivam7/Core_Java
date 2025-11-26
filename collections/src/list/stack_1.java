package list;

import java.util.ArrayList;
import java.util.Stack;

public class stack_1 {

	public static void main(String[] args) {
		
		Stack<String> names=new Stack<String>();
		
		
		names.push("S1");
		names.push("Haquiqat");
		names.push("S2");
		names.push(null);
		System.out.println(names.size());
		System.out.println(names);
		
		
		
	}
}