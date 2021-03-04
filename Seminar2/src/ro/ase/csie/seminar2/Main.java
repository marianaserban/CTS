package ro.ase.csie.seminar2;

public class Main {

	public static void main(String[] args) {
		CalendarUtil cu = new CalendarUtil();

		try {
			System.out.print(cu.weekDay2(3));
			System.out.print(cu.weekDay(1));
			System.out.print(cu.weekDay4(2).toUpperCase());
		} catch (IncorectDayException e) {
			System.out.print(e.getMessage());
		}

	}

}
