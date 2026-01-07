package terminal;

import java.util.ArrayList;
import java.util.List;

public class nonematch {

	public static void main(String[] args) {
        List<Integer> list =new ArrayList<Integer>();
		
		list.add(10);
		list.add(12);
		list.add(2);
		list.add(4);
		list.add(8);
		list.add(6);
		
		
		System.out.println(list);
		
		boolean status=list.stream().noneMatch((i)->(i%2!=0));
		
		System.out.println(status);
		
		System.out.println("**********************");
        
		boolean status1=list.stream().noneMatch((i)->(i%2==0));
		
		System.out.println(status1);
	}

}
