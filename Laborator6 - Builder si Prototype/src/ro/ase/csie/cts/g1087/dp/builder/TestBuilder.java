package ro.ase.csie.cts.g1087.dp.builder;


public class TestBuilder {

	public static void main(String[] args) {
		
		//1 construiesti obiectul
		//SuperErou superErou=new SuperErou();
		//2. initializarea atributelor
		//superErou.nume="Superman";
		
//		SuperErou superErou2=
//				new SuperErou("Batman", 100, false, false, 
//						new Arma(), null, null, null);
		
		SuperErou superman=
				new SuperErou.SuperErouBuilder("Superman", 100)
				.setArmaDreapta(new Arma())
				.setArmaStanga(new Arma())
				.buid();
		//avem referinta la builder, pot apela metode din ele
		//am intors referinta pot apela altele
		
		SuperErou joker=
				new SuperErou.SuperErouBuilder("Joker", 200)
				.esteNegativ()
				.esteRanit()
				.setArmaDreapta(new Arma())
				.buid();
		
		//facem directorul in situatia asta
		//definim o metoda construiesteJoker() ca sa nu mai copiem cod
		SuperErou joker2=
				new SuperErou.SuperErouBuilder("Joker", 200)
				.esteNegativ()
				.esteRanit()
				.setArmaDreapta(new Arma())
				.buid();
		
		
	}

}
