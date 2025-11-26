package uss.in;

public class single_level {

	public static void main(String[] args) {
		vehicle v=new car("shiv",23,101,20.5f);//polymorphic object or upcasting
		car c=(car) v;//downcasting
		
		c.print();

	}

}
class vehicle{
	String name;
	int age;
	
	public vehicle() {}
	public vehicle(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void show() {
		System.out.println("name= "+name);
		System.out.println("age= "+age);
	}
}
class car extends vehicle{
	int empid;
	float salary;
	
	public car() {}
	public car(String name,int age,int empid,float salary) {
		super(name,age);
		this.empid=empid;
		this.salary=salary;
	}
	
	public void print() {
		super.show();
		System.out.println("empid= "+empid);
		System.out.println("salary= "+salary);
	}
	
	
	
}