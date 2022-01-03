package objectCreationBasics;


public class Employee2 {
	private String id;
	private String name;
	private float sal=20000;
	
	public Employee2(String id,String name){
		this.id=id;
		this.name=name;
	}
	
	public Employee2(String id,String name,float sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
}
