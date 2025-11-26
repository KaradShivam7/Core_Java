package hashcode;

public class First {

	public static void main(String[] args) {
		String str="shiv";
		String str1="shiv";
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		System.out.println("*********************");
		
		String s="shiv";
		String s1="karad";
		System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        
        System.out.println("**********************");
        
        main m=new main("shiv",1);
        main m1=new main("shiv",1);
        System.out.println(m.hashCode());
        System.out.println(m1.hashCode());
	}

}
class main extends Object{
	String name;
	int id;
	
	public main(String name,int id) {
		this.name=name;
		this.id=id;
	}
}