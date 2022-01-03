package javaTraining;

public class FindNumberOfLetterDigitsAndSpace {
	
	public static void main(String[] args) {
		String input = "I am in Bangalore my house number is 6 and my phone no. 9632133889";
		calcu(input);
	}
	public static void calcu(String s){
		int countletter=0;
		int countDigit=0;
		int whiteSpace=0;
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++){
			if(c[i]==' '){
				whiteSpace++;
			}
			else if(Character.isLetter(c[i])){
				countletter++;
			}
			else if(Character.isDigit(c[i])){
				countDigit++;
			}
		}
		System.out.println("Letters :"+countletter);
		System.out.println("Digits :"+countDigit);
		System.out.println("WhiteSpace :"+whiteSpace);
	}

}
