package objectCreationBasics;

public class TestEmployee2 {
	public static void main(String[] args) {
		Employee2 e1 = new Employee2("E101","Ramu");
		Employee2 e2 = new Employee2("E102","Bheemu",25000);
		Employee2 e3 = new Employee2("E103","Shamu");
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
	}
}
