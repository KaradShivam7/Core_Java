package list;

import java.util.ArrayList;
import java.util.List;

public class Arraylist_5 {

	public static void main(String[] args) {
		List list=new ArrayList();
		
		
		list.add(10);
		list.add(20);
		
		System.out.println("normal list = "+list);
		
		list.addFirst(5);
		System.out.println("list after using addFirst()= "+list);
		
		list.addLast(25);
		System.out.println("list after using addLast()= "+list);
	}

}
