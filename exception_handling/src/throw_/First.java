package throw_;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		
		try {
			if(age<18) {
				
				throw new Exception("age is below 18");
			}
			System.out.println("you are elligible for voting");
		}
		
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {
			System.out.println("inside finally");
		}
		
		sc.close();
	}

}
