package Basic;

import java.util.Scanner;
class Swapping
{
    public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
          System.out.print("enter value of n: ");
          int n=sc.nextInt();
          System.out.print("enter value of m: ");
          int m=sc.nextInt();
         
	  n=n+m;
          m=n-m;
          n=n-m;



System.out.println("value of n is: "+n);
System.out.println("value of m is: "+m);

sc.close();
	}
}