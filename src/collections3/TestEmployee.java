package collections3;

import java.util.HashSet;
import java.util.Set;

public class TestEmployee {

	public static void main(String[] args) {
		Employee s1 = new Employee(1, "Ramu", "Developer");
		Employee s2 = new Employee(2, "Bheemu", "Developer");
		Employee s3 = new Employee(3, "Gomu", "Developer");
		Employee s4 = new Employee(1, "Somu", "Developer");
		EmployeeContainer e = new EmployeeContainer();
		e.addEmployee(s1);
		e.addEmployee(s2);
		e.addEmployee(s3);
		e.addEmployee(s4);
		e.viewEmployees();
		e.deleteEmployee(1);
		e.viewEmployees();
		e.viewEmployee(2);
		
	}
}
