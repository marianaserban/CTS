package ro.ase.csie.cts.gr1087.dp.simplefactory;

public class CaracterDisney extends SuperErouAbstract{
	
	boolean cuAcordParental;

	public CaracterDisney(String nume, int puncteViata,
			boolean acordParental) {
		super(nume, puncteViata);
		this.cuAcordParental=acordParental;
	}

	@Override
	public void seDeplaseaza() {
		
	}

}
