package throws_;

public class First {
	public static void main(String[] args) {
		  Calculator calc = new Calculator();
	        try {
	            System.out.println(calc.divide(10, 0));
	        } catch (ArithmeticException e) {
	            System.out.println("Handled:: " + e.getMessage());
	}
}
}

	class Calculator {
	    int divide(int a, int b) throws ArithmeticException {
	        if (b == 0) {
	            throw new ArithmeticException("Division by zero not allowed!");
	        }
	        return a / b;
	    }
	}
