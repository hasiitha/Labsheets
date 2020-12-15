package threads;

public class ThreadJoin extends Thread{
	
	public void run(){
		
		Thread t = Thread.currentThread();
		System.out.println("Started executing"+t.getName());
		
		for(int i = 0;i<10;i++) {
			
			System.out.println(t.getName()+i);
			
		}
		System.out.println("Finished executing"+t.getName());
	
	}

	public static void main(String[] args) throws InterruptedException  {
		Thread t = new Thread(new ThreadJoin(),"New Thread");
		t.start();
		System.out.println("Strated executing the main thread");
		t.join();
		
		
			
			
			
			for(int i =0;i<10;i++) 
			{System.out.println(Thread.currentThread().getName()+i);}
			
			System.out.println("finished executing "+Thread.currentThread().getName());
		
		

	}

}
