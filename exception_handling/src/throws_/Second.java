package throws_;

public class Second {

	public static void main(String[] args) {
		 Bank bank = new Bank();
	        try {
	            bank.withdraw(2500); // more than balance
	        } catch (Exception e) {
	            System.out.println("Exception caught: " + e.getMessage());
	}

}
}
class Bank {
    void withdraw(double amount) throws Exception {
        double balance = 1000;
        if (amount > balance) {
            // explicitly throwing an exception
            throw new Exception("Insufficient Balance!");
        } else {
            System.out.println("Withdrawal successful. Remaining balance: " + (balance - amount));
        }
    }
}


