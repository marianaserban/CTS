package ro.ase.csie.cts.g1087.dp.command;

public class TestCommand {

	public static void main(String[] args) {
		
		//aici pot avea un factory care sa mi dea singletons
		TaskAsincron autoSave=new TaskToDo(new ModulAutoSave() , "AutoSave", 5);
		TaskAsincron autoUpdateAsincron=new TaskToDo(new ModulUpdateClient(), "Update v2", 20);
		//executie taskuri asincrone
		autoSave.executaTask();
		autoUpdateAsincron.executaTask();
		
	}

}
