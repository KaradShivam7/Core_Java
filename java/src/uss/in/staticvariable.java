package uss.in;
class main {
	static String name;
	int age;
	
	static void show() {
		System.out.println("name= " +name);
		//System.out.println("age="+ age); not allowed
	}
	
	void print() {
		System.out.println("age= " + age);
	}
	static {
	name="shiv";
    }
	main(int a){
		age=a;
	}
}
public class staticvariable {

	public static void main(String[] args) {
		main m=new main(21);
		
		main.show();
		m.print();

	}

}
