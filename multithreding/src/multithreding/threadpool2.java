package multithreding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadpool2 {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService ex = Executors.newCachedThreadPool();
		
		for(int i=0; i<=100;i++) {
			pooll p=new pooll(i);
			
			ex.execute(p);
		}
		
	}

}
class pooll extends Thread {
	
	public int id;
	
	public pooll(int id) {
		this.id=id;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" executing thread "+id);
		for(int i=0;i<=10;i++) {

			System.out.println(i);
		}
	}
	
}