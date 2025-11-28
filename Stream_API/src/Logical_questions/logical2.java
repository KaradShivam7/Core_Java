package Logical_questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class logical2 {

	public static void main(String[] args) {
		//{1,2,3,2,4,1,5,78,3,0,2,3,9,5,0}
		//count distinct and return in descending order
		
		int [] arr= {1,2,3,2,4,1,5,78,3,0,2,3,9,5,0};
		
		List<Integer> list =new ArrayList<Integer>();
		
		for(int i:arr) {
			list.add(i);
		}
		
		System.out.println(list);
		
		list.stream()
		.distinct()
		.sorted(new rev())
		.forEach((i)->{System.out.println(i);});
	}

}
class rev implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}
	
}