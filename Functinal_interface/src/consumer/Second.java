package consumer;

import java.util.function.Consumer;

public class Second {

	public static void main(String[] args) {
		
		Consumer<String> con =(s)->{System.out.println(s+" karad");};
		
		con.accept("shivam");
	}

}
