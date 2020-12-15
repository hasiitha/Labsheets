package recursion_one;

public class TriangularNumber {
	
	public int SearchTerm(int n) {
		
		int total = 0;
		if(n == 0) {
			 total = 0;
		}
		
		while(n>0) {
			
			total = total +n ;
			n--;
		}
		
		return total;
	}

}
