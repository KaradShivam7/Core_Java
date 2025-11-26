package anonomus_class_examples;

public class Second {

	public static void main(String[] args) {
		cat c =new cat() {

			@Override
			public void sound() {
				System.out.println("cat meow");
			}
			};
			c.sound();
	}

}
interface cat{
	void sound();
}