package questions;

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
		.filter((i)->{return i.startsWith("b");})
		.map((i)->{return i.toUpperCase();})
		.map((i)->{return i.length();})
		.distinct()
		.sorted(new reverse1())
		.forEach((i)->{System.out.println(i);});
	}

}
class reverse1 implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}
	
}