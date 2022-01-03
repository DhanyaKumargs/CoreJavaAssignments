package collections3;

public class Member implements Comparable<Member> {
	String mid, name, city, country;

	public Member(String mid, String name, String city, String country) {
		super();
		this.mid = mid;
		this.name = name;
		this.city = city;
		this.country = country;
	}

	public void display(){
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Member [mid=" + mid + ", name=" + name + ", city=" + city + ", country=" + country + "]";
	}

	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		//return this.name.compareTo(o.name);
		return this.name.compareTo(o.name);
	}

}
