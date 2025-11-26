package interface_examples;

public class Second {

	public static void main(String[] args) {
	     Account acc1 = new SavingsAccount();
	     acc1.deposit(1000);
	     acc1.withdraw(200);

	     System.out.println("************************************************");
	     
	     Account acc2 = new CurrentAccount();
	     acc2.deposit(5000);
	     acc2.withdraw(1000);
	}

}
//Interface
interface Account {
 void deposit(double amount);
 void withdraw(double amount);
}

//Savings Account
class SavingsAccount implements Account {
 private double balance = 0;

 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited " + amount + " in Savings. Balance: " + balance);
 }

 public void withdraw(double amount) {
     balance -= amount;
     System.out.println("Withdrew " + amount + " from Savings. Balance: " + balance);
 }
}

//Current Account
class CurrentAccount implements Account {
 private double balance = 0;

 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited " + amount + " in Current. Balance: " + balance);
 }

 public void withdraw(double amount) {
     balance -= amount;
     System.out.println("Withdrew " + amount + " from Current. Balance: " + balance);
 }
}
