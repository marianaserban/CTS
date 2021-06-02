package serbanpreda.mariana.g1087.decorator;

public class PDF extends PDFAbstract{

	public PDF(int dimensiuneFont, String culoareBackground) {
		super(dimensiuneFont, culoareBackground);
	}

	@Override
	public void schimbaDimensiuneFont(int font) {
		this.dimensiuneFont=font;
		System.out.println("Noul font este: " + this.dimensiuneFont);
	}

	@Override
	public void adaugaCuloareBackground(String culoare) {
		this.culoareBackground=culoare;
		System.out.println("Noua culoare este: " + this.culoareBackground);
	}
}
