package Logical_questions;

import java.util.Set;
import java.util.TreeSet;

public class logical3 {

	public static void main(String[] args) {
		int [] arr= {1,2,3,2,4,1,5,78,3,0,2,3,9,5,0};
		//distinct
		//reverse order
		
		Set<Integer> set = new TreeSet<Integer>((o1,o2)->( o2-o1));
		
		for(int i:arr) {
			set.add(i);
		}
		
        System.out.println(set);
	}

}
