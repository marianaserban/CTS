package ro.ase.csie.cts.g1087.dp.flyweight;

import java.util.HashMap;


public class FactoryModel3D {
	
	static HashMap<String, InterfataModel3D>modele = new HashMap<>();
	
	//eager instantiation - se incarca jocul
	static {
		//generam toate modelele 3D - modelele flyweight
		String[] listaModele=new String[] {"Soldat", "Copac", "Cladire"};
		for(String model:listaModele) {
			Model3D model3d=new Model3D(model);
			model3d.incarcaModel3D(model+".3d");
			modele.put(model, model3d);
		}
	}
	
	public static InterfataModel3D getModel3D(String tip) {
		return modele.get(tip);
	}
}
