package supplier;

import java.util.function.Supplier;

public class First {

	public static void main(String[] args) {
		
		  Supplier<Double> sup=()->{ return Math.random()*10000;};
	        
	        
	        System.out.println(sup.get().intValue());
			
		
	}

}
