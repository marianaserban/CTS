package serbanpreda.mariana.g1087.decorator;

public class DecoratorPDF extends PDFAbstract{
	
	PDFAbstract pdfAbstract=null;
	
	public DecoratorPDF(PDFAbstract pdfAbstract) {
		super(pdfAbstract.getDimensiuneFont(), pdfAbstract.getCuloareBackground());
		this.pdfAbstract=pdfAbstract;
	}
	@Override
	public void schimbaDimensiuneFont(int font) {
		this.pdfAbstract.schimbaDimensiuneFont(font);
	}
	@Override
	public void adaugaCuloareBackground(String culoare) {
		this.pdfAbstract.adaugaCuloareBackground(culoare);
	}
}
