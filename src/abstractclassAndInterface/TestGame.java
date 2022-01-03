package abstractclassAndInterface;

public class TestGame {

	public static void main(String[] args) {
		Game[] game = new Game[10];
		for(int i=0;i<10;i++){
			int random = (int)(Math.random()*3)+1;
			switch(random){
			case 1 :{
						game[i]=new Car();
					}
					break;
			case 2:{
						game[i]=new Bike();
					}
					break;
			case 3:{
						game[i]=new Bicycle();
					}
					break;
			default:{
						
					}
			}
		}
		game[4].play();
	}
}
