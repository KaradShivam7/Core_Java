package consumer;

import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.List;

public class third {

	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<Integer>();
		
		list.add(20);
		list.add(30);
		list.add(50);
		
		System.out.println(list);
		
		System.out.println("************************");
		
		Consumer<List<Integer>> con=(l)->{System.out.println(list);;};
		con.accept(list);
		
	}

}
