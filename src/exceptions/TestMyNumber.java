package exceptions;

public class TestMyNumber {
	public static void main(String[] args) {
		try{
		MyNumber num1 = new MyNumber(55,5);
		System.out.println(num1.add());
		System.out.println(num1.sub());
		System.out.println(num1.mul());
		System.out.println(num1.div());
		
		MyNumber num2 = new MyNumber(55,0);
		System.out.println(num2.add());
		System.out.println(num2.sub());
		System.out.println(num2.mul());
		System.out.println(num2.div());
		}catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
		}
	}
}
