package ro.ase.csie.cts.g1087.dp.builder;

public class SuperErou {
	
	private String nume;
	private int puncteViata;
	
	private boolean esteNegativ;
	private boolean esteRanitGrav;
	
	private InterfataArma armaStanga;
	private InterfataArma armaDreapa;
	private InterfataSuperPutere superPutere;
	private InterfataSuperPutere superSuperPutere;
	
	private SuperErou() {
		
	}

	private SuperErou(String nume, int puncteViata, boolean esteNegativ, boolean esteRanitGrav, InterfataArma armaStanga,
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
	
	
	
	//daca n ar fi statica ar fi ca o metoda membra
	//ca sa o accesez am nevoie de un obiect
	//daca n ar fi statica n as avea cu sa o apelez
	public static class SuperErouBuilder{
		
		SuperErou superErou;
		
		public SuperErouBuilder(String nume, int puncteViata) {
			this.superErou=new SuperErou();
			this.superErou.nume=nume;
			this.superErou.puncteViata=puncteViata;
		}
		
		//intoarce referinta catre bulder
		public SuperErouBuilder esteNegativ() {
			this.superErou.esteNegativ=true;
			return this;
		}
		
		public SuperErouBuilder esteRanit() {
			this.superErou.esteRanitGrav=true;
			return this;
		}
		
		public SuperErouBuilder setArmaStanga(InterfataArma arma) {
			this.superErou.armaStanga=arma;
			return this;
		}
		
		public SuperErouBuilder setArmaDreapta(InterfataArma arma) {
			this.superErou.armaDreapa=arma;
			return this;
		}
		
		public SuperErouBuilder setSuperPutere(InterfataSuperPutere superPutere) {
			this.superErou.superPutere=superPutere;
			return this;
		}
		
		public SuperErouBuilder setSuperSuperPutere(InterfataSuperPutere superSuperPutere) {
			this.superErou.superSuperPutere=superSuperPutere;
			return this;
		}
		
		public SuperErou buid() {
			return this.superErou;
		}
		
	}
	
}
