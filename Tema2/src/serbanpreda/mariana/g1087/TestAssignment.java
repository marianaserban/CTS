package serbanpreda.mariana.g1087;

import java.io.IOException;
import java.util.ArrayList;

import serbanpreda.mariana.g1087.adapter.Adaptor;
import serbanpreda.mariana.g1087.adapter.Carte;
import serbanpreda.mariana.g1087.adapter.CarteAbstracta;
import serbanpreda.mariana.g1087.adapter.CarteGoogle;
import serbanpreda.mariana.g1087.builder.Avatar;
import serbanpreda.mariana.g1087.builder.Descriere;
import serbanpreda.mariana.g1087.builder.Profil;
import serbanpreda.mariana.g1087.decorator.DecoratorFont;
import serbanpreda.mariana.g1087.decorator.PDF;
import serbanpreda.mariana.g1087.decorator.PDFAbstract;
import serbanpreda.mariana.g1087.factory.FactoryCarte;
import serbanpreda.mariana.g1087.factory.InterfataCarte;
import serbanpreda.mariana.g1087.factory.TipCarte;
import serbanpreda.mariana.g1087.flyweight.Ecran;
import serbanpreda.mariana.g1087.flyweight.FactoryModel;
import serbanpreda.mariana.g1087.flyweight.InterfataModel;
import serbanpreda.mariana.g1087.prototype.Culoare;
import serbanpreda.mariana.g1087.prototype.ModelCarte;
import serbanpreda.mariana.g1087.prototype.Poligon;
import serbanpreda.mariana.g1087.proxy.ProxyCarte;
import serbanpreda.mariana.g1087.singleton.Logger;

public class TestAssignment {

	public static void main(String[] args) {
		
		try {
			Logger log1 = Logger.getInstance();
			Logger log2=Logger.getInstance();
			System.out.print("Test Singleton: \n");
			log1.showLog("Te-ai inregistrat cu succes!");
			System.out.print("\n");
			log1.showLog("Te-ai autentificat cu succes!");
			System.out.print("\n");
			log2.showLog("Parola updatata cu succes!");
			System.out.print("\n");
			
			if(log1==log2) {
				System.out.println("Referinte catre acelasi obiect");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nTest Simple Factory: ");
		FactoryCarte factoryCarte=new FactoryCarte();
		InterfataCarte carte1=FactoryCarte.getCarte(TipCarte.PUBLICA, "Mara", "Ioan Slavici");
		InterfataCarte carte2=FactoryCarte.getCarte(TipCarte.PRIVATA, "Baltagul", "Mihail Sadoveanu");
		System.out.println("Tip carte1: "+carte1.getTipCarte());
		carte1.primesteRating(5);
		System.out.println("\nTip carte2: "+carte2.getTipCarte());
		carte2.primesteRating(3);
		System.out.println("\n");
		System.out.println(carte1.toString());
		System.out.println(carte2.toString());
		
		System.out.print("\n Test Builder: ");
		Profil profil1=new Profil.ProfilBuilder("mariana@gmail.com", "123")
				.setNume("Serban")
				.setPrenume("Mariana")
				.setDescriere(new Descriere("Imi place sa citesc"))
				.buid();
		
		Profil profil2=new Profil.ProfilBuilder("gigel@yahoo.com", "1234")
				.setAvatar(new Avatar())
				.setNumeUtilizator("gigel123")
				.buid();
		System.out.println(profil1.toString()+"\n");
		System.out.println(profil2.toString());
		
		System.out.println("\nTest Prototype: ");
		ArrayList<Poligon>poligoane=new ArrayList<>();
		poligoane.add(new Poligon(new ArrayList<Integer>() {{add(1);add(23);add(45);}}));
		ModelCarte c1=new ModelCarte(Culoare.ROSU, poligoane);
		System.out.println(c1.toString());
		
		try {
			ModelCarte c2=(ModelCarte) c1.clone();
			System.out.println("Copie: "+ c2.toString());
			
			ModelCarte c3=(ModelCarte)c1.clone();
			System.out.println("Cealalta copie: "+ c3.toString());


		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nTest Decorator: ");
		
		PDFAbstract pdf=new PDF(12,"transparent");
		pdf.schimbaDimensiuneFont(10);
		pdf.adaugaCuloareBackground("bej");
		
		pdf=new DecoratorFont(pdf);
		pdf.schimbaDimensiuneFont(23);
		
		System.out.println("\nTest Adapter: ");
		
		Carte carte=new Carte("Ion", new ArrayList<Integer>() {{add(3);add(5);}});
		carte.esteAccesata();
		carte.primesteRating(4);
		
		CarteGoogle carteGoogle=new CarteGoogle("Baltagul",new ArrayList<Integer>() {{add(4);add(5); add(5);}});
		carteGoogle.acordaNota(3);
		carteGoogle.esteDeschisa("https://google-books.com/baltagul");
		System.out.println("Media notelor: "+ carteGoogle.getMediaNotelor());
		
		ArrayList<CarteAbstracta>carti=new ArrayList<>();
		carti.add(carte);
		
		Adaptor adaptorCarteGoogle=
				new Adaptor(carteGoogle);
		carti.add(adaptorCarteGoogle);
		
		for(CarteAbstracta c: carti) {
			c.esteAccesata();
			c.primesteRating(4);
		}
		
		System.out.println("\nTest Proxy");
		serbanpreda.mariana.g1087.proxy.InterfataCarte carte3=new ProxyCarte("Ion", "Liviu Rebreanu", 4.6);
		carte3.print();
		carte3=((ProxyCarte) carte3).seeMore();
		carte3.print();
	
		System.out.println("\nTest Flyweight");
		Ecran context1=new Ecran(10, 20);
		Ecran context2=new Ecran(30, 20);
		Ecran context3=new Ecran(23, 55);
		Ecran contex4=new Ecran(22, 44);
		Ecran contex5=new Ecran(55, 88);

		
		InterfataModel modelCarteAlbastra=FactoryModel.getCarte2D(serbanpreda.mariana.g1087.flyweight.Culoare.ALBASTRU);
		InterfataModel modelCarteRosie=FactoryModel.getCarte2D(serbanpreda.mariana.g1087.flyweight.Culoare.ROSU);
				
		modelCarteAlbastra.desenare(context1);
		modelCarteAlbastra.desenare(context2);
		modelCarteAlbastra.desenare(context3);
		modelCarteRosie.desenare(contex4);
		modelCarteRosie.desenare(contex5);
		
	}

}
