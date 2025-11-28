package Intermediatary;

import java.util.ArrayList;
import java.util.List;

public class distinct {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(30);
		
		System.out.println(list);
		System.out.println("***************************");
		
		list.stream().distinct().forEach((i)->{System.out.println(i);});
	}

}
