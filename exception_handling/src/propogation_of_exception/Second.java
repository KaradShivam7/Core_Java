package propogation_of_exception;

public class Second {

	public static void main(String[] args) {
		
		Test1 t = new Test1();
        try {
            t.b(); // handled in main
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main()");
        }
    }
	}

class Test1 {
    void a() {
        int data = 10 / 0; // ArithmeticException
    }
    void b() {
        a(); // propagates
    }
}
