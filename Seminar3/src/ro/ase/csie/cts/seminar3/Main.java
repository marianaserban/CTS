package ro.ase.csie.cts.seminar3;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class Main {

	public static void main(String[] args) {
		
		//Liskov
		Map<Person, BankAccount>employees=new HashMap<>();
		
		Person p1=new Person("Chuch Noris");
		BankAccount b1=new BankAccount("RFZ12345678", p1);
		
		Person p2=new Person("Arnold");
		BankAccount b2=new FeeBankAccount("AAA123455666", p2);
		
		Person p3=new Person("Van Damme");
		BankAccount b3=new BankAccount("INGB12345555", p3);
		
		employees.put(p1, b1);
		employees.put(p2, b2);
		employees.put(p3, b3);
		
		for (Account a: employees.values()) {
			a.deposit(1000);
		}
		
		for (Account a: employees.values()) {
			try {
				a.withdraw(10);
			} catch (InsuficientFundsException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
