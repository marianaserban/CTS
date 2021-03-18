package ro.ase.csie.cts.seminar4.banking;

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
	
	public static CreditBankAccount createCreditBankAccountWithBalance(NotificationService notificationService,
			String iban, Person accountHolder, long balance) {
		return new CreditBankAccount(notificationService, iban, accountHolder, balance);
	}
	
	public static CreditBankAccount createCreditBankAccountWithoutBalance(NotificationService notificationService,
			String iban, Person accountHolder) {
		return new CreditBankAccount(notificationService, iban, accountHolder,0);
	}
	
}
