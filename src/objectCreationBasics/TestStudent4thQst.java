package objectCreationBasics;

public class TestStudent4thQst {

	public static void main(String[] args) {
		Student4thQst s1 = new Student4thQst("S101","Ramu");
		Student4thQst s2 = new Student4thQst("S102","Bheemu");
		s1.display();
		s2.display();
		int[] a = {1,2,3,4,5};
		s1.calSum(a);
	}
}
