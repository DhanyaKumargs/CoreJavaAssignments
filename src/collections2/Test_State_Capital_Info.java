package collections2;

public class Test_State_Capital_Info {

	public static void main(String[] args) {
		State_Capital_Info obj = new State_Capital_Info();
		obj.add_state_capital("Karnataka", "Bengaluru");
		obj.add_state_capital("	Andhra Pradesh", "Amaravati");
		obj.add_state_capital("Goa", "Panaji");
		obj.add_state_capital("Maharashtra", "Mumbai");
		obj.viewCapital("Goa");
		obj.viewCapital("Karnataka");
		obj.viewCapital("Kerala");
	}
}
