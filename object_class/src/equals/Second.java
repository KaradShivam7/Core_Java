package equals;

public class Second {

	public static void main(String[] args) {
		main m=new main("shiv",1);
		main m1=new main("shiv",1);
		
		System.out.println(m.equals(m1));
	}

}
class main{
	String name;
	int id;
	
	public main(String name,int id) {
		this.name=name;
		this.id=id;
	}
}