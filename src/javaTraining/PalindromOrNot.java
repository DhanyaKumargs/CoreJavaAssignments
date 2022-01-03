package javaTraining;

import java.util.Scanner;

public class PalindromOrNot {

	private static String input;
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter a string input");
		input = sc1.next();
		System.out.println("String Length is : "+input.length());
		System.out.println("String in LowerCase :"+input.toLowerCase());
		System.out.println("String in UpperCase :"+input.toUpperCase());
		System.out.println("is pallindrom:"+isPalindrom(input));
	}
	public  static boolean isPalindrom(String s){
		StringBuffer s1 = new StringBuffer(s);
		if(s1==s1.reverse()){
			return true;
		}
		return false;
	}
	
}
