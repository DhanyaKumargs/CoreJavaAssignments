package objectCreationBasics;

public class Sum {
	public static void main(String[] args) {
		Sum s = new Sum();
		s.sum(1,2,3,4,5,6,7,8,9);
		
	}
	public void sum(int... a){
		int sum=0;
		for(int i:a){
			sum+=i;
		}
		System.out.println(sum);
	}
}
