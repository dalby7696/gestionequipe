package com.gestionequipe.controleur;

import java.util.List;

import com.gestionequipe.metier.Membre;
import com.gestionequipe.metier.Memtac;
import com.gestionequipe.metier.Tache;

 

public interface ServiceILocal {
	public String AddMembre(Membre mb);
	public String UpdateMembre(Membre mb);
	public Membre FindOneMembre(int id);
	public List<Membre> GetAllMembre();
	public String DeleteMembre (int id);
	 
	public String Assigner_tache(Memtac mt);
        public List<Memtac> GetAllMembreTache();
	
	public String AddTache(Tache t);
	public String UpdateTache(Tache t);
	public Tache FindOneTache(int id);
	public List<Tache> GetAllTache();
	public String DeleteTache (int id);
}
