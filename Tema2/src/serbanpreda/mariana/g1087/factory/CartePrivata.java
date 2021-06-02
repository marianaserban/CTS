package serbanpreda.mariana.g1087.factory;

import java.util.ArrayList;

public class CartePrivata extends InterfataCarte{
	
	ArrayList<Utilizator>utilizatori=new ArrayList<>();

	public CartePrivata(String titlu, String autor, ArrayList<Utilizator>utilizatori) {
		super(titlu, autor);
		this.utilizatori=utilizatori;
	}


	@Override
	public String getTipCarte() {
		return "Privata";
	}

	@Override
	public String toString() {
		return "CartePrivata [utilizatori=" + utilizatori + ", titlu=" + titlu + ", autor=" + autor + "]";
	}


	@Override
	public void primesteRating(int rating) {
		System.out.print("Cartea "+this.titlu+ " a primit nota: " + rating);		
	}
	
}
