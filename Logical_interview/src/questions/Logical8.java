package questions;

import java.util.HashMap;
import java.util.Map;

public class Logical8 {

	public static void main(String[] args) {
		String str="mahendra sing dhoni";
		str.toUpperCase();
		char[] chars=str.toCharArray();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<chars.length;i++) {
			int count=1;
			if(map.containsKey(chars[i])) {
				count=map.get(chars[i])+1;
				map.put(chars[i], count);
			}
			else {
				map.put(chars[i], count);
			}
			
		}
		System.out.println(map);
	}

}
