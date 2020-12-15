package staticmembers;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentArr[] = new Student[6]; 

		studentArr[0] = new Student("Hasitha","SE","0712074257");
		studentArr[1] = new Student("Ramindu","CSNE","0773156782");
		studentArr[2] = new Student("Tharindu","SE","0711156782");
		studentArr[3] = new Student("Lochana","SE","0711881521");
		studentArr[4] = new Student("Ushara","SE","0716543789");
		studentArr[5] = new Student("Dilan","ISE","0718907652");


		for(int i=0 ; i<6 ; i++) {
				
			studentArr[i].display();
		}

		System.out.println("next SID is "+Student.getNextStudentID());
	}
}
