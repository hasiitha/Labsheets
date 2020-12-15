package labsheet1;

public class Student extends Person {
	
	private String ditno;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String address, String ditno) {
		super(name, address);
		this.ditno = ditno;
	}

	public String getDitno() {
		return ditno;
	}

	public void setDitno(String ditno) {
		this.ditno = ditno;
	}

	
	
	

}
