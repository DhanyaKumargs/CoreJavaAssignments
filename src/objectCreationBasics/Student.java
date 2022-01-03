package objectCreationBasics;

public class Student {
//	 Write a program to create class Student with id, name, address , display(),Student(id,name). Create
//	 several objects and initialize them. Display the details of each student and finally display the number of
//	 student objects that are created.
	String id;
	String name;
	String address;
	public Student(String id, String name,String address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public static void main(String[] args) {
		Student s1 = new Student("HZ101","Dhanya","BSNL quatress,Shimogga");
		Student s2 = new Student("HZ102","Mohan","near busStand,Ranebennur");
		Student s3 = new Student("HZ103","Ramu","kuvempu nagar,Shimogga");
		Student s4 = new Student("HZ104","Shamu","Rajaji nagar,Bengaluru");
		Student[] s = new Student[4];
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		s[3]=s4;
		for(int i=0; i<s.length;i++){
			System.out.println("Student "+(i+1));
			System.out.println(" Name: "+s[i].name+" Id:"+s[i].id+"  address: "+s[i].address);
		}
		
		
		
	}
}
