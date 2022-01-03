package objectCreationBasics;

import java.util.Scanner;

public class BasedOnUserChoice {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1 for find factorial");
		System.out.println("Enter 2 for find Table");
		System.out.println("Enter 3 for find Prime or not");
		int i = sc1.nextInt();
		System.out.println("Enter number to find");
		int j= sc1.nextInt();
		switch(i){
		case 1: System.out.println(factorial(j));
				break;
		case 2:table(j);
				break;
		case 3: isPrime(j);
				break;
		default:System.out.println("invalid input");
		}
	}
	public static int factorial(int i){
		if(i==0){
			return 1;
		}
		else{
			return (i*factorial(i-1));
		}
		
	}
	
	public static void table(int i){
		for(int j=1;j<11;j++){
			System.out.println(i+" * "+j+" = "+i*j);
		}
	}
	public static void isPrime(int i){
		boolean flag=true;
		if(i==0 || i==1 || i==4){
			flag=true;
		}
		if(i%2==0){
			flag=false;
		}
		for(int j=3;j<i/2;j++){
			if(i%j==0){
				flag=false;
			}
		}
		if(flag){
			System.out.println(i+" is a prime number");
		}
		else{
			System.out.println(i+" is not a prime number");
		}
		
	}
}
