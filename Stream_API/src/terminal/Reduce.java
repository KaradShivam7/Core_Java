package terminal;

import java.util.ArrayList;
import java.util.List;

public class Reduce {

	public static void main(String[] args) {
	List<Integer> list =new ArrayList<Integer>();
		
		list.add(10);
		list.add(12);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(6);
		
		
		System.out.println(list);
		
		int sum=list.stream()
		.filter((i)->(i%2==0))
		.map((i)->(i.toString()))
		.filter((i)->i.startsWith("1"))
		.map((i)->(Integer.parseInt(i)))
		.reduce(0, (a,b)->(a+b));
		
		System.out.println("sum of even numbers = "+ sum);
	}

}
