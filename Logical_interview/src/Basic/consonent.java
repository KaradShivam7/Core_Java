package Basic;

import java.util.Scanner;
class consonant
{
    public static void main(String[] args)
	{
          Scanner obj = new Scanner(System.in);
	  System.out.print("enter any character:-");
          char ch=obj.next().charAt(0);

           if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
		  System.out.println("given character is vowel");
		}

		else
		    {
                      System.out.println("given character is consonant");
		    }
	}
}
