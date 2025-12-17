package mock_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class list_of_list {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(10,20,30);
		List<Integer> list1 =Arrays.asList(40,50,60);
	    
	    
	    List<List<Integer>> list2=Arrays.asList(list,list1);
	   System.out.println(list2);
	    
	   
	   list2.stream().flatMap(null)
	    
	}

}
