package ro.ase.csie.cts.g1087.dp.flyweight;

import java.util.ArrayList;

public class Model3D implements InterfataModel3D{

	//partea comuna
	String descriere;
	ArrayList<Integer>puncteModel=new ArrayList<>();
	
	public Model3D(String descriere) {
		super();
		this.descriere = descriere;
	}

	@Override
	public void incarcaModel3D(String fisier) {
		System.out.println(String.format("Incarcare model pentru %s din fisier %s", this.descriere,fisier));;
		for(int i=0;i<10;i++) {
			puncteModel.add(i);
		}
	}

	//partea unica
	@Override
	public void afisareEcran(ContextEcran context) {
		System.out.println(String.format("Afisare %s la %d, %d cu textura %s",
				this.descriere,context.getX(), context.getY(), context.getCuloareTextura()));
	}
}
