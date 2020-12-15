package collectionsex2;

public class Student {
	
private int StudentID;
private String name;
private double GPA;


public Student(int studentID, String name, double gPA) {
	super();
	StudentID = studentID;
	this.name = name;
	GPA = gPA;
}


public int getStudentID() {
	return StudentID;
}


public String getName() {
	return name;
}


public double getGPA() {
	return GPA;
}


}


