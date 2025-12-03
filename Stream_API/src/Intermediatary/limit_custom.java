package Intermediatary;

import java.util.ArrayList;
import java.util.List;

public class limit_custom {

	public static void main(String[] args) {
		List<student10> list =new ArrayList<student10>();
		
		list.add(new student10("shivam",1,12.3f));
		list.add(new student10("shiva",2,1.34f));
		list.add(new student10("shiv",3,12.39f));
		list.add(new student10("shi",4,12.38f));
		list.add(new student10("shivama",5,12.35f));
		
		System.out.println(list);
		
		list.stream()
		.limit(2)
		.forEach((i)->{System.out.println(i);});
	}

}
class student10 {
	String name;
	int id;
	float marks;
	
	public student10(String name,int id,float marks){
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	
	public String toString() {
		return name+" "+id+" "+marks;
	}
}