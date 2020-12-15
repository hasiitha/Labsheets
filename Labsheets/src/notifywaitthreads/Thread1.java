package notifywaitthreads;

public class Thread1 extends Thread {
	
	ThreadNotifyTest object;

	public Thread1(ThreadNotifyTest object,String name) {
		super(name);
		this.object = object;
	}
	
	public void run() {
		synchronized(object) {
		
		try {
			System.out.println("Started "+Thread.currentThread().getName() +" waited"); 
			object.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = 0;i<10;i++) {
			
			System.out.println(Thread.currentThread().getName() + " " +i);
		}
	}

	}
}
