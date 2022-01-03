package exceptions;

public class DbConnection {
private static DbConnection obj;
	private DbConnection(){
		
	}
	
	public static DbConnection getObject()
	{
		if(obj==null){
			obj = new DbConnection();
			return obj;
		}
		else{
			return obj;
		}
		
	}
}
