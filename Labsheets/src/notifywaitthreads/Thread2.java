package notifywaitthreads;

public class Thread2 extends Thread{

	ThreadNotifyTest object;
	
	
	
	public Thread2(ThreadNotifyTest object,String name) {
		super(name);
		this.object = object;
	}



	public void run(){
		synchronized(object){
		System.out.println(Thread.currentThread().getName()+"notify Thread");
		object.notify();
	}
}
	}
