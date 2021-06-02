package serbanpreda.mariana.g1087.proxy;

public class Carte implements InterfataCarte{
	
	String titlu;
	String autor;
	String descriere;
	double rating;
	TipCarte TipCarte;
	
	public Carte(String titlu, String autor, String descriere, double rating,
			serbanpreda.mariana.g1087.proxy.TipCarte tipCarte) {
		super();
		this.titlu = titlu;
		this.autor = autor;
		this.descriere = descriere;
		this.rating = rating;
		TipCarte = tipCarte;
	}

	@Override
	public String getTitlu() {
		return this.titlu;
	}

	@Override
	public String getAutor() {
		return this.autor;
	}

	public String getDescriere() {
		return this.descriere;
	}

	@Override
	public double getRating() {
		return rating;
	}

	public TipCarte getTipCarte() {
		return TipCarte;
	}

	@Override
	public void print() {
		System.out.println("Carte [titlu=" + titlu + ", autor=" + autor + ", descriere=" + descriere + ", rating=" + rating
				+ ", TipCarte=" + TipCarte + "]");
	}

}
