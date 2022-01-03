package exceptions;

public class LowBalanceException extends Exception {
String msg;
	public LowBalanceException() {
		// TODO Auto-generated constructor stub
	}
	public LowBalanceException(String msg) {
		// TODO Auto-generated constructor stub
		this.msg=msg;
	}
	public String getMessage(){
		return msg;
	}
}
