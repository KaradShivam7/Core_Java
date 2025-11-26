package list;

import java.util.ArrayList;
import java.util.List;

public class arraylist_2 {

	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("first arraylist="+list);
		
		
		//we can add elements through index and value using add(int index,Object element)
		list.add(1, 15);
		
		
		System.out.println("updated list="+list);
		
	}

}
