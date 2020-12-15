package labsheet1;

public class Student3{

	private String name;
	private String ditno;
	private String address;
	public Student3() {
		// TODO Auto-generated constructor stub
	}
	public Student3(String name, String ditno,String address) {
		super();
		this.name = name;
		this.ditno = ditno;
		this.address =address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDitno() {
		return ditno;
	}
	public void setDitno(String ditno) {
		this.ditno = ditno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDetails(){
		String details = "I am a Student"+"\n"+
				"My name is " +getName()+ "\n"+
				"I am from "+ getAddress()+"\n"+
				"My dit no is "+getDitno();
		
		
		return details;
		
	}
	
	
}
