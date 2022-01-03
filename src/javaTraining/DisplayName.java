package javaTraining;

import java.util.Scanner;

public class DisplayName {
	private String firstName;
	private String middleName;
	private String lastName;
	
	DisplayName(String s1,String s2,String s3){
		firstName=s1;
		middleName=s2;
		lastName=s3;
		
	}
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter a first Name");
		String first = sc1.nextLine();
		System.out.println("Enter a middle Name");
		String middle =sc1.nextLine();
		System.out.println("Enter a last Name");
		String last = sc1.nextLine();
		DisplayName student = new DisplayName(first,middle,last);
		student.display();
		
	}
	
	public void display(){
		System.out.println(this.firstName+"-"+this.middleName+"-"+this.lastName);
	}
	

}
