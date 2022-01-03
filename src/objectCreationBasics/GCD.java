package objectCreationBasics;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter first number");
	      int num1 = sc.nextInt();
	      System.out.println("Enter second number");
	      int num2 = sc.nextInt();
	      System.out.println("GCD of given two numbers is :"+gcd(num1, num2));
	   }

	   public static int gcd(int num1, int num2) {
	      if (num2 != 0){
	         return gcd(num2, num1 % num2);
	      } else{
	         return num1;
	      }
	   }
}
