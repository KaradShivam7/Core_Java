package method_reference;

import java.util.Arrays;
import java.util.List;

public class static_1 {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(10,20,33,11,53,67,84,20);
		
		list.stream().filter(even::check).forEach(System.out::println);
	}

}
class even{
	public static boolean check(Integer i) {
		return i%2==0;
	}		
}