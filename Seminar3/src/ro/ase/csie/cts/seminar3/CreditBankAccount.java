package ro.ase.csie.cts.seminar3;

public class CreditBankAccount extends BankAccount implements Receivable {
	
	public  CreditBankAccount(NotificationService notificationService,String iban, Person accountHolder, long balance) {
		super(notificationService);
		this.iban=iban;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}	

	@Override
	public void deposit(long amount) {
		notificationService.sendNotification(accountHolder, "Adding "+amount+" from "+iban);
		this.balance+=amount;
	}

}
