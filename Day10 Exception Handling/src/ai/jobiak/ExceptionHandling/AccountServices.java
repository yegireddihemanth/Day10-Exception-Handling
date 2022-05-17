package ai.jobiak.ExceptionHandling;

import ai.jobiak.Exception.TransferException;

public interface AccountServices {

	public double withDrawa(double amount)throws withDrawaException;
	public double diposite(double amount)throws DipositException;
	public boolean transfer(Account account, double amount)throws TransferException;
	public double getBalance(String accNo);

}
