package collectionsex2;

import java.util.ArrayList;
import java.util.HashMap;

public class Mainclassex2 {

	
	public static void main(String[] args) {
		Student st1 = new Student(1,"Hasitha",3.9);
		Student st2 =  new Student(2,"Ramindu",3.8);
		Student st3 = new Student(3,"Pavithra",3.7);
		
		
		HashMap <Integer,Student> studentdet = new HashMap<>();
		
		studentdet.put(st1.getStudentID(), st1);
		studentdet.put(st2.getStudentID(),st2);
		studentdet.put(st3.getStudentID(),st3);
		
		Student st = studentdet.get(2);
		
		System.out.println(st.getName());
		
	}
}
