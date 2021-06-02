package serbanpreda.mariana.g1087.builder;

public class Descriere implements InterfataDescriere{

	String descriere;
	
	public Descriere(String descriere) {
		super();
		this.descriere = descriere;
	}


	@Override
	public void adaugaBio(String descriere) {
		System.out.println("Descrierea ta este: "+ descriere);
	}


	@Override
	public String toString() {
		return "Descriere [descriere=" + descriere + "]";
	}
	
	

}
