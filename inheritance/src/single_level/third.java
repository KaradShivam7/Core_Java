package single_level;

public class third {

	public static void main(String[] args) {
		animal a=new animal("tiger",10,"amazon","1000acer");
		a.print();
	}
}
class jungle{
	String jungle_name;
	String area;
	
	public jungle(String jungle_name,String area) {
		this.jungle_name=jungle_name;
		this.area=area;
	}
	
	public void show() {
		System.out.println("jungle_name = "+jungle_name);
		System.out.println("area = "+area);
	}
}

class animal extends jungle{
	
	String animal_name;
	int age;

	public animal(String animal_name,int age,String jungle_name, String area) {
		super(jungle_name, area);
		this.animal_name=animal_name;
		this.age=age;
	}
	
	public void print() {
		System.out.println("animal_name = "+animal_name);
		System.out.println("age = "+ age);
		super.show();
	}
	
}