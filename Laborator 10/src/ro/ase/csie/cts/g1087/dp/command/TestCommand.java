package ro.ase.csie.cts.g1087.dp.command;

public class TestCommand {

	public static void main(String[] args) {
		
		ManagerTaskuri manager=new ManagerTaskuri();
		
		//aici pot avea un factory care sa mi dea singletons
		TaskAsincron autoSave=new TaskToDo(new ModulAutoSave() , "AutoSave", 5);
		TaskAsincron autoUpdateAsincron=new TaskToDo(new ModulUpdateClient(), "Update v2", 20);
		//executie taskuri asincrone
		//autoSave.executaTask();
		//autoUpdateAsincron.executaTask();
		
		manager.adaugaTask(autoSave);
		manager.adaugaTask(autoUpdateAsincron);
		
		System.out.println("Jocul este activ");
		//simulam multithreading
		manager.executaTask();
		manager.executaTask();
		System.out.println("Jocul este activ");
	}

}
