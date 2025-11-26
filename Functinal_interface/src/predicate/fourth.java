package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class fourth {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		System.out.println("**************");
		
		Predicate<List<Integer>> pred = (l)->{return list.size()==5;};
		
		System.out.println(pred.test(list));

}
}
