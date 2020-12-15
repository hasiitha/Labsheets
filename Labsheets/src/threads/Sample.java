package threads;

public class Sample {

	public   void displayOutput(Sample sample) {
		synchronized (new Sample()) {
		try {
			for(int i =0;i<10;i++) {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
			}	
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	}

}
