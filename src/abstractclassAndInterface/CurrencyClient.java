package abstractclassAndInterface;

public class CurrencyClient {

	public static void main(String[] args) {
		try{
		Currency country  = CurrencyContainer.getCurrency("India");
		System.out.println(country.getCurrency());
		Currency country2  = CurrencyContainer.getCurrency("USA");
		System.out.println(country2.getCurrency());
		Currency country3  = CurrencyContainer.getCurrency("SriLanka");
		System.out.println(country3.getCurrency());
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
}
