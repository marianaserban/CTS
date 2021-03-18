package ro.ase.csie.cts.seminar4.banking;

public class Bank {

	private static Bank INSTANCE;

	private NotificationService emailNotificationService;
	private NotificationService smsNotificationService;

	private Bank() {
		emailNotificationService = new EmailNotificationService();
		smsNotificationService = new SMSNotificationService();
	}

	public static synchronized Bank getInstance() {
		if (INSTANCE == null)
			INSTANCE = new Bank();

		return INSTANCE;
	}

	public DebitBankAccount openDebitAccount(Person holder) {
		DebitBankAccount account;
		if (holder.getAge() > 18)
			account = new FeeBankAccount(
					holder.getNotificationType().getNotificationService(),
					generateIban(), holder);
		else
			account = new DebitBankAccount(
					holder.getNotificationType().getNotificationService(),
					generateIban(), holder);
		return account;
	}

	private String generateIban() {
		return "INGB" + System.currentTimeMillis();
	}

}