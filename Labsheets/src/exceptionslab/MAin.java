package exceptionslab;

import java.util.Scanner;

public class MAin {
	
	public static void main(String[] args){
		Account acc = new Account(123);
		acc.deposite(1000);
		
		acc.displayaccdetails();
		
		
		
		String request;
		do {
			System.out.println("Enter the Withdrawing amount");
			Scanner sc = new Scanner(System.in);
			double amount = sc.nextDouble();
			acc.withdraw(amount);
			System.out.println("Do you want to withdraw again(yes/no)");
			request =sc.next();
		}while(request.equals("yes"));
		
		
		
			
	}

}
