package serbanpreda.mariana.g1087.factory;

import java.util.ArrayList;

public class FactoryCarte {

	public static InterfataCarte getCarte(TipCarte tip, String titlu, String autor) {
		InterfataCarte carte=null;
		switch (tip) {
		case PUBLICA:
			carte=new CartePublica(titlu, autor);
			break;
		case PRIVATA:
			carte=new CartePrivata(titlu, autor, new ArrayList<Utilizator>() {{add(new Utilizator("mariana"));}});
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return carte;
	}
}
