package collectionslab;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> array = new ArrayList();
		
		boolean empty = array.isEmpty();
		
		if(empty == false ) {
			System.out.println("Array is Empty");
		}
		else{
			
			for(int i = 0; i < 10 ;i++){
				
				System.out.println("Enter an Number");
				Scanner sc = new Scanner(System.in);
				array.add(sc.nextInt());
				
				
			}
			
			int sum = 0;
			for(int cal : array) {
				
				sum = sum + cal; 
			}
		System.out.println("Sum is "+ sum);
		
		}
	}

}
