package threadpriorityanddeamon;

public class Daemen extends Thread{

	public static void main(String[] args) {
		System.out.println("Entering the main method");
		Daemen d = new Daemen(); 
		d.setDaemon(true);
		d.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Leaving the main method");
	}



	public void run() {
		System.out.println("Entering the Run Method");
		System.out.println("In run method Current Thread is "+Thread.currentThread().getName());
		
		
		try {
		while(true) {
			
			
				Thread.sleep(500);
				System.out.println("In run method woke up again"+Thread.currentThread().getName());}
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				System.out.println("Leaving Run method");
			}
			
		
	}
	
}