package terminal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class colect4 {

	public static void main(String[] args) {
		List<Integer> list =List.of(1,2,4,7,9,5,2,5,8,0,4,2,4);
		
		
		int k=list.stream().collect(new even_collector());
		System.out.println(k);
		

	}

}
class even_collector implements Collector<Integer,List<Integer>,Integer>{

	@Override
	public Supplier<List<Integer>> supplier() {
		// TODO Auto-generated method stub
		return ArrayList::new;
	}

	@Override
	public BiConsumer<List<Integer>, Integer> accumulator() {
		// TODO Auto-generated method stub
		return (list,i)->{
			if(i%2==0) {
			list.add(i);
			}
		};
	}

	@Override
	public BinaryOperator<List<Integer>> combiner() {
		// TODO Auto-generated method stub
		return (list,list1)->{
			list.addAll(list1);
			return list;
		};
	}

	@Override
	public Function<List<Integer>, Integer> finisher() {
		// TODO Auto-generated method stub
		return (list)->{
			int sum = 0;
			for(int i:list) {
				sum+=i;
			}
			return sum;
		};
	}

	@Override
	public Set<Characteristics> characteristics() {
		// TODO Auto-generated method stub
		return new HashSet<Collector.Characteristics>();
	}
	
}