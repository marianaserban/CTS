package serbanpreda.mariana.g1087.flyweight;

import java.util.HashMap;

public class FactoryModel {
	
	static HashMap<Culoare, InterfataModel>carti = new HashMap<>();
	
		static {
			Culoare[] listaModele=new Culoare[] {Culoare.ALBASTRU, Culoare.ROSU, Culoare.VERDE, Culoare.GALBEN};
			for(Culoare model:listaModele) {
				Model model2d=new Model(model);
				carti.put(model, model2d);
			}
		}
		
		public static InterfataModel getCarte2D(Culoare culoare) {
			return carti.get(culoare);
		}

}
