package set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class hashset_2 {

	public static void main(String args[])
	{
		
		Set<Bike> two_wheeleers=new HashSet<Bike>();
		
		
		Bike bike=new Bike(1,"DUCATI", 3456.78);
		
		Bike bike2=new Bike(2,"KAWASAKI", 6789.67);
		
		
		Bike bike3=new Bike(3,"KAWASAKI", 6789.67);
		
		
		System.out.println(bike2.hashCode());
		System.out.println(bike3.hashCode());
		two_wheeleers.add(bike2);
		two_wheeleers.add(bike);
		two_wheeleers.add(bike3);
		
		System.out.println(two_wheeleers);
		
		System.out.println(bike.equals(bike));
	}
}


class Bike
{
	int id;
	String name;
	double price;

	public Bike(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public  int hashCode()
	{
		
		return  Objects.hash(this.id,this.name,this.price);
	}
	
	
	public boolean equals(Object o)
	{
		Bike b=(Bike)o;
		
		return this.id==b.id && this.price==b.price && this.name.equals(b.name);
		
		
	}
	
	public String toString()
	{
		return "Bike:"+this.id;
	}
	
}