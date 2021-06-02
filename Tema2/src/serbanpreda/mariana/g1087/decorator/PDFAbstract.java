package serbanpreda.mariana.g1087.decorator;

public abstract class PDFAbstract {
	
	int dimensiuneFont;
	String culoareBackground;
	
	public PDFAbstract (int dimensiuneFont, String culoareBackground) {
		super();
		this.dimensiuneFont = dimensiuneFont;
		this.culoareBackground = culoareBackground;
	}

	public int getDimensiuneFont() {
		return dimensiuneFont;
	}

	public String getCuloareBackground() {
		return culoareBackground;
	}

	public abstract void schimbaDimensiuneFont(int font);
	public abstract void adaugaCuloareBackground(String culoare);
	
}
