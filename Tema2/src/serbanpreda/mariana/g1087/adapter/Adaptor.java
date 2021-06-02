package serbanpreda.mariana.g1087.adapter;

public class Adaptor extends CarteAbstracta{
	
	CarteGoogleAbstracta carteGoogleAbstracta=null;

	public Adaptor(CarteGoogleAbstracta carteGoogleAbstracta) {
		super(carteGoogleAbstracta.getTitle(), carteGoogleAbstracta.getNoteArrayList());
		this.carteGoogleAbstracta = carteGoogleAbstracta;
	}

	@Override
	public void esteAccesata() {
		carteGoogleAbstracta.esteDeschisa("https://googlebooks.com");
	}

	@Override
	public void primesteRating(int nota) {
		carteGoogleAbstracta.acordaNota(nota);
	}

}
