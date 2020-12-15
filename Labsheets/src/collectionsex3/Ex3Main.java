package collectionsex3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Ex3Main {
	
	public static void main(String[] args) {
		
		TreeSet <Double> studentheights = new TreeSet<>();
		
		for(int i =0;i<10;i++) {
			System.out.println("Enter the heights of the Student");	
			Scanner myscan = new Scanner(System.in);
			studentheights.add(myscan.nextDouble());
					
		}
		for(double studentheight : studentheights) {
			
			System.out.println(studentheight);
		}
	
		System.out.println(studentheights);
	}

}
