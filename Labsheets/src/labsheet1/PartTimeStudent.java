package labsheet1;

public class PartTimeStudent extends Student{

	private int no_of_WorkingH;
	
	public PartTimeStudent() {
		// TODO Auto-generated constructor stub
	}

	public PartTimeStudent(String name, String address, String ditno, int no_of_WorkingH) {
		super(name, address, ditno);
		this.no_of_WorkingH = no_of_WorkingH;
	}

	public int getNo_of_WorkingH() {
		return no_of_WorkingH;
	}

	public void setNo_of_WorkingH(int no_of_WorkingH) {
		this.no_of_WorkingH = no_of_WorkingH;
	}
	
}
