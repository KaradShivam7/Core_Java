package multithreding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadpool {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService ex = Executors.newSingleThreadExecutor();
		
		for(int i=0; i<=100;i++) {
			pool p=new pool(i);
			Thread.sleep(1000);
			ex.execute(p);
		}
		
	}

}
class pool extends Thread {
	
	public int id;
	
	public pool(int id) {
		this.id=id;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" executing thread "+id);
		for(int i=0;i<=10;i++) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println(i);
		}
	}
	
}