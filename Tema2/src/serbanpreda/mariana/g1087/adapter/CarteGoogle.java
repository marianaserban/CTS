package serbanpreda.mariana.g1087.adapter;

import java.util.ArrayList;

public class CarteGoogle extends CarteGoogleAbstracta{


	public CarteGoogle(String title, ArrayList<Integer> note) {
		super(title, note);
	}

	@Override
	public void esteDeschisa(String link) {
		System.out.println(String.format("Cartea %s este deschisa la adresa %s",this.title,link));
	}

	@Override
	public double getMediaNotelor() {
		return this.noteArrayList.stream().mapToInt(val -> val).average().orElse(0.0);
	}

	@Override
	public void acordaNota(int nota) {
		if(nota > 0) {
			this.noteArrayList.add(nota);
			System.out.println(String.format("Cartea %s a primit nota %d",this.title,nota));
		}
	}

}
