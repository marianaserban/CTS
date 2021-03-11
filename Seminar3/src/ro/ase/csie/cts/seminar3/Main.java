package ro.ase.csie.cts.seminar3;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		NotificationService smsService = new SMSNotificationService();
		NotificationService emailService = new EmailNotificationService();

		Map<Person, Receivable> employees = new HashMap<>();

		Person p1 = new Person("Chuch Noris");
		p1.setEmail("chuck@yahoo.com");
		p1.setMobile("0723318889");
		CreditBankAccount b1 = new CreditBankAccount(smsService, "RFZ12345678", p1, -500);

		Person p2 = new Person("Arnold");
		p2.setEmail("arnold@gmail.com");
		p2.setMobile("078662222");
		DebitBankAccount b2 = new FeeBankAccount(emailService, "AAA123455666", p2);

		Person p3 = new Person("Van Damme");
		p3.setEmail("vandamme123@gmail.com");
		p3.setMobile("078662222");
		DebitBankAccount b3 = new DebitBankAccount(emailService, "INGB12345555", p3);

		employees.put(p1, b1);
		employees.put(p2, b2);
		employees.put(p3, b3);

		for (Receivable a : employees.values()) {
			a.deposit(1000);
		}

		Map<Person, Payable> union = new HashMap<>();
		union.put(p2, b2);
		union.put(p3, b3);

		for (Payable a : union.values()) {
			try {
				a.withdraw(10);
			} catch (InsuficientFundsException e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("\n\n");

		try {
			b2.transfer(b3, 200);
		} catch (InsuficientFundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
