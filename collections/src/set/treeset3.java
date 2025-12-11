package set;

import java.util.Set;
import java.util.TreeSet;

public class treeset3 {

	public static void main(String[] args) {
		Set<student> set=new TreeSet<student>();
		
		set.add(new student(1,"shiv",76.34));
		set.add(new student(3,"karad",97.32));
		set.add(new student(2,"shivam",43.0));
		
		System.out.println(set);
	}

}
class student implements Comparable<student>{
	int id;
	String name;
	double marks;
	
	public student(int id,String name,double marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString() {
		return this.id+" "+this.name+" "+this.marks;
	}

	@Override
	public int compareTo(student o) {
		
		return Integer.compare(this.id, o.id);
	}
}
