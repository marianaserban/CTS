package serbanpreda.mariana.g1087.decorator;

public class DecoratorFont extends DecoratorPDF{
	
	public DecoratorFont(PDFAbstract pdfAbstract) {
		super(pdfAbstract);
	}

	@Override
	public void schimbaDimensiuneFont(int font) {
		if(font < this.pdfAbstract.getDimensiuneFont()) {
			this.pdfAbstract.schimbaDimensiuneFont(font);
			System.out.println("S-a micsorat numarul de pagini");
		}else {
			this.pdfAbstract.schimbaDimensiuneFont(font);
			System.out.println("A crescut numarul de pagini");
		}
	}

}
