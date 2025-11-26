package hashcode;

import java.util.Objects;

public class Second {

	public static void main(String[] args) {
		student s=new student("shiv",1);
		student s1=new student("shiv",1);
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}

}
class student extends Object{
	String name;
	int id;
	
	public student(String name,int id) {
		this.name=name;
		this.id=id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,id);
	}
	
	
	
}