package collections3;
import java.util.*;
public class MemeberContainer {

	  List<Member> member = new ArrayList<Member>();
	  
	  public void addMemeber (String name,String city,String country){
		  String id = MemberIdGenerator.getMemeberId();
		  Member m = new Member(id, name, city, country);
		  member.add(m);
	  }
	  
	  public void deleteMember(String id){
		  boolean flag=false;
		  for(Member m : member){
			  if(m.mid.equals(id)){
				  flag=true;
				  member.remove(m);
			  }
		  }
		  if(!flag){
			  System.out.println("Member not found with Id "+id);
		  }
	  }
	  
	  public void searchById(String id){
		  if(member.size()==0){
			  System.out.println("List is Empty");
			  return;
		  }
		  boolean flag=false;
		  for(Member m : member){
			  if(m.mid.equals(id)){
				  flag=true;
				  System.out.println(m.toString());
			  }
		  }
		  if(!flag){
			  System.out.println("Sorry! no member found");
		  }
	  }
	  public void searchMember(String id,String name){
		  if(member.size()==0){
			  System.out.println("List is Empty");
			  return;
		  }
		  boolean flag=false;
		  for(Member m : member){
			  if(m.mid.equals(id) || m.name.equals(name)){
				  flag=true;
				  System.out.println(m.toString());
			  }
		  }
		  if(!flag){
			  System.out.println("Sorry! no member found");
		  }
	  }
	  
	  public void displaySortingOrder(String s) {
		  Collections.sort(member);
		  if(s.equals("Desc")){
			  Collections.reverse(member);
		  }
		  
		  System.out.println(member);
	  }
	  
}
