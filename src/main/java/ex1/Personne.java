package ex1;

public class Personne { 
	private String nom;
	private String prenom;
	public Personne(String nom,String prenom){
		this.nom=nom;
		this.prenom=prenom;
	}
	
	public void sePresenter(){
		System.out.println("Bonjour, je m'appelle "+prenom+" "+nom);
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public void setNom(String nom){
		this.nom=nom;
	}
	
	public String getPrenom(){
		return this.prenom;
	}

	public void setPrenom(String prenom){
		this.prenom=prenom;
	}	
}