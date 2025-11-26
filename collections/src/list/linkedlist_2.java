package list;

import java.util.ArrayList;
import java.util.List;

public class linkedlist_2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(null);  //allows null values
		list.add(null);    //allows duplicate values 
		
//		System.out.println(list);
		
//		//we can add elements through index and value using add(int index,Object element)
//		list.add(1, 15);
//		System.out.println(list);
		
//		//addall(collection) adds all the elements of list in the list
//		list.addAll(list);
//		System.out.println(list);
		
//		list.addFirst(5);
//		System.out.println("list after using addFirst()= "+list);
//		
//		list.addLast(25);
//		System.out.println("list after using addLast()= "+list);

		
//		//.contains() checks if the value is present or not if  present return true else false
//		System.out.println(list.contains(20));

//		//.containsAll() checks the all list is present or not return true or false
//		System.out.println(list.containsAll(list));
		
//		System.out.println(list.equals(list1));
		
		//.get() returns the value of the index
//		System.out.println(list.get(4));
		
		
//		//.getFirst() returns first index value
//		System.out.println(list.getFirst());
//		
//		//.getLast() returns the last index value
//		System.out.println(list.getLast());
		
//		//.remove() removes value using index
//		System.out.println(list.remove(1));
//		System.out.println(list);
		
		//removeAll() removes all the elements
//		System.out.println(list.removeAll(list));
//		System.out.println(list);
		
//		//removeFirst() removes first and removeLast removes last element
//		System.out.println(list.removeFirst());
//		System.out.println(list.removeLast());
//		System.out.println(list);
		
//		//.set() set the element at index
//		System.out.println(list.set(2, 1000));
//		System.out.println(list);
		
		list.clear();
		System.out.println(list);
	}

}
