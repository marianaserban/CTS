package ro.ase.csie.cts.g1087.dp.composite;

public abstract class NodAbstractStructura implements InterfataCaractereNPC{
	
	//interfata specifica nodurilor composite
	public abstract void adaugaNod(NodAbstractStructura nod);
	public abstract void stergeNod(NodAbstractStructura nod);
	public abstract NodAbstractStructura getNod(int index);
}
