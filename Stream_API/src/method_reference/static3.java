package method_reference;

import java.util.Arrays;
import java.util.List;

public class static3 {

	public static void main(String[] args) {
		List<String> list =Arrays.asList("karad","kaka","karanataka","maharastra","latur");
		
		list.stream().filter(check::end)
		.map(check::change)
		.map(StringBuffer::reverse)
		.map(StringBuffer::toString)
		.map(String::toUpperCase)
		.forEach(System.out::println);
	}

}
class check{
	public static boolean end(String s) {
		return s.endsWith("a");
	}
	
	public static StringBuffer change(String s) {
		return new StringBuffer(s);
		
	}
}