package custom_exception;

public class First {

	public static void main(String[] args) {
	     BankAccount acc = new BankAccount();
	     try {
	         acc.withdraw(1500); // throws custom exception
	     } catch (InsufficientBalanceException e) {
	         System.out.println("Handled:: " + e.getMessage());
	     }
	}

}
//Custom checked exception
class InsufficientBalanceException extends Exception {
 InsufficientBalanceException(String message) {
     super(message);
 }
}

class BankAccount {
 private double balance = 1000;

 public void withdraw(double amount) throws InsufficientBalanceException {
     if (amount > balance) {
         throw new InsufficientBalanceException("Withdrawal failed: Insufficient balance!");
     }
     balance -= amount;
     System.out.println("Withdrawal successful. Remaining balance: " + balance);
 }
}

