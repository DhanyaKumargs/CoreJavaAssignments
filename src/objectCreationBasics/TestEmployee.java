package objectCreationBasics;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId("E101");
		e1.setName("Ramu");
		e1.setSalary(25000.00);
		Employee e2 = new Employee();
		e2.setId("E102");
		e2.setName("Bheemu");
		e2.setSalary(23000);
		System.out.println(e1.toString());
		System.out.println(e2.toString());
	}
}
