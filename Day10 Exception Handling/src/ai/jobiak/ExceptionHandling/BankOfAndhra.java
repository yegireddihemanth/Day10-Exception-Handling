package ai.jobiak.ExceptionHandling;

import ai.jobiak.Exception.TransferException;

public class BankOfAndhra {

	public static void main(String[] args) {
		
		Account account = new Account("hemanth kumar", "111A", 2500.00);
		Account account2 = new Account("harish kumar", "222B", 30000.00);
		Account account3 = new Account("janaki", "333C", 15000.00);
		
		
		AccountServices service;
		service= account;
		try {
			double drwa = service.withDrawa(3000000);
		} catch (withDrawaException e1) {
			// TODO Auto-generated catch block
			System.err.println(e1);
		}
		System.out.println(account.getBalance());
		 
		/*double result = service.diposite(2000);
		System.out.println(+result+ "	 acc no. :  "+account.getAccNo()+"	 name : "+account.getFullName()+" 	balance : "+account.getBalance());
		double result2 = service.withDrawa(4500);
		System.out.println(result2+" "+ account.getBalance());*/
		System.out.println(account2.getBalance());
		boolean result3;
		try {
			result3 = service.transfer(account2, 3000);
			System.out.println(result3);
		} catch (TransferException e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
		
		System.out.println(account.getBalance());
		System.out.println(account2.getBalance());
		
		
		 //boolean result6 = account.transfer(account, 4000);
		 //System.out.println(result6 + " total amount : "+ account.getBalance());
		/*System.out.println("we are in second account");
		 service  = account2;
		 double result5 = account2.withDrawa(4000);
		 System.out.println(result5+ " "+ account2.getBalance());
		 System.out.println("account2:" + account2.getBalance());
		 System.out.println("we are in thired");
		 service = account3;
		 System.out.println(account3.getBalance());
		 double current = service.diposite(10);
		 System.out.println(current);
		 System.out.println(account3.getBalance());
		// boolean res = service.transfer(account2, 5000);
		// System.out.println(res);
		 System.out.println(account3.getBalance());
		 System.out.println("account2:" + account2.getBalance());*/
		
		service = account3;
		 
		try {
			double dipo = account3.diposite(300);
		} catch (DipositException e3) {
			// TODO Auto-generated catch block
			System.err.println(e3);
		}
		System.out.println(account3.getBalance());
		
		try {
			double dipo2 = account2.diposite(200);
			
			x
		} catch (DipositException e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
		System.out.println(account2.getBalance());
		
		
		
	}

}
