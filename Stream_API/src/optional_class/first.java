package optional_class;

import java.util.Optional;

public class first {

	public static void main(String[] args) {
		Optional<String> ops = Optional.of("Shivam");
		
		System.out.println(ops);
		System.out.println("******************");
		
		Optional<String> ops1=Optional.empty();
		System.out.println(ops1);
		System.out.println("******************");
		
		Optional<String> ops2 = Optional.ofNullable(null);
		System.out.println(ops2);
		System.out.println("******************");
		
		Optional<String> ops3 = Optional.ofNullable("Karad");
		System.out.println(ops3);
	}

}
