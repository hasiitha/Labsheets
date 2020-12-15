package deadlockthreads;

public class Threadone extends Thread{
	Object lock1;
	Object lock2;
	
	
public Threadone(Object lock1, Object lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
	}



@SuppressWarnings("static-access")
public void run() {
		
		System.out.println("Started executing the Thread one");
		synchronized(lock1) {
			
			
			System.out.println("Thread one holding lock 1");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Threadone is waiting for the lock2");
			
			
			lock1.notify();
			synchronized(lock2) {
				
				
				System.out.println("Thread one is holding lock1 and lock2");
			}
			
			
		}
		
	}
	
}
