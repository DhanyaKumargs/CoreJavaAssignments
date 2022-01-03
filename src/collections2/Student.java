package collections2;

public class Student {

	public static int id=10000;
	 private String name ,email, course;
	 public Student(String name,String email,String course){
	this.name=name;
	this.email=email;
	this.course=course;
	 }
	 public static int getId( ){
		 id++;
		 return id;
	 }
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", course=" + course + "]";
	}
}
