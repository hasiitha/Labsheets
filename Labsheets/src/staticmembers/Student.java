package staticmembers;

public class Student {

	/*Create a Student class with the properties studentID (int), name (string), degree
(string), mobile (string). */

	private int studentID = max;
	private String name;
	private String degree;
	private String mobile;
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(String name, String degree, String mobile) {
		super();
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
		this.studentID = max;
		max = max+1;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	private static int max;
	static {

		max = 100;
	}

	public void display() {
		
		System.out.println("my SID is "+this.studentID+"My name is "+this.name+"degree is"+this.degree+"Mobile no is "+this.mobile);
	}

	public static int getNextStudentID() {
		return max ;
	}
}
