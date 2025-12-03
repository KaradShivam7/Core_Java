package questions;

import java.util.ArrayList;
import java.util.List;

public class Logical_3 {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		
		list.add("Latur");
		list.add("Tuljapur");
		list.add("Gulbarga");
		list.add("Vijaypur");
		list.add("Ratnagiri");
		list.add("Rampur");
		list.add("Ranapur");
		
		list.stream()
		.filter((i)->(i.startsWith("Ra")))
		.map((i)->{return i.toUpperCase();})
		.forEach((i)->{System.out.println(i);});
	}

}
