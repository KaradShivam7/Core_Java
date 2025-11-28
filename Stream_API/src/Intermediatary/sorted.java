package Intermediatary;

import java.util.ArrayList;
import java.util.List;

public class sorted {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		
		list.add("shiv");
		list.add("karad");
		list.add("abc");
		list.add("zyx");
		list.add("xyz");
		
		list.stream().sorted().forEach((i)->{System.out.println(i);});
	}

}
