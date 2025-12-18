
package mock_questions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class list_of_list {

 static int sum=0;
	public static void main(String[] args) {
		
	 List<Integer> list1=Arrays.asList(10,20,30,50);
	 
	 List<Integer> list2=Arrays.asList(50,60,60,70);
	 
	 List<List<Integer>> two_d=Arrays.asList(list1,list2);

	 
	 two_d.stream().forEach((i)->{i.stream().forEach((j)->{sum=sum+j;});});
	 
	// two_d.stream().map(new ListAdder()).forEach((i)->{sum=sum+i;});
	 
	 System.out.println(sum);

	}

}


class ListAdder implements Function<List<Integer>, Integer>
{

	@Override
	public Integer apply(List<Integer> t) {
		int sum=0;
		for(int i :t)
		{
			sum=sum+i;
		}
		return sum;
	}
	
}
