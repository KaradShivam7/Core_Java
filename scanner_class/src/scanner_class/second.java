package scanner_class;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the value of number:");
		int num=sc.nextInt();
		System.out.println("number:"+num);
		sc.close();
	}

}
