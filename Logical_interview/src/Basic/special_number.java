package Basic;

import java.util.Scanner;
class specialno
{
     public static void main(String[] args)
	{
          Scanner obj = new Scanner(System.in);
	  System.out.print("enter three digit number:-");
	  int n=obj.nextInt();
         int f_n=n%10;
int num=n/10;
int middle=num%10;
int s_n=num/10;
int n2=f_n+s_n;

                    if(n2==middle)
		{
                   System.out.println("special number");
		}

		else
		    {
                       System.out.println("not a special number");
		    }



	}
}