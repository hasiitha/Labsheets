package deadlockthreads;

public class Deadlock {

	
	
	public static void main(String[] args) {
		
		System.out.println("Locked");
		 Object lock1 = new Object();
		 Object lock2 = new Object();
		Threadone threadone = new Threadone(lock1,lock2);
		Threadtwo threadtwo = new Threadtwo(lock1,lock2);
		threadone.start();
		threadtwo.start();		
	}




	


}