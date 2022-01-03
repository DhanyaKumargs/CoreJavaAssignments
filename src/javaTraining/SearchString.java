package javaTraining;

import java.util.Scanner;

public class SearchString {
	
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter names with coma separated ");
		String first = sc1.nextLine();
		System.out.println("Enter name to search its position");
		String last  =sc1.next();
		SearchString s = new SearchString();
		s.giveIndex(first,last);
		
	}
	
	public void giveIndex(String first,String last){
		String[] s1 = first.split(",");
		for(int i=0;i<s1.length;i++){
			//System.out.println(last+" "+s1[i]);
			if(last.equals(s1[i])){
				
				System.out.println(last+" found at position "+(i+1));
			}
		}
	}

}
