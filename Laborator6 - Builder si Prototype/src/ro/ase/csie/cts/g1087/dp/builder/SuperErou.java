package ro.ase.csie.cts.g1087.dp.builder;

public class SuperErou {
	
	String nume;
	int puncteViata;
	
	boolean esteNegativ;
	boolean esteRanitGrav;
	
	InterfataArma armaStanga;
	InterfataArma armaDreapa;
	InterfataSuperPutere superPutere;
	InterfataSuperPutere superSuperPutere;
	
	public SuperErou() {
		
	}

	public SuperErou(String nume, int puncteViata, boolean esteNegativ, boolean esteRanitGrav, InterfataArma armaStanga,
			InterfataArma armaDreapa, InterfataSuperPutere superPutere, InterfataSuperPutere superSuperPutere) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.esteNegativ = esteNegativ;
		this.esteRanitGrav = esteRanitGrav;
		this.armaStanga = armaStanga;
		this.armaDreapa = armaDreapa;
		this.superPutere = superPutere;
		this.superSuperPutere = superSuperPutere;
	}
	
	
	
}
