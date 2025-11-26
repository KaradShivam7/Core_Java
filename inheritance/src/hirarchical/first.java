package hirarchical;

public class first {

	public static void main(String[] args) {
		manager m=new manager();
		m.print();
		
		customer c=new customer();
		c.display();
	}

}
class bank{
	String bank_name;
	int bank_id;
	
	public bank() {
		bank_name="sbi";
		bank_id=1234;
	}
	
	public void show() {
		System.out.println("bank_name = "+ bank_name);
		System.out.println("bank_id = "+bank_id);
	}
}

class manager extends bank{
	String manager_name;
	int manager_id;
	
	public manager() {
		manager_name="shiv";
		manager_id=1;
	}
	
	public void print() {
		super.show();
		System.out.println("manager_name = "+ manager_name);
		System.out.println("manager_id = "+manager_id);
	}
}

class customer extends bank{
	String customer_name;
	int Account_no;
	
	public customer() {
		customer_name="karad";
		Account_no=123456789;			
	}
	
	public void display() {
		super.show();
		System.out.println("customer_name = "+ customer_name);
		System.out.println("account_no = "+ Account_no);
				}
}