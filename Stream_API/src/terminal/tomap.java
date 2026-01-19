package terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class tomap {

	public static void main(String[] args) {
		List<Integer> list =List.of(2,4,6,8,4,3);
		                                                                                  //merge function
		Map<Integer,Integer> map=list.stream().collect(Collectors.toMap((i)->(i), (i)->(i),(a,b)->(a)));
		
		System.out.println(map);
	}

}
