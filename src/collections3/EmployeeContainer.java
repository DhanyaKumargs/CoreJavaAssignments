package collections3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeContainer {

	Set<Employee> set = new HashSet<Employee>();
	public void addEmployee(Employee emp)
	{
		boolean flag=false;
		flag = set.add(emp);
		if(flag){
			
		}else{
			System.out.println("Employee no "+emp.empno+" already exist");
		}
		
	}
	public void deleteEmployee(int empno){
		boolean flag=false;
		for(Employee e : set){
			if(e.empno==empno){
				flag = set.remove(e);
				break;
			}
		}
		if(!flag){
			System.out.println("employee id:"+empno+" not found in list");
		}
	}
	public void viewEmployee(int empno){
		boolean flag=false;
		for(Employee e : set){
			if(e.empno==empno){
				System.out.println(e);
				flag=true;
			}
		}
		if(!flag){
			System.out.println("employee id:"+empno+" not found in list");
		}
	}
	public void viewEmployees(){
		System.out.println(set);
	}
}
