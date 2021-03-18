package ro.ase.csie.cts.seminar4.banking;

public class FeeBankAccount extends DebitBankAccount {
	
	private long fee=2;

	public FeeBankAccount(NotificationService ns,String iban, Person person) {
		super(ns,iban, person);
		
	}
	@Override
	public void withdraw(long amount) throws InsuficientFundsException {
		System.out.println("Adding "+fee+" fee to withdrawal");
		super.withdraw(amount+fee);
	}

}
