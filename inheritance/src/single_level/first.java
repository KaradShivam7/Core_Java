package single_level;

public class first {

	public static void main(String[] args) {
		student s=new student();
		s.DTECODE=6768;
		s.College_name="pktc";
		s.id=1;
		s.name="shivam";
		
		System.out.println(s.DTECODE +" "+ s.College_name);
		System.out.println(s.id +" "+ s.name);
	}

}
class college {
	int DTECODE;
	String College_name;
}
class student extends college{
	int id;
	String name;
}