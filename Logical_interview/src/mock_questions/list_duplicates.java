package mock_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class list_duplicates {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(10,2,4,2,5,4,3,10,7,9,1);
		//System.out.println(list);
		
		List<Integer> list2=new ArrayList<Integer>();
		
		for(int i=0;i<list.size();i++) {
			int counter=1;
			int j=list.get(i);
			for(int k=0;k<list.size();k++) {
				if(list.get(k)==j) {
					counter++;
				}
				//System.out.println(counter);
			}
			if(counter>2) {
				list2.add(j);
			}
			
		}
		System.out.println(list2);
		
		Set<Integer> set=new TreeSet<Integer>((o1,o2)->(o2-o1));
		set.addAll(list2);
		System.out.println(set);
	}

}
