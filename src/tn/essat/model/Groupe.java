package tn.essat.model;

public class Groupe {
	private int id;
	private String titre;
	
	public Groupe(int id, String titre) {
		super();
		this.id = id;
		this.titre = titre;
	}
	
	public Groupe() {
		super();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

}
