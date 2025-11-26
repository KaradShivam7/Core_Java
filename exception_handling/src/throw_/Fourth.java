package throw_;

public class Fourth {

	public static void main(String[] args) {
	calculator c=new calculator();
	try {
	c.div(10, 2);
	}
	catch(ArithmeticException ex) {
		System.out.println("exception caused: " +ex.getMessage());
	}
	}

}
class calculator{

	public void div(int a,int b){
		if(b==0) {
			throw new ArithmeticException("can not divide number by zero");
		}
		System.out.println(a+"/"+b+"=" +a/b);
	}
}