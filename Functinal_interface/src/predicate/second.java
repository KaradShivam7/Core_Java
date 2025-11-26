package predicate;

import java.util.function.Predicate;

public class second {

	public static void main(String[] args) {
		
		
		Predicate<Integer> pred = (i)->{return i==10;};
		
		System.out.println(pred.test(5));
		System.out.println("**************************");
		System.out.println(pred.test(10));
	}

}
