package ro.ase.csie.cts.seminar4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

import ro.ase.csie.cts.seminar4.banking.BankAccount;
import ro.ase.csie.cts.seminar4.banking.CreditBankAccount;
import ro.ase.csie.cts.seminar4.banking.DebitBankAccount;
import ro.ase.csie.cts.seminar4.banking.EmailNotificationService;
import ro.ase.csie.cts.seminar4.banking.NotificationService;
import ro.ase.csie.cts.seminar4.banking.Person;
import ro.ase.csie.cts.singleton.Elvis;

public class Main {

	public static void main(String[] args) {
		NotificationService emailService = new EmailNotificationService();

		Person p3 = new Person("Van Damme");
		p3.setEmail("vandamme123@gmail.com");
		p3.setMobile("078662222");
		
		CreditBankAccount bankAccount=CreditBankAccount.createCreditBankAccountWithBalance(emailService, "INGB234567", p3, 100);
		CreditBankAccount b1=CreditBankAccount.createCreditBankAccountWithoutBalance(emailService, "RZ12345", p3);
		
		BigInteger bi=new BigInteger(24,11,new Random());
		BigInteger.probablePrime(12, new Random());
		
		Boolean value=Boolean.valueOf(false);
		
		bankAccount.deposit(50);
		
		System.out.println(bankAccount.toString());
		
		 Elvis elvis = Elvis.theTrueElvis;
	     System.out.println("\n\n");
	     elvis.sing();
	}

}
