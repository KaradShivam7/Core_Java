package Intermediatary;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class map {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		System.out.println("**************************");
		
		list.stream().map((i)->{return Double.valueOf(i);}).filter((i)->{return i<=30;}).forEach((i)->{System.out.println(i*2);});
	}

}