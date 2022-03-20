
public class Personne {

	private String nom;
	private String prenom;
	private int age;
	private String Sexe;
	
	public Personne(String nom, String prenom, int age, String Sexe) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.Sexe = Sexe;
	}
	
	public String getnom() {
		return this.nom;
	}
	
	public String getprenom() {
		return this.prenom;
	}
	
	public int getage() {
		return this.age;
	}
	
	public String getSexe() {
		return this.Sexe;
	}
	
	public void setnom(String nom) {
		this.nom = nom;
	}
	
	public void setprenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setage(int age) {
		this.age = age;
	}
	
	public void setSexe(String Sexe) {
		this.Sexe = Sexe;
	}
	
}
