package single_level;

public class second {

	public static void main(String[] args) {
		honda h=new honda();
		
		h.show();
		h.print();
	}

}
class bike{
	String color;
	int year;
	
	public bike() {
		color="red";
		year=2025;
	}
	
	public void show() {
		System.out.println("color= "+ color);
		System.out.println("year= "+ year);
	}
}
class honda extends bike{
	int id;
	String name;
	int avg;
	
	public honda() {
		id=1;
		name="shine";
		avg=55;
	}
	
	public void print() {
		System.out.println("id= "+ id);
		System.out.println("name= "+ name);
		System.out.println("avg= "+ avg);
	}
	
}