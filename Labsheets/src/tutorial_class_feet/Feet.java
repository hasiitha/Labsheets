package tutorial_class_feet;

public class Feet {
	 private int feet;
	 private int inches;
	 public Feet(int feet, int inches){
		 this.feet = feet;
		 this.inches =inches;		 
	 }
	// Add f1+f2 feet and store in current feet
	 public void add(Feet f1, Feet f2){
		 
		 this.feet = f1.feet+f2.feet;
		 this.inches =f1.inches+f2.inches;
		 
	 }
	
	public void print() {
	} 
}
