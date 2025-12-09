package Basic;

import java.util.Scanner;
class prime_number
{
    public static void main(String[] args)
	{  
           int count=0;
           Scanner sc = new Scanner(System.in);
           System.out.print("enter any number: ");
           int num=sc.nextInt();

           for(int i=2;i<num;i++)
           {
              if(num%i==0)
		{
                  count++;
		  break;
		}
	   }
                if(count==0)
		  {
                    System.out.println(num + " it is a prime number!");
		  }
		   else
			{
                          System.out.println(num + " it is not a prime number!");
			}
	   
	}
}