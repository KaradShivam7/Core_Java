package function;

import java.util.function.Function;

public class second {

	public static void main(String[] args) {
		Function<Integer,String> fun = (s)->{return String.valueOf(s);};
		
		System.out.println(fun.apply(20));
		
		
	}

}
