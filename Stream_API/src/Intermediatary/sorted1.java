package Intermediatary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class sorted1 {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(70);
		list.add(40);
		list.add(5);
		
		list.stream().sorted(new reverse()).forEach((i)->{System.out.println(i);});
	}

}
class reverse implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}
	
}