package uss.in;
import java.util.Scanner;
public class scanner {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the value of number:");
		int num=sc.nextInt();
		System.out.println("number:"+num);
		sc.close();

	}
		public static void main1(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.print("enter your name:");
			String name=sc.nextLine();
			System.out.println("name:"+name);
			sc.close();
		}
		public static void main2(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.print("enter your salary:");
			float salary=sc.nextFloat();
			System.out.println("salary:"+salary);
			sc.close();
		}
}
