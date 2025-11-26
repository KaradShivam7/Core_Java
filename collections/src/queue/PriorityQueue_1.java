
package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_1 {

	public static void main(String[] args) {
		

		Queue<Bag> qu=new PriorityQueue<Bag>();
		
		qu.add(new Bag("Black",1234.67));
		qu.add(new Bag("Red",500.89));
		qu.add(new Bag("Blue",790.90));
		qu.add(new Bag("Blue",500.90));
		
	    //qu.add(null); null not allowed
		System.out.println(qu.poll());
		System.out.println(qu.remove());
        System.out.println(qu.remove());
		System.out.println(qu.remove());
		
		System.out.println("****");
   
		System.out.println(qu.poll());


	}

}

class  Bag implements Comparable<Bag>
{
	 String colour;
	 double price;
	 
	 public Bag(String colour, double price)
	 {
		 this.colour=colour;
		 this.price=price;
	 }
	 
	 public String toString()
	 {
		 return this.price+" ";
	 }

	 @Override
	 public int compareTo(Bag o) {
		 
		return Double.compare(this.price, o.price);
	 }
}
