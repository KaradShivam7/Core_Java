package multithreding;

public class first {

	public static void main(String[] args) throws InterruptedException {
		mythread thread =new mythread();
		thread.start();
		
		thread.sleep(2000);
		System.out.println("main thread");
	}

}
class mythread extends Thread{
	public void run() {
		System.out.println("hii from thread");
	}
}