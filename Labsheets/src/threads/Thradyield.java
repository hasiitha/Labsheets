package threads;

public class Thradyield extends Thread{
	
	public void run() {
	Thread t = Thread.currentThread();
	System.out.println("Started executing the "+ t.getName());
	
	for(int i = 0; i<10; i++){
		
	System.out.println(t.getName()+i);
	
	}
	System.out.println("Finished executing "+t.getName());
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.println("Thread yield");
		Thread t = new Thread(new Thradyield(),"New Thread");
		t.start();
		System.out.println("Started Executing the main thread");
		
		t.yield();
		
		for(int i = 0;i<10;i++) {
			
			System.out.println(Thread.currentThread().getName()+i);
			
		}
		System.out.println("Finished executing "+Thread.currentThread().getName());
	}

}
