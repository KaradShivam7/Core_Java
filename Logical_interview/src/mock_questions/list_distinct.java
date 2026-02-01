package mock_questions;

import java.util.Arrays;
import java.util.List;

public class list_distinct {

	public static void main(String[] args) {
		List<String> list =Arrays.asList("asdf","asdfde","kjhgfd","edfgbnm","pj","oih","sd","ert","wedfcxaqwed");
	 
		list.stream().map(String::length).distinct().sorted((o1,o2)->(o2-o1)).forEach(System.out::println);
	
	}

}
