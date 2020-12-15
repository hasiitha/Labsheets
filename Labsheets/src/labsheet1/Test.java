package labsheet1;

public class Test {

	public static void main(String[] args) {
		Student3 st1 = new Student3("Hasitha","IT19111520","Kundasale");
		Student3 st2 = new Student3("Pavithra","UOP","Peradeniya");
		
		System.out.println(st1.getDitno()+"   "+st1.getName()+"  "+st1.getAddress());
		System.out.println(st2.getDitno()+"   "+st2.getName()+"  "+st2.getAddress());		
		st1.getDetails();
		System.out.println(st1.getDetails());
			
	}

}
