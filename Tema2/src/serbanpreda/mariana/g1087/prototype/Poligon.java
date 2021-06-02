package serbanpreda.mariana.g1087.prototype;

import java.util.ArrayList;

public class Poligon  implements Cloneable{
	ArrayList<Integer>puncte=new ArrayList<>();

	public Poligon(ArrayList<Integer> puncte) {
		super();
		this.puncte = puncte;
	}
	
	private  Poligon() {
	}

	@Override
	public String toString() {
		return "Poligon [puncte=" + puncte + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Poligon copie=new Poligon();
		copie.puncte=(ArrayList<Integer>) this.puncte.clone();
		
		return copie;
	}
	
	
}
