package collections1;
import java.util.*;
public class RemoveName {
	public Set<String> checkName(Set<String> set, String name){
		boolean flag=false;
		for(String s :set){
			if(s.equals(name)){
				flag=true;
				
			}
		}
		if(!flag){
			System.out.println(name+" not found i set");
		}else{
			set.remove(name);
		}
		return set;
		}
	
	public static void main(String[] args) {
		RemoveName r = new RemoveName();
		Set<String> s = new HashSet<String>();
		s.add("Ram");
		s.add("Bheem");
		s.add("Som");
		s.add("Ram");
		s.add("Bheem");
		s.add("Gav");
		System.out.println(s);
		
		System.out.println(r.checkName(s, "Bheem"));
		
	}
}
