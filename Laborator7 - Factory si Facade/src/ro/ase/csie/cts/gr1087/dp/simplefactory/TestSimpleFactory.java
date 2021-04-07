package ro.ase.csie.cts.gr1087.dp.simplefactory;


public class TestSimpleFactory {

	public static void main(String[] args) {
		
		SuperErouAbstract supererou=
				new CaracterDisney("Mickey Mouse", 100, false);
		supererou=
				new CaracterMarvel("Spiderman", 150, 50);
//		supererou=
//				new CaracterDCComics("Batman", 150);
//		
		SuperErouAbstract superCaracter = 
				FcatorySuperErou.getSuperErou(TipErou.DISNEY, "Mickey Mouse");
		superCaracter=FcatorySuperErou.getSuperErou(TipErou.MARVEL, "Spiderman");
		superCaracter=FcatorySuperErou.getSuperErou(TipErou.DC, "Batman");
		
	}

}
