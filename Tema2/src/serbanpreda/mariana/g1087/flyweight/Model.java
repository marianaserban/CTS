package serbanpreda.mariana.g1087.flyweight;

public class Model implements InterfataModel{
	
	Culoare culoare;
	
	public Model(Culoare culoare) {
		super();
		this.culoare = culoare;
	}

	@Override
	public void desenare(Ecran context) {
		System.out.println(String.format("Desenare carte de culoare %s la %d, %d",
				this.culoare,context.getX(),context.getY()));
	}
}
