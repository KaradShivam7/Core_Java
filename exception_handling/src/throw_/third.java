package throw_;

public class third {

	public static void main(String[] args) {
		bank b=new bank();
		b.dopayment(20000);
	}

}
class bank{
	double balance=1000;
	
	public void dopayment(int i) {
		try {
			if(balance<i) {
				throw new Exception("insufficiant fund!!!");    //checked exception
			}
			else {
				System.out.println("initiating payment!");
				System.out.println("payment done!");
				System.out.println("remaining balance = "+ (balance-i));
			}
		}
			catch(Exception ex) {
			System.out.println(ex.getMessage());	
			}
		
	}
	
}