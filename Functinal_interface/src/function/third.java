package function;

import java.util.function.Function;

public class third {

	public static void main(String[] args) {
		
		Function<Integer,Double> fun =(d)->{System.out.println("after");return Double.valueOf(d);};
		
		Function<String, Integer> fun1=(s)->{System.out.println("before");return Integer.parseInt(s);};
		
		 Function<String, Double> fun3=fun.compose(fun1);
		 
		 System.out.println(fun3.apply("10"));
	}

}
