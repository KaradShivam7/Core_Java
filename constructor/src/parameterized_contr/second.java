package parameterized_contr;

public class second {

	public static void main(String[] args) {
		

		car c=new car("creta",1567890);
		c.show();
	}

}
class car{
	String name;
	double price;
	
	public car(String name,double price) {
		this.name=name;
		this.price=price;
	}
	
	public void show(){
		System.out.println("name="+name);
		System.out.println("price="+price);
	}
}