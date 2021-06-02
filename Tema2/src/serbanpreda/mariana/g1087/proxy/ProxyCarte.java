package serbanpreda.mariana.g1087.proxy;

public class ProxyCarte implements InterfataCarte{
	String titlu;
	String autor;
	double rating;
	
	public ProxyCarte(String titlu, String autor, double rating) {
		super();
		this.titlu = titlu;
		this.autor = autor;
		this.rating = rating;
	}

	@Override
	public String getTitlu() {
		return this.titlu;
	}

	@Override
	public String getAutor() {
		return this.autor;
	}

	@Override
	public double getRating() {
		return this.rating;
	}

	@Override
	public void print() {
		System.out.println("ProxyCarte [titlu=" + titlu + ", autor=" + autor + ", rating=" + rating + "]");
	}

	public Carte seeMore() {
		System.out.println("Preluare informatii suplimentare bd");
        String descriere = "Un bestseller desavarsit";
        TipCarte tipCarte=TipCarte.PRIVATA;
        return new Carte(this.titlu,this.autor,descriere,this.rating,tipCarte);
	}
}
