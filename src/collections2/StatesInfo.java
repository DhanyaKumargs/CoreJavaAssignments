package collections2;
import java.util.*;
public class StatesInfo {
	
	private Set<String> states= new TreeSet<String>();
			public void addState(String name){
				states.add(name);
			}
			public void viewStates(){
			System.out.println(states);
			}

			

}
