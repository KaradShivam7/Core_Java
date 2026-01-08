package multithreding;

public class race {

	public static void main(String[] args) throws InterruptedException {
		resourse res =new resourse();
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
class resourse{
	int counter=0;
	
	public void increment(){
		counter++;
	}
}