package equals;
import java.util.Objects;
public class third {

	public static void main(String[] args) {
		student s=new student("shiv",1);
		student s1=new student("shiv",1);
		System.out.println(s.equals(s1));
		
		System.out.println("*******************************");
		
		student s3=new student("karad",1);
		student s4=new student("abc",19);
		System.out.println(s3.equals(s4));
	}

}
class student{
	String name;
	int id;
	
	public student(String name,int id) {
		this.name=name;
		this.id=id;
	}
	
	public int hashCode() {
		return Objects.hash(name,id);
	}
	
	public boolean equals(Object obj) {
		if(obj.getClass() != this.getClass()) {
			return false;
		}
		student s2=(student)obj;
		
		return this.name.equals(s2.name)&&this.id==s2.id;
		
	}
}