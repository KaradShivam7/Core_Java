package Logical_questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class logical1 {

	public static void main(String[] args) {
		/**
		 * "ababcdeeeffgggghi"
		 * "abcdefghi"
		 * "ihgfedcba"
		 * "IHGFEDCBA"
		 */
		
		String str = new String("ababcdeeeffgggghi");
		
		char[]arr=str.toCharArray();
		
		List<Character> list =new ArrayList<Character>();
		
		
		for(char c:arr) {
			list.add(c);
		}
		
		System.out.println(list);
		
		list.stream()
		.distinct()
		.map((i)->{return i.toString().toUpperCase();})
		.sorted(new reverse2())
		.forEach((i)->{System.out.println(i);});
		
	}

}
class reverse2 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}
	
}