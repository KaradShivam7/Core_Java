package mock_questions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class String_first_to_lowercase {

	public static void main(String[] args) {
		List<StringBuffer> list=new ArrayList<StringBuffer>();
		list.add(new StringBuffer("SHIV"));
		list.add(new StringBuffer("KARAD"));
		list.add(new StringBuffer("LATUR"));
		
		System.out.println(list);
		
		
		list.stream().map(converter::str).forEach(System.out::println);
	}

}
class converter  {


	public static String str(StringBuffer sb) {
		Character c=sb.charAt(0);
		String s=c.toString(c).toLowerCase();
		sb.replace(0, 1, s);
		return sb.toString();
	}
	

}