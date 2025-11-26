package consumer;

import java.util.function.Consumer;

public class first {

	public static void main(String[] args) {
		
		Consumer<Integer> con = (i)->{System.out.println(i*2);};
		
		con.accept(10);
	}

}
