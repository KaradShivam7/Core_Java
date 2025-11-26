package uss.in;

public class multi_level {

	public static void main(String[] args) {
		
		worker w=new worker();
		
		w.name_company="tcs";
		w.name_hr="karad";
		w.name="shiv";
		w.display();
		
	}

}
class company{
	String name_company;
	
	public void show() {
		System.out.println("company name= "+name_company);
	}
}
class hr extends company{
	String name_hr;
   
	public void print() {
		super.show();
		System.out.println("hr name= "+this.name_hr);
	}
}
class worker extends hr{
	String name;
	
	public void display() {
		super.print();
		System.out.println("worker name= "+this.name);
	}
}