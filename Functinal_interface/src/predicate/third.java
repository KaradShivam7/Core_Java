package predicate;

import java.util.function.Predicate;

public class third {

	public static void main(String[] args) {
		
		
		Predicate<String> pred = (s)->{return s.equals("shiv");};
		
		System.out.println(pred.test("shiv"));
		System.out.println("*******************");
		System.out.println(pred.test("karad"));
		
	}

}
