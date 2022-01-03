package objectCreationBasics;

public class TestProduct {
	public static void main(String[] args) {
		Product p1= new Product("p101","Moto fusion 1 plus",17000);
		Product p2= new Product("p102","Redmi 8",13000);
		Product p3= new Product("p103","Rice",45);
		Product p4= new Product("p104","Wall Clock",400);
		Product p5= new Product("p105","Fastrack mens Watch",4500);
		Product p6= new Product("p106","Warrior Book",300);
		Product p7= new Product("p107","T-Shirt",600);
		Product p8= new Product("p108","Dell Laptop",35000);
		Product p9= new Product("p109","Sd card",750);
		Product p10= new Product("p110","photo frame",450);
		
		Product [] arr = new Product[10];
		arr[0]=p1;
		arr[1]=p2;
		arr[2]=p3;
		arr[3]=p4;
		arr[4]=p5;
		arr[5]=p6;
		arr[6]=p7;
		arr[7]=p8;
		arr[8]=p9;
		arr[9]=p10;
		for(int i=0;i<10;i++){
			arr[i].display();
		}
	}

}
