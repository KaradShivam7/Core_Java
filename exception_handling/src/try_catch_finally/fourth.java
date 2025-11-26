package try_catch_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class fourth {

	public static void main(String[] args) {
		int str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		
		try {
			str=sc.nextInt();
			System.out.println(str);
			}
		catch(InputMismatchException | IllegalStateException e) {
			System.out.println(e.getMessage());
		}
	
		finally {
			System.out.println("inside finally");
		}
		sc.close();
	}

}

