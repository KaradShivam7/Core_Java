package Basic;

public class leftside_starpattern_reverse 
{
    public static void main(String[] args)
	{
          int i,j,space;
	  
	  for(i=5;i<=1;i--)
	      {
                for(space=5;space<=(1-i);space++)
		{
                  System.out.print(" ");
		}
                   for(j=1;j<=i;j++)
                     {
		       System.out.print("*");
		     }
                     System.out.println(" ");
              }
	}
}