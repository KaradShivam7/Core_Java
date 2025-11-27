package function;

import java.util.function.Function;
public class first {

	public static void main(String[] args) {
		
		
		Function<Integer,Integer> fun = (t)->{return t;};
		
		System.out.println(fun.apply(10));

	}

}
