package com.gestionequipe.metier;

public class Tache {
	
	private int TacheId;
	private String TacheNom;
	private String TacheDescription;
	private String TacheDate_de_debut;
	private String TacheDate_de_fin;
	private String TacheEtat;
	public Tache() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tache(int tacheId, String tacheNom, String tacheDescription, String tacheDate_de_debut,
			String tacheDate_de_fin, String tacheEtat) {
		super();
		TacheId = tacheId;
		TacheNom = tacheNom;
		TacheDescription = tacheDescription;
		TacheDate_de_debut = tacheDate_de_debut;
		TacheDate_de_fin = tacheDate_de_fin;
		TacheEtat = tacheEtat;
	}
	public int getTacheId() {
		return TacheId;
	}
	public void setTacheId(int tacheId) {
		TacheId = tacheId;
	}
	public String getTacheNom() {
		return TacheNom;
	}
	public void setTacheNom(String tacheNom) {
		TacheNom = tacheNom;
	}
	public String getTacheDescription() {
		return TacheDescription;
	}
	public void setTacheDescription(String tacheDescription) {
		TacheDescription = tacheDescription;
	}
	public String getTacheDate_de_debut() {
		return TacheDate_de_debut;
	}
	public void setTacheDate_de_debut(String tacheDate_de_debut) {
		TacheDate_de_debut = tacheDate_de_debut;
	}
	public String getTacheDate_de_fin() {
		return TacheDate_de_fin;
	}
	public void setTacheDate_de_fin(String tacheDate_de_fin) {
		TacheDate_de_fin = tacheDate_de_fin;
	}
	public String getTacheEtat() {
		return TacheEtat;
	}
	public void setTacheEtat(String tacheEtat) {
		TacheEtat = tacheEtat;
	}
	
	
	

}
