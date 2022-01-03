package exceptions;

public class Employee {
	int empNumber;
	String name;
	float exp;
	
	public Employee(int num,String name,float exp){
		this.empNumber=num;
		this.name=name;
		if(exp>2.5 && exp<3.6){
			this.exp=exp;
		}else{
			throw new IllegalArgumentException("exp must be B/W 2.5 to 3.6");
		}
	}
}
