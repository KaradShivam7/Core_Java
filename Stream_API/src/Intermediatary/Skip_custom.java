package Intermediatary;

import java.util.ArrayList;
import java.util.List;

public class Skip_custom {

	public static void main(String[] args) {
		college c=new college("pktc",6768);
		college c1=new college("plgpl",1001);
		college c2=new college("uss",456);
		college c3=new college("skn",6769);
		
		List<college> list =new ArrayList<college>();
		
		list.add(c);
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		list.stream()
		.skip(1)
		.forEach((i)->{System.out.println(i);});
		
	}

}
class college{
	String name;
	int code;
	
	public college(String name,int id) {
		this.name=name;
		code=id;
	}
	
	public String toString() {
		return name+" "+code;
	}
}