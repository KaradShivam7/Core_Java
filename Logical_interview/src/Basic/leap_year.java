package Basic;

class leap_year
{
 public static void main(String[] args)
  {
     int Year=300;

     if((Year%4==0) && (Year%100!=0) || (Year%400==0))
      {
       System.out.println(" a leap year");
      }

     else
         {
           System.out.println(" not a leap year");
         }
  }
}