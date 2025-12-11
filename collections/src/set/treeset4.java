package set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class treeset4 {

	public static void main(String[] args) {
		Set<student1> set=new TreeSet<student1>(new markschecker());
		
		set.add(new student1(1,"shiv",76.34));
		set.add(new student1(3,"karad",97.32));
		set.add(new student1(2,"shivam",43.0));
		
		System.out.println(set);
	}

}
class student1 implements Comparable<student1>{
	int id;
	String name;
	double marks;
	
	public student1(int id,String name,double marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString() {
		return this.id+" "+this.name+" "+this.marks;
	}

	@Override
	public int compareTo(student1 o) {
		
		return this.id-o.id;
	}
}
class markschecker implements Comparator<student1>{

	@Override
	public int compare(student1 o1, student1 o2) {
		
		return Double.compare(o1.marks, o2.marks);
	}
  
	
}