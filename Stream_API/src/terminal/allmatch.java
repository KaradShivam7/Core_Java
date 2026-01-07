package terminal;

import java.util.ArrayList;
import java.util.List;

public class allmatch {

	public static void main(String[] args) {
        List<Integer> list =new ArrayList<Integer>();
		
		list.add(10);
		list.add(12);
		list.add(2);
		list.add(4);
		list.add(7);
		list.add(6);
		
		
		System.out.println(list);
		
	    boolean status = list.stream().allMatch((i)->(i%2==0));
	    
	    System.out.println(status);
	}

}
