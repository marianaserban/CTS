package ro.ase.csie.cts.g1087.dp.composite;

public class CaracterNPC extends NodAbstractStructura{

	//clasa frunza
	String nume;
	int putere;

	public CaracterNPC(String nume, int putere) {
		super();
		this.nume = nume;
		this.putere = putere;
	}

	@Override
	public void atacaJucator(String numeJucator) {
		System.out.println(String.format("%s ataca pe %s",this.nume, numeJucator));
		
	}

	@Override
	public void seRetrage() {
		System.out.println(String.format("%s se retrage",this.nume));
		
	}

	@Override
	public void seDeplaseaza() {
		System.out.println(String.format("%s se deplaseaza pe ecran",this.nume));
	}

	@Override
	public void adaugaNod(NodAbstractStructura nod) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void stergeNod(NodAbstractStructura nod) {
		throw new UnsupportedOperationException();
	}

	@Override
	public NodAbstractStructura getNod(int index) {
		throw new UnsupportedOperationException();
	}
}
