package terminal;

import java.util.ArrayList;
import java.util.List;

public class findfirst {

	public static void main(String[] args) {
        List<Integer> list =new ArrayList<Integer>();
		
		list.add(10);
		list.add(12);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(6);
		
		
		System.out.println(list);
		
		System.out.println(list.stream().findFirst());
	}

}
