package uss.in;
class person{
	String name="shiv";
	int age=23;
	
	public void show(){
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
}
public class classobject {
	public static void main(String[]args) {
		person p=new person();
		p.show();
	}

}
