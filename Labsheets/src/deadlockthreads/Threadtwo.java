package deadlockthreads;

public class Threadtwo extends Thread {

	Object lock1;
	Object lock2;
	
	public Threadtwo(Object lock1, Object lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	public void run() {
			
		System.out.println("Started executing thread 2");
		
		synchronized (lock1) {
			synchronized (lock2) {
			System.out.println("Thread 2 holding Lock 2");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("Thread 2 is waiting for Lock1");
			
				
				System.out.println("Thread 2 is holding lock1 and Lock 2");
			}
		}
		
	}
	
	
	
}

