package recursion_one;

public class Recursionopening {

	public int triangle (int n) {
		
		System.out.println("Entering : n="+n);
		
		if(n==1) {
			
			System.out.println("Returning 1");
			return 1;
		}
		else {
			
			int temp = n + triangle(n-1);
			System.out.println("Reurning"  + temp);
			return temp;
			
		}
		
	}
}
