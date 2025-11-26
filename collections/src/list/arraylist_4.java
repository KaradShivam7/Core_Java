package list;

import java.util.ArrayList;
import java.util.List;

public class arraylist_4 {

	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		
		
		//addAll(int index collection c) add all the list at particular index
		list.addAll(1, list);
		
		System.out.println(list);
		
	}

}
