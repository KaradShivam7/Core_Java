package Basic;

import java.util.Scanner;
class factorial
{
   public static void main(String[] args)
	{
          Scanner sc=new Scanner(System.in);
          System.out.print("enter any number: ");
          int num=sc.nextInt();
          int factorial=1;
          for(int i=num; i>=1;i--)
             {
               factorial*=i;
             }
              System.out.println("factorial of " + num + " is: "+factorial);
	}
}
