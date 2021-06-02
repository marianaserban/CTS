package serbanpreda.mariana.g1087.adapter;

import java.util.ArrayList;

public abstract class CarteAbstracta {
	
	String titlu;
	ArrayList<Integer>ratings=new ArrayList<>();
	
	public CarteAbstracta(String titlu, ArrayList<Integer> ratings) {
		super();
		this.titlu = titlu;
		this.ratings = ratings;
	}
	
	public String getTitlu() {
		return titlu;
	}

	public ArrayList<Integer> getRatings() {
		return ratings;
	}

	public abstract void esteAccesata();
	public abstract void primesteRating(int nota);
}
