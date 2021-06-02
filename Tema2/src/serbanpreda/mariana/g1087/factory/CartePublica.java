package serbanpreda.mariana.g1087.factory;

public class CartePublica extends InterfataCarte{

	public CartePublica(String titlu, String autor) {
		super(titlu, autor);
	}

	@Override
	public void primesteRating(int rating) {
		System.out.print("Cartea "+this.titlu+ " a primit nota: " + rating);
	}

	@Override
	public String getTipCarte() {
		return "Publica";
	}

	@Override
	public String toString() {
		return "CartePublica [titlu=" + titlu + ", autor=" + autor + "]";
	}
	
	

}
