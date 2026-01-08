package multithreding;

public class syncro {

	public static void main(String[] args) throws InterruptedException {
		res res =new res();
		 Thread t1 = new Thread(() -> {
	            for(int i = 0; i < 100000; i++) {res.increment();}
	        });

	        Thread t2 = new Thread(() -> {
	            for(int i = 0; i < 100000; i++) {res.increment();}
	        }); 
	        
	        t1.start();
	        t2.start();
	        
	        t1.join();
	        t2.join();
	        
	        System.out.println(res.counter);
	}

}
class res{
	int counter=0;
	
	public synchronized void increment(){
		counter++;
	}
}