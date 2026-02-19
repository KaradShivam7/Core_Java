package NQT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(Character c:s.toCharArray()) {
			int count=1;
			if(map.containsKey(c)) {
				count=map.get(c)+1;
				map.put(c, count);
			}
			else {
				map.put(c, count);
			}
			
		}
		
		System.out.println(map);
		
		int sum=0;
		
		for(char ch:map.keySet()) {
			int value=map.get(ch);
			
			if(value%2==0) {
				sum+=value;
			}
		}
		
		System.out.println(sum);
		
	}

}
