package uss.in;

public class hirarchical {

	public static void main(String[] args) {
//		tiger t=new tiger();
//		
//		t.no_of_animal=100;
//		t.no_of_tiger=7;
//		t.display();
		
		lion l=new lion();
		l.no_of_animal=20;
		l.no_of_lion=3;
		l.print();
	}

}
class animal{
	int no_of_animal;
	
	public void show() {
		System.out.println("total no of animals= "+no_of_animal);
		
	}
}
class lion extends animal{
	int no_of_lion;
	
	public void print() {
		super.show();
		System.out.println("total no of lion= "+no_of_lion);
	}
}
class tiger extends animal{
	int no_of_tiger;
	
	public void display() {
		super.show();
		System.out.println("total no of tiger= "+no_of_tiger);
	}
}