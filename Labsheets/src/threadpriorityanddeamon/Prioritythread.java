package threadpriorityanddeamon;

public class Prioritythread extends Thread {

	public static void main(String[] args) {
	
		
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		
		System.out.println("Existing thread priority is "+Thread.currentThread().getPriority());

	}

}
