package ro.ase.csie.seminar2.solid;

public class BankAccount {
	
	private String iban;
	private long balance;
	private Person accountHolder;
	
	
	public BankAccount(String iban, Person person) {
		this.iban=iban;
		this.accountHolder=person;
		this.balance=0;
	}
	
	public void withdraw(long amount) throws InsuficientFundsException {
		if(amount > balance)
			throw new InsuficientFundsException("Insuficient funds "+balance);
		System.out.println("Withdrawing "+amount+" from "+iban);
		balance-=amount;
		
	}
	public void deposit(long amount) {
		System.out.println("Adding "+amount+" from "+iban);
		balance+=amount;
	}

	public String getIban() {
		return iban;
	}

	public long getBalance() {
		return balance;
	}

	public Person getAccountHolder() {
		return accountHolder;
	}
}
