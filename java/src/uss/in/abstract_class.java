package uss.in;

public class abstract_class {

	public static void main(String[] args) {
//		mans m=new mans();
//		
//		m.no_of_people="12";
//		m.show();
		
		people p=new mans();
		p.no_of_people="1234";
		p.show();

	}

}
abstract class people{
	String no_of_people;
	
	public abstract void show();
}
class mans extends people{

	
	public void show() {
		System.out.println("total no of people= "+no_of_people);
		
	}
	
}