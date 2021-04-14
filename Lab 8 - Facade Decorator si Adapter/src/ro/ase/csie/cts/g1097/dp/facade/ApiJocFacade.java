package ro.ase.csie.cts.g1097.dp.facade;

public class ApiJocFacade {
	
	public static ProfilJucator getProfil(
			String ipServer, int port, String numeUtilizaror,
			String parola) {
		ServerJoc server=new ServerJoc("10.0.0.1", 3306);

		if(server.conectare()) {
			Utilizator utilizator=new Utilizator();
			utilizator.login(numeUtilizaror, parola);
			ProfilJucator profil=utilizator.getProfil();			
			return profil;
		}else {
			return null;
		}
	}
}
