package exceptionslab;

import java.util.Scanner;

public class Account {
private int accNo;
private double balance ;
public Account(int accNo) {
	super();
	this.accNo = accNo;
}

public void displayaccdetails(){
	
	System.out.println(this.balance);
	System.out.println(this.accNo);
}

public void deposite(double deposite) {
	
	
	balance = balance + deposite;
	
	System.out.println("Depositing rs "+deposite);
}
public void withdraw(double withdraw) {
	boolean excep = false;
	try {
	
		if(balance < withdraw) {
		System.out.println("Withdrawing rs "+withdraw);
		double amount = withdraw - balance; 
		
		throw new InsufficientBalanceException(amount);
	}else {
	balance = balance - withdraw;
	System.out.println("Withdraw Rs"+withdraw);
	}
	}catch(InsufficientBalanceException e) {
		excep = true;
	}finally{
		if(excep == true) {
			
		
		Scanner s = new Scanner(System.in);
		System.out.println("Do you whish to continue ?");
		String ans = s.nextLine();
		
		if(ans.equals("no")) {
			
		System.exit(1);
			
		}
		}
	}
	
	
}

}
