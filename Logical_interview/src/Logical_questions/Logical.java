package Logical_questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Logical {

	
	//return names starts with b
	//convert them into uppercase
	//count its length
	//return distinct 
	//return them in desending order
	
	
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("parleg");
		list.add("happy-happy");
		list.add("good-day");
		list.add("bourbon");
		list.add("t20-t20");
		list.add("merrygold");
		list.add("patanjali");
		list.add("tiger");
		list.add("britania");
		list.add("bounce");
		list.add("biscuits");
		list.add("bournvita");
		
		list.stream()
		.filter((i)->(i.startsWith("b")))
		.map((i)->( i.toUpperCase()))
		.map((i)->( i.length()))
		.distinct()
		.sorted((o1,o2)->(o2-o1))
		.forEach((i)->{System.out.println(i);});
	}

}
