package abstractclassAndInterface;

public class CurrencyContainer {

	public  static Currency getCurrency(String country){
		switch(country){
		case "India":{
			return new India();
		}
		case "USA":{
			return new USA();
		}
		case "UK":{
			return new UK();
		}
		default:{
			throw new IllegalArgumentException("Country Not found");
		}
		}
	}
}
