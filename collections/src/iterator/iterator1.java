package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator1 {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		list.add("mango");
		list.add("appple");
		list.add("banana");
		list.add("guva");
		
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
			
			if(list.equals("guva")) {
				itr.remove();
			}
		}
		System.out.println("list after removal: "+list);
	}

}
