package list;

import java.util.ArrayList;
import java.util.List;

public class arraylist_6 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		
		//isEmpty returns true if the list is empty otherwise return false
		System.out.println(list.isEmpty());
		
		list.add("shiv");
		
		System.out.println(list);
		System.out.println(list.isEmpty());
		
	}

}
