package propogation_of_exception;

public class first {

	public static void main(String[] args) {
		 Test t = new Test();
	        t.c();
	        System.out.println("Normal flow continues..");
	}

}
class Test {
   public void a() {
        int num = 50 / 0; // ArithmeticException
    }
   public void b() {
        a(); // exception propagates here
    }
   public void c() {
        try {
            b(); // exception propagates here
        } catch (ArithmeticException e) {
            System.out.println("exception handled in c!");
        }
    }
}