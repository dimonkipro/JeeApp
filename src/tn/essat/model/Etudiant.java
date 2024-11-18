package tn.essat.model;

public class Etudiant {
	private int id ;
	private String nom;
	private Groupe gpe;
	public Etudiant(int id, String nom, Groupe gpe) {
		super();
		this.id = id;
		this.nom = nom;
		this.gpe = gpe;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Groupe getGpe() {
		return gpe;
	}
	public void setGpe(Groupe gpe) {
		this.gpe = gpe;
	}
	
	

}
