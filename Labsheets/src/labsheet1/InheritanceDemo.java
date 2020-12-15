package labsheet1;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person("Ramindu","Gampaha");
		Person p1 = new Person("Tharindu","Gothatuwa");
		Student s = new Student("Ushara","Kegalle","It1911156");
		PartTimeStudent part = new PartTimeStudent("Hasitha","IT19111520","Kandy",23);
		
		p.showDetails();
		p1.showDetails();
		s.showDetails();
		part.showDetails();
	}

}
