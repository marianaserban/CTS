package ro.ase.csie.seminar2;

public class Main {

	public static void main(String[] args) {
		CalendarUtil cu=new CalendarUtil();
		
		System.out.print(cu.weekDay(3));
		System.out.print(cu.weekDay2(3));
		System.out.print(cu.weekDay2(7));
	}

}
