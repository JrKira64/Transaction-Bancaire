
public class Compte implements FunList{

	private int numCompte;
	private int code;
	private String nomCompte;
	private String TypeCompte;
	private double solde;
	
	public Compte(int numCompte, int code, String nomCompte, String TypeCompte, double solde) {
		this.nomCompte = nomCompte;
		this.numCompte = numCompte;
		this.TypeCompte = TypeCompte;
		this.code = code;
		this.solde = solde;
	}
	
	public String getnomCompte() {
		return this.nomCompte;
	}
	
	public String getTypeCompte() {
		return this.TypeCompte;
	}
	
	public int getnumCompte() {
		return this.numCompte;
	}
	
	public int getcode() {
		return this.code;
	}
	
	public double getsolde() {
		return this.solde;
	}
	
	public void setnomCompte(String nomCompte) {
		this.nomCompte = nomCompte;
	}
	
	public void setTypeCompte(String TypeCompte) {
		this.TypeCompte = TypeCompte;
	}
	
	public void setnumCompte(int numCompte) {
		this.numCompte = numCompte;
	}
	
	public void setcode(int code) {
		this.code = code;
	}
	
	public void setsolde(double solde) {
		this.solde = solde;
	}
	
	
	public double crediter(double somme) {
		return this.solde - somme;
	}
	
	public double debiter(double somme) {
		return this.solde + somme;
	}
	
	
}
