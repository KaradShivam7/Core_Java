package multithreding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadpool1 {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService ex = Executors.newFixedThreadPool(5);
		
		for(int i=0; i<=100;i++) {
			poolll p=new poolll(i);
			Thread.sleep(1000);
			ex.execute(p);
		}
		
	}

}
class poolll extends Thread {
	
	public int id;
	
	public poolll(int id) {
		this.id=id;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" executing thread "+id);
		for(int i=0;i<=10;i++) {

			System.out.println(i);
		}
	}
	
}