package notifyallthreads;

public class Thread3 extends Thread {
	NotifyWaitThread object;

	public Thread3(NotifyWaitThread object,String name) {
		super(name);
		this.object = object;
	}
	
	public void run() {
		synchronized (object) {
			
			System.out.println("notify all threads executed ");
			object.notifyAll();
			
			
		}
		
	}
	

}
