package alsothon1;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Factorial(4));
		
	}
	
	 static int Factorial(int n){
		
		if(n == 0) {
			return 1;
		}
		return n* Factorial(n-1);
		
		
	}

}
