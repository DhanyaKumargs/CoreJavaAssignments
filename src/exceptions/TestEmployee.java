package exceptions;

public class TestEmployee {

	public static void main(String[] args) {
		try{
		Employee e1 = new Employee(101,"Ramu",(float) 2.7);
		Employee e2 = new Employee(101,"Ramu",(float) 2.3);
		}
		catch(IllegalArgumentException ex){
			System.out.println(ex.getMessage());
		}
	}
}
