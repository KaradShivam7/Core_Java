package anonomus_class_examples;

public class First {

	public static void main(String[] args) {
        dog d = new dog() {
            public void Sound() {
                System.out.println("dog barks");
            }
        };

        d.Sound();
	}

}
abstract class dog {
    public abstract void Sound() ;
    
}
