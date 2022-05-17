package ai.jobiak.ExceptionHandling;

import ai.jobiak.Exception.TransferException;

public class Account implements AccountServices {

	private String fullName;
	private String accNo;
	private double balance;
	private int amount;
	
	public Account() {
		
	}
	
	
	
	public Account(String fullName, String accNo, double balance) {
		super();
		this.fullName = fullName;
		this.accNo = accNo;
		this.balance = balance;
	}
	
	



	public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public String getAccNo() {
		return accNo;
	}



	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}



	public double getBalance() {
		return this.balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	@Override
	public double withDrawa(double amount) throws withDrawaException {
		if(this.getBalance()>=amount) {
		this.balance-=amount;
		
		}
		else {
			throw new withDrawaException("more than init"+ this.getAccNo());
		}
		return this.balance;
	}

	@Override
	public double diposite(double amount) throws DipositException {
		if(this.amount>=500) {
			this.balance+=amount;
		}
		else {
			throw new DipositException("amount should be more than 500 : "+ this.accNo);
		}
		
			
		return this.balance;
	}

	@Override
	public boolean transfer(Account account, double amount)throws TransferException {
		
		if(this.getBalance()>=amount) {
		this.balance-=amount;
		account.setBalance(this.getBalance()+amount);
		}
		else {
			throw new TransferException("insufficent balance in :"+ this.getAccNo());
		}
		return true;
	}

	@Override
	public double getBalance(String accNo) {
		// TODO Auto-generated method stub
		return this.balance;
	}

}
