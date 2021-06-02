package serbanpreda.mariana.g1087.builder;

public class Profil {

	private String email;
	private String parola;
	private String numeUtilizator;
	private String nume;
	private String prenume;
	private InterfataDescriere descriere;
	private InterfataAvatar avatar;
	
	private Profil() {
		
	}
	
	public static class ProfilBuilder{
		
		private Profil profil;
		
		public ProfilBuilder(String email, String parola) {
			this.profil=new Profil();
			profil.email=email;
			profil.parola=parola;
		}
		
		public ProfilBuilder setNumeUtilizator(String numeUtilizator) {
			this.profil.numeUtilizator=numeUtilizator;
			return this;
		}
		
		public ProfilBuilder setNume(String nume) {
			this.profil.nume=nume;
			return this;
		}
		
		public ProfilBuilder setPrenume(String prenume) {
			this.profil.prenume=prenume;
			return this;
		}
		
		
		public ProfilBuilder setAvatar(InterfataAvatar avatar) {
			this.profil.avatar=avatar;
			return this;
		}
		
		public ProfilBuilder setDescriere(InterfataDescriere descriere) {
			this.profil.descriere=descriere;
			return this;
		}
				
		public Profil buid() {
			return this.profil;
		}
		
	}

	@Override
	public String toString() {
		return "Profil [email=" + email + ", parola=" + parola + ", numeUtilizator=" + numeUtilizator + ", nume=" + nume
				+ ", prenume=" + prenume + ", descriere=" + descriere + ", avatar=" + avatar + "]";
	}
	
	
}
