package recursion_one;

public class Recursiotriangular {

	public int recursiontraingle(int n) {
		if(n ==1) {
			
			return 1 ;
		}else
		{
			return n + recursiontraingle(n-1);
		}
		
	}
	
	
}
