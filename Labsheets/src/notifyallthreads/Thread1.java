package notifyallthreads;

public class Thread1 extends Thread{
	
	NotifyWaitThread object;

	public Thread1(NotifyWaitThread object,String name) {
		super(name);
		this.object = object;
	}
	
	public void run() {
		synchronized(object) {
			
			
			try {
				System.out.println("Started "+Thread.currentThread().getName()+ "Wait");
				object.wait();
				System.out.println(" Started "+Thread.currentThread().getName()+ " notified");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(int i=0;i<10;i++) {
				
				System.out.println(Thread.currentThread().getName() + i);
			}
		}
		
	}
	
	

}
