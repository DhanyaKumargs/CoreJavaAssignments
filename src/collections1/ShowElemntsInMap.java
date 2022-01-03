package collections1;
import java.util.*;
public class ShowElemntsInMap {
	
	public void viewElements(Map<Integer, String> map){
		
		System.out.println(map.entrySet());
		}
	
	public static void main(String[] args) {
		ShowElemntsInMap s = new ShowElemntsInMap();
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(10001, "Manoj");
		m.put(1002, "Krish");
		s.viewElements(m);
	}

}
