package list;

import java.util.LinkedList;
import java.util.List;

public class linkedlist_1 {
	public static void main(String[] args) {
		List<Integer> list=new LinkedList<Integer>();
		
		list.add(null);  //allows null 
		list.add(10);
		list.add(20);
		list.add(10);    //allows duplicate
		
		System.out.println(list);
		
		System.out.println(list.get(0));
	}

}
