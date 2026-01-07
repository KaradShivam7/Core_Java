package terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class max {

	public static void main(String[] args) {
        List<Integer> list =new ArrayList<Integer>();
		
		list.add(10);
		list.add(12);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(6);
		
		
		System.out.println(list);
		
		Optional<Integer> max = list.stream().max((a,b)->(b-a));
		System.out.println(max);
	}

}
