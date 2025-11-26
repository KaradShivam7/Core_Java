package parameterized_contr;

public class first {

	public static void main(String[] args) {
		student s=new student(1,"shiv");
		
		System.out.println("id="+s.id+" name="+s.name);
	}

}
class student{
	int id;
	String name;
	
	public student(int i,String n) {
		System.out.println("inside parameterizred constructor");
		id=i;
		name=n;
		
	}
}