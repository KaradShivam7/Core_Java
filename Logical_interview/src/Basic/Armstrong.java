package Basic;

class Armstrong
{
     public static void main(String[] args)
	{
 	  int number=144,orignal_no,reminder,result=0;
          orignal_no=number;
          while(orignal_no!=0)
		{
		  reminder=orignal_no%10;
		  result+=Math.pow(reminder,3);
                  orignal_no/=10;
		}
                if(result==number)
		  {
                    System.out.println("it is a Armstrong number");
		  }
		  else
		      {
                        System.out.println("it is not a armstronng number");
                      }
	}
}