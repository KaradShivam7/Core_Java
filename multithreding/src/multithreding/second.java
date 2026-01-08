package multithreding;

public class second {

	public static void main(String[] args) throws InterruptedException {
		Thread t=new Thread(new even());
		t.start();
		t.join();
		
		
		for(int i=2;i<=10;i++) {
			Thread.sleep(1000);
			boolean flag=false;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=true;
				}
			}
			if(flag==false) {
				System.out.println("prime number= "+i);
			}
		}
	
	}

}
class even implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i%2==0) {
				System.out.println("even number= "+i);
			}
		}
	}
	
}