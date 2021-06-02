package serbanpreda.mariana.g1087.adapter;

import java.util.ArrayList;

public class Carte extends CarteAbstracta{

	public Carte(String titlu, ArrayList<Integer> ratings) {
		super(titlu, ratings);
	}

	@Override
	public void esteAccesata() {
		System.out.println(String.format("Cartea %s a fost accesata",this.titlu));
	}

	@Override
	public void primesteRating(int nota) {
		this.ratings.add(nota);
		System.out.println(String.format("Cartea %s a primit nota %d",this.titlu,nota));
	}
	
}
