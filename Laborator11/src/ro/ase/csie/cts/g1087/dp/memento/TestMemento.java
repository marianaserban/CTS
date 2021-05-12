package ro.ase.csie.cts.g1087.dp.memento;

public class TestMemento {

	public static void main(String[] args) {
		//manager salvari daca vreau un istoric ca la command
		CaracterJoc superman=new CaracterJoc("superman", 100, "zboara");
		MementoCaracterJoc salvareInceputJoc=superman.salvareCaracterJoc();
		superman.ataca();
		superman.seVindeca(100);
		System.out.println("Puncte viata: "+superman.puncteViata);
		
		superman.incarcaSalvare(salvareInceputJoc);
		System.out.println("Puncte viata: "+superman.puncteViata);

	}
}
