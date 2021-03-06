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
		boolean selectieTemaUniversala=true;
		SuperErouAbstract superCaracter=null;
		
		if(selectieTemaUniversala) {
			
			superCaracter = 
					FcatorySuperErou.getSuperErou(TipErou.DISNEY, "Mickey Mouse");
			superCaracter=FcatorySuperErou.getSuperErou(TipErou.MARVEL, "Spiderman");
			superCaracter=FcatorySuperErou.getSuperErou(TipErou.DC, "Batman");
			
			superCaracter.setPuncteViata(100);
		}
		else {
			//folosesti caractere din tema originala a jocului
		}
	}

}
