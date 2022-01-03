package exceptions;

public class MyNumber {

	private int firstNumber;
	private int secondNumber;
	private double result;
	
	public MyNumber(int first,int secound){
		this.firstNumber=first;
		this.secondNumber=secound;
	}
	
	public double add(){
		result = (double)firstNumber+secondNumber;
		return result;
	}
	
	public double sub(){
		result = (double)firstNumber-secondNumber;
		return result;
	}
	
	public double mul(){
		result = (double)firstNumber*secondNumber;
		return result;
	}
	public double div(){
		if(secondNumber==0){
			throw new ArithmeticException("Division by zero is undefined. please give proper input.");
		}
		result = (double)firstNumber/secondNumber;
		return result;
	}
}
