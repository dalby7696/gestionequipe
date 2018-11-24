package com.gestionequipe.metier;

public class Membre {
	
	
	private int MembreId;
	private String MembreNom;
	private String MembrePrenom;
	private String MembreAdress;
	private String MembreTel;
	private String MembreEmail;
	
	public Membre(int membreId, String membreNom, String membrePrenom, String membreAdress, String membreTel,
			String membreEmail) {
		super();
		MembreId = membreId;
		MembreNom = membreNom;
		MembrePrenom = membrePrenom;
		MembreAdress = membreAdress;
		MembreTel = membreTel;
		MembreEmail = membreEmail;
	}

	public Membre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMembreId() {
		return MembreId;
	}

	public void setMembreId(int membreId) {
		MembreId = membreId;
	}

	public String getMembreNom() {
		return MembreNom;
	}

	public void setMembreNom(String membreNom) {
		MembreNom = membreNom;
	}

	public String getMembrePrenom() {
		return MembrePrenom;
	}

	public void setMembrePrenom(String membrePrenom) {
		MembrePrenom = membrePrenom;
	}

	public String getMembreAdress() {
		return MembreAdress;
	}

	public void setMembreAdress(String membreAdress) {
		MembreAdress = membreAdress;
	}

	public String getMembreTel() {
		return MembreTel;
	}

	public void setMembreTel(String membreTel) {
		MembreTel = membreTel;
	}

	public String getMembreEmail() {
		return MembreEmail;
	}

	public void setMembreEmail(String membreEmail) {
		MembreEmail = membreEmail;
	}
	
	
	 

}
