package ro.ase.csie.seminar2;

import java.math.BigDecimal;

import ro.ase.csie.seminar2.solid.BankAccount;
import ro.ase.csie.seminar2.solid.Person;

public class Main {

	public static void main(String[] args) {
//		CalendarUtil cu = new CalendarUtil();
//		double d1=1.02;
//		double d2=0.43;
//		BigDecimal bg1=new BigDecimal("1.02");
//		BigDecimal bg2=new BigDecimal("0.43");
//
//		System.out.println(d1-d2);
//		System.out.println(bg1.subtract(bg2));
//
//		try {
//			System.out.print(cu.weekDay2(3));
//			System.out.print(cu.weekDay(1));
//			System.out.print(cu.weekDay4(2).toUpperCase());
//			
//		} catch (IncorectDayException e) {
//			System.out.print(e.getMessage());
//		}
		
		Person person=new Person("Mariana");
		BankAccount account=new BankAccount("INGB123456", person);
		
	}

}
