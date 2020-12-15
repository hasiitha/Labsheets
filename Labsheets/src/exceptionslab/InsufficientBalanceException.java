package exceptionslab;

public class InsufficientBalanceException extends Exception {

	private double amount ;

	public InsufficientBalanceException(double amount) {
		super();
		this.amount = amount;
		System.out.println("Sorry rs "+amount + "is less ");
	}
	
	
	
}
