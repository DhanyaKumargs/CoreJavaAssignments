package exceptions;

public class Emp {
	
	int empId;
	String empName;
	String designation;
	double basic;
	double hra;
	
	public Emp(int id,String empname,String desg,double basic) throws LowSalException{
		this.empId=id;
		this.empName=empname;
		this.designation=desg;
		if(basic<500){
			throw new LowSalException();
		}
		this.basic=basic;
		if(desg.toLowerCase()=="manager"){
			hra=(10/100)*basic;
		}
		else if(desg.toLowerCase()=="officer"){
			hra=(12/100)*basic;
		}
		else if(desg.toLowerCase()=="clerk"){
			hra=(5/100)*basic;
		}
		else{
			throw new IllegalArgumentException("Designation not found");
		}
	}
	public void printDET(){
		System.out.println("Employee "+"Id :"+this.empId+" Name :"+this.empName+" Designation :"+this.designation);
	}
	public void calculateHRA(){
		System.out.println(this.hra);
	}
}
