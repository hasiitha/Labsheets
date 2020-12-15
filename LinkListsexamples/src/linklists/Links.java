package linklists;

public class Links {

	public int iDAta;
	public Links next;
	
	public Links(int iDAta) {
		super();
		this.iDAta = iDAta;
		next =null;
	}	

	public void displayLink() {
		
		System.out.println(iDAta);
	}

}
