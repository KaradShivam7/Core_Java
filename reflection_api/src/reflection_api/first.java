package reflection_api;

public class first {

	public static void main(String[] args) {
	 student st=new student();
		Class<?> cl= st.getClass();
		
		System.out.println(cl);
	}

}
class student{
	
}