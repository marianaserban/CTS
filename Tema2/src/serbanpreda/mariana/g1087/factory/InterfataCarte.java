package serbanpreda.mariana.g1087.factory;

public abstract class InterfataCarte {
	String titlu;
	String autor;
	
	public InterfataCarte(String titlu, String autor) {
		this.titlu = titlu;
		this.autor = autor;
	}
	
	public abstract void primesteRating(int rating);
	public abstract String getTipCarte();

}
