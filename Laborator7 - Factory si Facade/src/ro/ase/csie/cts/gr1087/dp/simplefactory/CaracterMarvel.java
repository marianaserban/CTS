package ro.ase.csie.cts.gr1087.dp.simplefactory;

public class CaracterMarvel extends SuperErouAbstract{
	
	int putere;

	public CaracterMarvel(String nume, int puncteViata,
			int putere) {
		super(nume, puncteViata);
		this.putere=putere;
	}

	@Override
	public void seDeplaseaza() {
		
	}
	
}
