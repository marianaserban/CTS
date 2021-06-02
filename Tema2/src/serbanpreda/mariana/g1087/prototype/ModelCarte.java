package serbanpreda.mariana.g1087.prototype;

import java.util.ArrayList;

public class ModelCarte implements Cloneable{
	
	Culoare culoare;
	ArrayList<Poligon>poligoane=new ArrayList<>();
	
	public ModelCarte(Culoare culoare, ArrayList<Poligon> poligoane) {
		
		try {
			System.out.println("Processing ....");
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		this.culoare = culoare;
		this.poligoane = poligoane;
	}
	
	private ModelCarte() {
		
	}

	public Culoare getCuloare() {
		return culoare;
	}

	public void setCuloare(Culoare culoare) {
		this.culoare = culoare;
	}

	public ArrayList<Poligon> getPoligoane() {
		return poligoane;
	}

	public void setPoligoane(ArrayList<Poligon> poligoane) {
		this.poligoane = poligoane;
	}

	@Override
	public String toString() {
		return "ModelCarte [culoare=" + culoare + ", poligoane=" + poligoane + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		ModelCarte copie = new ModelCarte();
		copie.culoare = this.culoare;
		copie.poligoane = (ArrayList<Poligon>) this.poligoane.clone();				
		return copie;
	}
	
}
