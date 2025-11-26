package uss.in;

public class anonomus_class {

	public static void main(String[] args) {
		a a=new a() {
			public void show(String name) {
				System.out.println("name= "+name);
			}
			
		};
		a.show("shiv");

	}

}
abstract class a{
	String name;
	
	public abstract void show(String name);
}