package multithreding;

public class deamon {

	public static void main(String[] args) {
		Thread t1=new Thread(()->{for(int i=0;i<20;i++) {
			System.out.println("first thread "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}});
		
		Thread t2=new Thread(()->{for(int i=0;i<=10;i++) {
			System.out.println("second thread "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}});
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
	}

}
