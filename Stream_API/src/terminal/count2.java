package terminal;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class count2 {

	public static void main(String[] args) {
		
	}

}
class MapCollector implements Collector<String, LinkedHashMap<Integer,String>, LinkedHashMap<Integer,String>>
{

	@Override
	public Supplier<LinkedHashMap<Integer, String>> supplier() {
		  return () ->(new LinkedHashMap<Integer, String>());
	}

	@Override
	public BiConsumer<LinkedHashMap<Integer, String>, String> accumulator() {
		return (t,s)->{
			t.put(s.length(), s);
		};
	}

	@Override
	public BinaryOperator<LinkedHashMap<Integer, String>> combiner() {
		      return(m,u)->{
		    	  m.putAll(u);
		    	  return m;
		      };
	}

	@Override
	public Function<LinkedHashMap<Integer, String>, LinkedHashMap<Integer, String>> finisher() {
		return Function.identity();
	}

	@Override
	public Set<Characteristics> characteristics() {
		 return new HashSet<Collector.Characteristics>();
	}
	
}