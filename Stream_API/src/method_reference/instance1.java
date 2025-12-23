package method_reference;

import java.util.Arrays;
import java.util.List;

public class instance1 {
	static int sum=0;
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(10,20,30,1,3,7,8,11);
		
		demo_ d=new demo_();
		
		list.stream()
		.filter(d::check)
		.map(d::square)
		.forEach(d::print);
		
		System.out.println(sum);
	}

}
class demo_{
	public boolean check(Integer i) {
		return i%2!=0;
	}
	
	public int square(Integer i) {
		return i*i;
	}
	public void print(Integer i) {
		instance1.sum+=i;
		System.out.println(i);
	}
}