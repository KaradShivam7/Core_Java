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
import java.util.stream.Collector.Characteristics;

public class collect1 {

	public static void main(String[] args) {
		List<String> list=List.of("abc","xyzs","mp");
		
		List<Integer> list1=list.stream().collect(new String_Collector1());
		System.out.println(list1);
	}

}
class String_Collector1 implements Collector<String, List<Integer>, List<Integer>>
{

	@Override
	public Supplier<List<Integer>> supplier() {
		// TODO Auto-generated method stub
		return ArrayList::new;
	}

	@Override
	public BiConsumer<List<Integer>, String> accumulator() {
		return (list,s)->{
			list.add(s.length());
		};
	}

	@Override
	public BinaryOperator<List<Integer>> combiner() {
		return (sb,sb1)->{
			sb.addAll(sb1);
			return sb;
		};
	}

	@Override
	public Function<List<Integer>, List<Integer>> finisher() {
		 return Function.identity();
	}

	@Override
	public Set<Characteristics> characteristics() {
		HashSet<Characteristics>  set=new HashSet<Characteristics>();
		set.add( Characteristics.IDENTITY_FINISH);
		return set;
	}
	
}