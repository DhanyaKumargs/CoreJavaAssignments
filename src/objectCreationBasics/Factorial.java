package objectCreationBasics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter a number to find factorial");
		int num = sc1.nextInt();
		System.out.println(factorial(num));
	}
	public static double factorial(int i){
		if(i==0){
			return 1;
		}
		else{
			return (i*(i-1));
		}
	}
}
