package Basic;

import java.util.Scanner;
class ascii
{
   public static void main(String[] args)
	{
          Scanner sc=new Scanner(System.in);
          System.out.print("enter any character: ");
          char ch=sc.next().charAt(0);
          int ascii=ch;

          System.out.println("ascii value of given character is: " + ascii);

        }
}
