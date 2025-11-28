package Intermediatary;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class distinct_1 {

	public static void main(String[] args) {
		
		mobile m=new mobile(1111,"poco");
		mobile m1=new mobile(1111,"poco");
		mobile m2=new mobile(1111,"poco");
		mobile m3=new mobile(1111,"poco");
		
		List<mobile> list=new ArrayList<mobile>();
		list.add(m3);
		list.add(m2);
		list.add(m1);
		list.add(m);
		
		System.out.println(list);
		
		list.stream().distinct().forEach((i)->{System.out.println(i);});
		
	}

}
class mobile{
	double amount;
	String name;
	
	public mobile(double amount,String name) {
		this.amount=amount;
		this.name=name;
		}
		
		 public String toString() {
		        return amount+ " "+name;
		    }
		 
		 public int hashCode() {
			 return Objects.hash(this.amount,this.name);
		 }
		 
		 public boolean equals(Object obj) {
			 mobile m7=(mobile)obj;
			 return this.amount==m7.amount&&this.name.equals(m7.name);
		 }
		
	
}