package objectCreationBasics;

public class Student4thQst {

	private String id;
	private String name;
	private String[] sub = new String[5];
	
	public Student4thQst(String id,String name){
		this.id=id;
		this.name = name;
	}
	public void calSum(int[] a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		System.out.println("Total : "+sum);
	}
	public void display(){
		System.out.println("Student :"+"id:"+this.id+" Name:"+this.name);
	}
}
