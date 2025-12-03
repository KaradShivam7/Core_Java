package Intermediatary;

import java.util.ArrayList;
import java.util.List;

public class limit {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.stream()
		.limit(3)
		.forEach((i)->{System.out.println(i);});
	}

}
