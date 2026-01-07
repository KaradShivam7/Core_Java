package optional_class;

import java.util.Optional;

public class second {

	public static void main(String[] args) {
		Optional<String> ops = Optional.ofNullable("Shivam");
		Optional<String> ops1 = Optional.empty();
		
		
		System.out.println(ops.filter((i)->(i.startsWith("S"))));
		System.out.println("****************");
		
		System.out.println(ops.isPresent());
		System.out.println("****************");
		
		System.out.println(ops.isEmpty());
		System.out.println("****************");
		
		ops.ifPresent((i)->{System.out.println(i);});
		System.out.println("****************");
		
		ops1.ifPresentOrElse((i)->{System.out.println(i);}, ()->{System.out.println("karad");});
		System.out.println("****************");
		
		
	}

}
