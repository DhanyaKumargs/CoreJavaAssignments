package collections2;

public class TestStudent {

	public static void main(String[] args) {
		ShowStudent obj = new ShowStudent();
		Student s1 = new Student("Ramu", "ramu@gmail.com", "Mathematics");
		Student s2 = new Student("Bheemu", "bheemu@gmail.com", "Mathematics");
		Student s3 = new Student("Somu", "somu@gmail.com", "Mathematics");
		Student s4 = new Student("Lakshman", "lakshman@gmail.com", "Mathematics");
		Student s5 = new Student("Dhanya", "dhanya@gmail.com", "Mathematics");
		obj.addStudent(s1);
		obj.addStudent(s2);
		obj.addStudent(s3);
		obj.addStudent(s4);
		obj.addStudent(s5);
		obj.viewStudents();
		obj.viewStudent(10001);
		
	}
}
