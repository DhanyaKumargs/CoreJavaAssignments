package collections1;

import java.util.*;
import java.util.List;

public class ShowList {

	public void showElements(List<String> list){
		if(list.isEmpty()){
			System.out.println("List is Empty");
		}else{
			for(String s : list){
				System.out.println(s);
			}
			//System.out.println(list);
		}
		 }
	
	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("ABC");
		list.add("BCD");
		list.add("CDE");
		list.add("DEF");
	ShowList s = new ShowList();
	s.showElements(list);
	}

}
