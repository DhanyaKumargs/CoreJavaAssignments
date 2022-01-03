package collections2;

import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class ShowStudent {

	Map<Integer,Student> students = new HashMap<Integer,Student>();
	public void addStudent(Student s){
		int num = Student.getId();
		students.put(num, s);
	}
	
	
	@Override
	public String toString() {
		return "ShowStudent [students=" + students + "]";
	}


	public void viewStudents(){
		System.out.println("Students List...");
		Set<Integer> key = students.keySet();
		for(Integer i : key){
			System.out.println(students.get(i));
		}
	}
	public void viewStudent(Integer id){
		System.out.println("Student id "+id+" Details");
		System.out.println(students.get(id));
	}
}
