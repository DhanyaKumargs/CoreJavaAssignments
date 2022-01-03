package objectCreationBasics;

import java.util.Scanner;

public class SumOfNaturalNum {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter num from where you want to start sum");
		int num1 = sc1.nextInt();
		System.out.println("Enter num upto where you want to sum");
		int num2 = sc1.nextInt();
		int sum=0;
		for(int i=num1; i<=num2; i++){
			sum += i;
		}
		System.out.println(sum);
	}

}
