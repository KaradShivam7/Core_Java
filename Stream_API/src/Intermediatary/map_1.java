package Intermediatary;

import java.util.ArrayList;
import java.util.List;

public class map_1 {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		
		List<Integer> list1 =new ArrayList<Integer>();
		list1.add(30);
		list1.add(40);
		
//		List<Integer> list2 =new ArrayList<Integer>();
//		list2.add(50);
//		list2.add(60);
//		
//		List<Integer> list3 =new ArrayList<Integer>();
//		list3.add(70);
//		list3.add(80);
		
		List<List<Integer>> list4 =new ArrayList<List<Integer>>();
		list4.add(list);
		list4.add(list1);
		
		System.out.println(list4);
		
		System.out.println("************************************");
		
		list4.stream().forEach((i)->{i.stream().forEach((j)->{System.out.println(j*2);});});
		
	}

}
