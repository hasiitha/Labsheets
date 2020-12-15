package lab1b;

public class Dog extends Pet{

private int no_of_Masters;

public Dog(String n, String o, int a, int no_of_Masters) {
	super(n, o, a);
	this.no_of_Masters = no_of_Masters;
}

public void showDetails() {
	
	super.showDetails();
	System.out.println("I am a Dog. " +
	this.no_of_Masters + "masters I have");
	
	
}

}
