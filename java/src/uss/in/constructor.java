package uss.in;

class man{
	String name;
	int age;
	String mobile_no;
	
	public man() {
	    name="shiv";
	    age=23;
	    mobile_no="8329870807";
	}
	
	public man(String name,int age,String mobile_no) {
	this.name=name;
	this.age=age;
	this.mobile_no=mobile_no;
	}
	
	void show() {
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("mobile_no="+mobile_no);
	}
	
}
public class constructor {

	public static void main(String[] args) {
//	man p=new man();
//	p.show();
//	
	man m=new man("karad",21,"9405842855");
	m.show();
	}

}

