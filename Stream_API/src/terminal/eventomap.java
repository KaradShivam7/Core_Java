package terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class eventomap {

	public static void main(String[] args) {
		List<Integer> list=List.of(1,3,45,3,7,52,2,5,7,0,7,4,2,6,8);
		
		Map<String, List<Integer>> map=list.stream()
				.collect(Collectors.groupingBy((i)->(i%2==0 ? "even":"odd")));
		
		System.out.println("even: "+map.get("even"));
		System.out.println("odd: "+map.get("odd"));

	}

}
