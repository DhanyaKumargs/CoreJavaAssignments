package collections3;
import java.util.*;
public class TestPlayers {

	public List<String> getPlayers(List<Player> football, List<Player> cricket){
			List<String> list = new ArrayList<String>();
			football.retainAll(cricket);
			for(Player p : football){
				list.add(p.name);
			}
			return list;
		}
	
	public static void main(String[] args) {
		Player p1 = new Player("Dhanya", "dhanya@gmail.com", "Shimogga", "Karnataka", 23);
		Player p2 = new Player("Mohan", "mohan@gmail.com", "Shimogga", "Karnataka", 26);
		Player p3 = new Player("Ramu", "ramu@gmail.com", "Bengaluru", "Karnataka", 24);
		Player p4 = new Player("Bheemu", "bheemu@gmail.com", "Mangaluru", "Karnataka", 21);
		Player p5 = new Player("Somu", "somu@gmail.com", "Karwar", "Karnataka", 27);
		List<Player> cricket = new ArrayList<Player>();
		cricket.add(p1);
		cricket.add(p2);
		cricket.add(p3);
		cricket.add(p4);
		List<Player> footbal = new ArrayList<Player>();
		footbal.add(p1);
		footbal.add(p2);
		footbal.add(p3);
		footbal.add(p5);
		TestPlayers tp = new TestPlayers();
		List<String> l = tp.getPlayers(footbal, cricket);
		System.out.println(l);
	}
}
