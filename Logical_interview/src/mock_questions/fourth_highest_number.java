package mock_questions;

import java.util.Arrays;
import java.util.List;

public class fourth_highest_number {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		
		list.stream().sorted((o1,o2)->(o2-o1)).skip(3).limit(1).forEach(System.out::println);
	}

}
