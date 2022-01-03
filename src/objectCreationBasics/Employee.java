package objectCreationBasics;

public class Employee {
	private String id;
	private String name;
	private double salary;
	
	public Employee(){
		
	}
	public Employee(String id,String name,double sal){
		this.id=id;
		this.name=name;
		this.salary=sal;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
