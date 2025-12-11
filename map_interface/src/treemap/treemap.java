package treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {
		Map<Integer,String> map =new TreeMap<Integer,String>(new idchecker());
		
		map.put(1, "shiv");
		map.put(2, "shivam");
		map.put(3, "karad");
		
		System.out.println(map);
	}

}
class idchecker implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2, o1);
	}
	
}