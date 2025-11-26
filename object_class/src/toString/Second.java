package toString;

public class Second {

	public static void main(String[] args) {
		BankAccount acc=new BankAccount("1234567890","shivam karad",234567890);
	    System.out.println(acc);
	}

}
class BankAccount extends Object {
    private String accountNumber;
    private String holderName;
    private double balance;

    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

   
   
    public String toString() {
        return "BankAccount [AccountNumber=" + accountNumber +
               ", HolderName=" + holderName +
               ", Balance=" + balance + "]";
    }
}
