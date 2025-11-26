package abstraction_program;

public class third {

	public static void main(String[] args) {
	     Account acc1 = new SavingsAccount();
	     Account acc2 = new CurrentAccount();

	     acc1.calculateInterest();
	     acc2.calculateInterest();
	}

}
//Abstract class
abstract class Account {
 abstract void calculateInterest();
}

//Savings Account
class SavingsAccount extends Account {
 @Override
 void calculateInterest() {
     System.out.println("Savings Account: Interest calculated at 4%");
 }
}

//Current Account
class CurrentAccount extends Account {
 @Override
 void calculateInterest() {
     System.out.println("Current Account: No interest");
 }
}
