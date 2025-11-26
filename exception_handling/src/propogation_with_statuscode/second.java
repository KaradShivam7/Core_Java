package propogation_with_statuscode;

public class second {

	public static void main(String[] args) {
		 BankAccount acc = new BankAccount();
	        try {
	            acc.withdraw(1500); // invalid withdrawal
	        } catch (BankException e) {
	            System.out.println("Error: " + e.getMessage() +
	                               " | Status Code: " + e.getStatusCode());
	        }
	}

}
class BankException extends Exception {
    private int statusCode;

    BankException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}

class BankAccount {
    private double balance = 1000;

    void withdraw(double amount) throws BankException {
        if (amount > balance) {
            throw new BankException("Insufficient Balance!", 402); // 402 = Payment Required
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Balance: " + balance);
    }
}

