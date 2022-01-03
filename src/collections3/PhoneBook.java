package collections3;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
	public static Map<String,String> map=new HashMap<>();
	public static void addDetails(String phno,String name){
		map.put(phno, name);
		}
	public static String getName(String phno){
		boolean flag =true;
		String s = map.get(phno);
		if(s==null){
			return phno+" doesn't exist";
		}else{
			return s;
		}
		
		}
		

}
