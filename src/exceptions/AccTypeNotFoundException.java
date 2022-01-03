package exceptions;

public class AccTypeNotFoundException extends Exception {
	String msg;
	public AccTypeNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	public AccTypeNotFoundException(String msg) {
		// TODO Auto-generated constructor stub
		this.msg=msg;
	}
	public String getMessage(){
		return msg;
	}
}
