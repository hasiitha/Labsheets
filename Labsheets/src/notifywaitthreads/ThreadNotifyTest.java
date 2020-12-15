package notifywaitthreads;

public class ThreadNotifyTest  extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadNotifyTest threadnotify = new ThreadNotifyTest();
		Thread1 t1 = new Thread1(threadnotify,"New Thread 1");
		Thread2 t2 = new Thread2(threadnotify,"New Thread 2");
		
		t1.start();
		t2.start();
	}

}
