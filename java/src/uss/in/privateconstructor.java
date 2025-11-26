package uss.in;
class contr{
	private int age;
	private contr(){
		System.out.println("inside private constructor(parameter-less)");
	}
	
	private contr(int age) {
		this.age=age;
		System.out.println("inside private paramitrized constructor");
	}
	 
	
	static void show() {
		contr m=new contr();
	}
	static void print() {
		contr c= new contr(23);
	}
}
public class privateconstructor {

	public static void main(String[] args) {
		
		contr.show();
		
		contr.print();
		
		

	}

}
