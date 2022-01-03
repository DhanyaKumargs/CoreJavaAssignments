package exceptions;

public class BankAccount {
	private int Accno;
	private String custName;
	private String accType;
	private float balance;
	
	public BankAccount(int accnum,String name,String accName,float bal) throws LowBalanceException,AccTypeNotFoundException{
		this.Accno = accnum;
		this.custName=name;
		this.accType=accName;
		if(accName.toLowerCase()=="savings"){
			if(bal>=1000){
				this.balance=bal;
			}else{
				throw new LowBalanceException();
			}
		}
		else if(accName.toLowerCase()=="current"){
			if(this.balance>5000){
				this.balance=bal;
			}else{
				throw new LowBalanceException();
			}
		}
		else{
			throw new AccTypeNotFoundException();
		}
		
		
	}
	public void deposit(float amt){
		
	}
	
	public void withdraw(float amt){
		
	}
	public float getBalance() throws LowBalanceException, AccTypeNotFoundException{
		if(this.accType.toLowerCase()=="savings"){
			if(this.balance>1000){
				return this.balance;
			}else{
				throw new LowBalanceException();
			}
		}else if(accType.toLowerCase()=="current"){
			if(this.balance>5000){
				return this.balance;
			}else{
				throw new LowBalanceException();
			}
		}
		else{
			throw new AccTypeNotFoundException();
		}
		
	}
}
