package try_catch_finally;

public class first {

	public static void main(String[] args) {
		int i=10;
		int j=0;
		
		
		try {
			int k=i/j;
		}
		finally{
			System.out.println("inside finally");
		}
	
	}

}
