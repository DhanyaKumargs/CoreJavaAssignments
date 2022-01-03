package exceptions;

public class TestDbConnection {

	public static void main(String[] args) {
		DbConnection obj = DbConnection.getObject();
		DbConnection obj2 = DbConnection.getObject();
		System.out.println(obj);
		System.out.println(obj2);
	}
}
