package ro.ase.csie.cts.seminar3;

public class CreditBankAccount extends BankAccount implements Receivable {
	
	public  CreditBankAccount(String iban, Person accountHolder, long balance) {
		this.iban=iban;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}	

	@Override
	public void deposit(long amount) {
		System.out.println("Adding "+amount+" from "+iban);
		this.balance+=amount;
	}

}
