package collections1;
import java.util.*;
public class ConvertIntegerArrayToMap {
	
	public Map<Integer,Integer> getMap(Integer numbers[]){
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(Integer i :numbers){
			Integer num = (int) Math.pow(i, 3);
			m.put(i, num);
		}
		return m;
		}
	
	public static void main(String[] args) {
		
		ConvertIntegerArrayToMap obj = new ConvertIntegerArrayToMap();
		Integer[] i = {1,2,3,4,5,6,7,8,9};
		Map<Integer,Integer> m = obj.getMap(i);
		System.out.println(m);
	}

}
