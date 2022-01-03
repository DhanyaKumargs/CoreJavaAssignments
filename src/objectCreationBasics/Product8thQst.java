package objectCreationBasics;

public class Product8thQst {

	private String id;
	private String name;
	private float price;
	
	public Product8thQst(String id,String name,float price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public void display(Product8thQst obj1){
		System.out.println(obj1.name+" price :"+this.price);
		System.out.println(this.name+" price :"+obj1.price);
	}
}
