package notifyallthreads;

public class NotifyWaitThread extends Thread{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("notify all");
		NotifyWaitThread notifythread = new NotifyWaitThread();
		
		Thread1 t1= new Thread1(notifythread,"New Thread 1 -");
		Thread2 t2 = new Thread2(notifythread,"New Thread 2 -");
		Thread3 t3 = new Thread3(notifythread,"New Thread 3 -");
		
		t2.start();
		t3.start();
		t1.start();
		
		
	}

}
