package collections3;
import java.util.*;
public class QuestionContainer {

	List<Question> list = new ArrayList<Question>();
	int correct=0;
	int wrong = 0;
	String result;
	public QuestionContainer() {
		// TODO Auto-generated constructor stub
		Question q1 = new Question("java is programming or platform", "A. Programming", "B. Platform", "C.Both", "D.None of the above", "C");
		Question q2 = new Question("What does the expression float a = 35 / 0 return?", "A. 0", "B. Not a Number", "C.Infinity", "D.Run time exception", "D");
		Question q3 = new Question(" Which of the following is not a Java features?", "A. Dynamic", "B. Architecture Neutral", "C.Use of pointers", "D.Object-oriented", "C");
		Question q4 = new Question("Which of the following option leads to the portability and security of Java?", "A. Bytecode is executed by JVM", "B. The applet makes the Java code secure and portable", "C.Use of exception handling", "D.Dynamic binding between objects", "A");
		Question q5 = new Question("How many threads can be executed at a time?", "A. Only one thread", "B. Multiple threads", "C.Only main (main() method) thread", "D.Two threads", "B");
		list.add(q1);
		list.add(q2);
		list.add(q3);
		list.add(q4);
		list.add(q5);
	}
	public void beginTest( ){
		Scanner sc = new Scanner(System.in);
		int i=1;
		for(Question q : list){
			System.out.println(i+++"."+q.question);
			System.out.println(q.option1);
			System.out.println(q.option2);
			System.out.println(q.option3);
			System.out.println(q.option4);
			String ans = sc.next();
			if(ans.length()>1){
				System.out.println("Invalid input");
				this.wrong++;
				continue;
				
			}
			checkAnswer(ans,q);
		}
		checkResult();
	
	}
	
	private void checkResult() {
		// TODO Auto-generated method stub
		int d = (this.correct*100/list.size());
		
		if(d>40){
			this.result="Pass";
		}
		else{
			this.result="Fail";
			
		}
	}
	private void checkAnswer(String ans,Question q) {
		// TODO Auto-generated method stub
		if(ans.toLowerCase().equals(q.answer.toLowerCase())){
			System.out.println("True");
			this.correct++;
		}
		else{
			System.out.println("False");
			this.wrong++;
		}
	}
	public static void main(String[] args) {
		QuestionContainer q = new QuestionContainer();
		q.beginTest();
		System.out.println("Total Question : "+q.list.size());
		System.out.println("Correct Answered : "+q.correct);
		System.out.println("Wrong Answered : "+q.wrong);
		System.out.println("Result : "+q.result);
	}
	
	
}
