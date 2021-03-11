package ro.ase.csie.cts.seminar3;

public class CreditBankAccount implements Receivable {

	private long balance;
	private String iban;
	private Person accountHolder;
	
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
