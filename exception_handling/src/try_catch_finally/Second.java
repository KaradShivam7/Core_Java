package try_catch_finally;

public class Second {

	public static void main(String[] args) {
		int i=10;
		int j=0;
		
		try {
			System.out.println(i/j);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("inside finally");
			
		}
	}

}
