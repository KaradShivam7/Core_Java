package Intermediatary;

import java.util.ArrayList;
import java.util.List;

public class filter_1 {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		
		list.add("latur");
		list.add("wakad");
		list.add("lalapur");
		list.add("pune");
		list.add("latalur");
		list.add("wakad");
		
		list.stream().filter((i)->{return i.startsWith("la");}).forEach((i)->{System.out.println(i.toUpperCase());});
	}

}
