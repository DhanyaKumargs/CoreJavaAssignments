package javaTraining;

import java.util.Scanner;

public class CountVowelsAndConstants {

	private static String input;
	private int vowelCount=0;
	private int constantCount=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter a string input");
		input = sc1.nextLine();
		CountVowelsAndConstants n = new CountVowelsAndConstants();
		n.countVowelsAndCons(input.toLowerCase());
	}
	public  void countVowelsAndCons(String s){
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u' ){
				vowelCount++;
			}
			else if(s.charAt(i)>'a' && s.charAt(i)<'z'){
				constantCount++;
			}
		}
		System.out.println("Vowels count in "+input+":"+vowelCount);
		System.out.println("constant count in "+input+":"+constantCount);

	}

}
