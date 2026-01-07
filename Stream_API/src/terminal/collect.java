package terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class collect {

	public static void main(String[] args) {
        List<Integer> list =new ArrayList<Integer>();
		
		list.add(10);
		list.add(11);
		list.add(2);
		list.add(7);
		list.add(8);
		list.add(9);
		
		
		System.out.println(list);
		
		int result=list.stream().collect(new one());
		System.out.println(result);
	}

}
class one implements Collector<Integer,List<Integer>,Integer>{

	@Override
	public Supplier<List<Integer>> supplier() {
		// TODO Auto-generated method stub
		return ArrayList::new;
	}

	@Override
	public BiConsumer<List<Integer>, Integer> accumulator() {
		// TODO Auto-generated method stub
		return (list, value) -> {
		    if (value % 2 == 0) {
		        list.add(value);
		    }
		};
	}

	@Override
	public BinaryOperator<List<Integer>> combiner() {
		// TODO Auto-generated method stub
        return (list1, list2) -> {
            list1.addAll(list2);
            return list1;
        };
    }
	

	@Override
	public Function<List<Integer>, Integer> finisher() {
		// TODO Auto-generated method stub
		return list -> {
            int sum = 0;
            for (int i : list) {
                sum += i;
            }
            return sum;
        };
	}

	@Override
	public Set<Characteristics> characteristics() {
		// TODO Auto-generated method stub
		return java.util.EnumSet.noneOf(Characteristics.class);
	}

	
}