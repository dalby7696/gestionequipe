package com.gestionequipe.controleur;

 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestionequipe.dao.Mysqlconnect;
import com.gestionequipe.metier.Membre;
import com.gestionequipe.metier.Memtac;
import com.gestionequipe.metier.Tache;

public class ServiceImpl implements ServiceILocal{

	public static Connection conn= Mysqlconnect.ConnectDB();
//		Ajouter un membre
	    public static java.sql.Statement st;
	@Override
	public String AddMembre(Membre mb) {
		 //Requete d'insertion
		String req = "insert into tb_membre values('"+mb.getMembreId()+"','"+mb.getMembreNom()+"','"+mb.getMembrePrenom()+"','"+mb.getMembreAdress()+"','"+mb.getMembreTel()+"','"+mb.getMembreEmail()+"')";  
		  
	  	  int verif = 0;
	  	   String rep="";
	  	       try {
	  	          st=conn.createStatement();
	  	           verif=st.executeUpdate(req);
	  	           if(verif!=0)
	  	           {
	  	           rep="valider";
	  	           }
		} catch (SQLException e) {
			rep="Erreur de " +e.getMessage();
			// TODO: handle exception
			 
		}
	  	       return rep;
     
	}

	@Override
	public String UpdateMembre(Membre mb) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
					String req="Update tb_membre set membreNom='"+mb.getMembreNom()+"',membrePrenom='"+mb.getMembrePrenom()+"',membreAdress='"+mb.getMembreAdress()+"',membreTel='"+mb.getMembreTel()+"',membreEmail='"+mb.getMembreEmail()+"' where membreID='"+mb.getMembreId()+"'";
				        int testeur = 0;
				        String  repons="";
				        try
				        {  
				        st=conn.createStatement();
				        testeur = st.executeUpdate(req);
				        repons="valider";
				        }  
				        catch(SQLException e)
				        {
				        repons="Erreur de:"+e.getMessage(); 
				        System.err.println("Erreur de! "+e.getMessage());
				        }
				        return repons;
	}

	@Override
	public Membre FindOneMembre(int id) {
		// TODO Auto-generated method stub
		Membre memb=new Membre();;
		String repons="";
		 try {
	            ResultSet rs;
	            st=conn.createStatement();
	            rs = st.executeQuery("select * from tb_membre where membreID='"+id+"'");
	            if(rs.next()) {
	            	
	                memb.setMembreId(rs.getInt("membreID"));
	                memb.setMembreNom(rs.getString("membreNom"));
	                memb.setMembrePrenom(rs.getString("membrePrenom"));
	                memb.setMembreAdress(rs.getString("membreAdress"));
	                memb.setMembreTel(rs.getString("membreTel"));
	                memb.setMembreEmail(rs.getString("membreEmail"));
	                /*memb=new Membre(rs.getInt("membreID"), rs.getString("membreNom"), rs.getString("membrePrenom"),
	                		rs.getString("membreAdress"), rs.getString("membreTel"), rs.getString("membreEmail"));*/
	                repons="valider";
	               
	            }
	        } catch (Exception e) {
	        	System.err.println("Erreur de! "+e.getMessage());
	        }
		 
		 return memb;
	}

	@Override
	public List<Membre> GetAllMembre() {
		// TODO Auto-generated method stub
		List<Membre> listm=new ArrayList<>();
		 Membre memb;
		 try {
	            ResultSet rs;
	            st=conn.createStatement();
	            rs = st.executeQuery("select * from tb_membre");
	            while (rs.next() ) {
	             	 /*           	
	                memb.setMembreId(rs.getInt("membreID"));
	                memb.setMembreNom(rs.getString("membreNom"));
	                memb.setMembrePrenom(rs.getString("membrePrenom"));
	                memb.setMembreTel(rs.getString("membreTel"));
	                memb.setMembreEmail(rs.getString("membreEmail"));*/
	                memb=new Membre(rs.getInt("membreID"), rs.getString("membreNom"), rs.getString("membrePrenom"),
	                		rs.getString("membreAdress"), rs.getString("membreTel"), rs.getString("membreEmail"));
	                
	                listm.add(memb);
	            }
	        } catch (Exception e) {
	            System.err.println("Erreur de! "+e.getMessage());
	        }
		 
		 return listm;
	}
	@Override
	public String DeleteMembre (int id) 
	{
		String rep="";
		try {
		String req ="delete from tb_membre where membreID='"+id+"'";
		st=conn.createStatement();
        st.executeUpdate(req);
        
        rep="valider";
        } catch (Exception e) {
        	System.err.println("Erreur de! "+e.getMessage());
        }
		return rep;
	}

	@Override
	public String AddTache(Tache t) {
		// TODO Auto-generated method stub
		String req = "insert into tb_tache values('"+t.getTacheId()+"','"+t.getTacheNom()+"','"+t.getTacheDescription()+"','"+t.getTacheDate_de_debut()+"','"+t.getTacheDate_de_fin()+"','"+t.getTacheEtat()+"')";  
		
	  	  int verif = 0;
	  	   String rep="";
	  	       try {
	  	          st=conn.createStatement();
	  	           verif=st.executeUpdate(req);
	  	           if(verif!=0)
	  	           {
	  	           rep="valider";
	  	           }
		} catch (SQLException e) {
			rep="Erreur de " +e.getMessage();
			// TODO: handle exception
			 
		}
	  	       return rep;
	}

	@Override
	public String UpdateTache(Tache t) {
		// TODO Auto-generated method stub
		String req="Update tb_tache set tacheNom='"+t.getTacheNom()+"',tacheDescription='"+t.getTacheDescription()+"',tacheDate_de_debut='"+t.getTacheDate_de_debut()+"',tacheDate_de_fin='"+t.getTacheDate_de_fin()+"',tacheEtat='"+t.getTacheEtat()+"' where tacheID='"+t.getTacheId()+"'";
        int verifieM = 0;
        String  repons="";
        try
        {  
        st=conn.createStatement();
        verifieM = st.executeUpdate(req);
        repons="valider";
        }  
        catch(SQLException e)
        {
        repons="Erreur de:"+e.getMessage(); 
        System.err.println("Erreur de! "+e.getMessage());
        }
        return repons;
	}

	@Override
	public Tache FindOneTache(int id) {
		// TODO Auto-generated method stub
		Tache tach=new Tache();
		 String  repons="";
		 try {
	            ResultSet rs;
	            st=conn.createStatement();
	            rs = st.executeQuery("select * from tb_tache where tacheID='"+id+"'");
	            if(rs.next()) {
	            	
	                tach.setTacheId(rs.getInt("tacheID"));
	                tach.setTacheNom(rs.getString("tacheNom"));
	                tach.setTacheDescription(rs.getString("tacheDescription"));
	                tach.setTacheDate_de_debut(rs.getString("tacheDate_de_debut"));
	                tach.setTacheDate_de_fin(rs.getString("tacheDate_de_fin"));
	                tach.setTacheEtat(rs.getString("tacheEtat"));
	               repons="valider";
	            }
	            
	        } catch (Exception e) {
	        	System.err.println("Erreur de! "+e.getMessage());
	        }
		 
		 return tach;
	}

	@Override
	public List<Tache> GetAllTache() {
		// TODO Auto-generated method stub
		 List<Tache> listtach=new ArrayList<>();
		 Tache tach;
		 try {
	            ResultSet rs;
	            st=conn.createStatement();
	            rs = st.executeQuery("select * from tb_tache");
	            while (rs.next()) {
	            //	System.out.println(rs.getInt("idtache")+" -  "+rs.getString("tachenom")+" - "+rs.getString("tachedescription"));
	            	
	            	/*tach.setTacheId(rs.getInt("tacheID"));
	                tach.setTacheNom(rs.getString("tacheNom"));
	                tach.setTacheDescription(rs.getString("tacheDescription"));
	                tach.setTacheDate_de_debut(rs.getString("tacheDate_de_debut"));
	                tach.setTacheDate_de_fin(rs.getString("tacheDate_de_fin"));
	                tach.setTacheEtat(rs.getString("tacheEtat"));*/
	                tach=new Tache(rs.getInt("tacheID"),rs.getString("tacheNom"), rs.getString("tacheDescription"), 
	                		rs.getString("tacheDate_de_debut"), rs.getString("tacheDate_de_fin"), rs.getString("tacheEtat"));
	                listtach.add(tach);
	                for(int i=0;i<listtach.size();i++) 
	                	{
	                	//System.out.println(listtach.get(i).getTacheId());
	                		}
	   			 
	            }
	        } catch (Exception e) {
	            System.err.println("Erreur de! "+e.getMessage());
	        }
		 
		 return listtach;
	}
	

	@Override
	public String DeleteTache(int id) {
		// TODO Auto-generated method stub
		String rep="";
		try {
		String req ="delete from tb_tache where tacheID='"+id+"'";
		st=conn.createStatement();
        st.executeUpdate(req);
        rep="valider";
        } catch (Exception e) {
        	System.err.println("Erreur de! "+e.getMessage());
        }
		return rep;
	}
	@Override
	public String Assigner_tache(Memtac mt) {
		// TODO Auto-generated method stub
	String req = "insert into tb_assigner_Tache (membreID,tacheID)values('"+mt.getMembreID()+"','"+mt.getTacheID()+"')";  
		System.out.println(mt.getMembreID()+" -  "+mt.getTacheID());
    	
		 
	  	  int verif = 0;
	  	   String rep="";
	  	       try {
	  	          st=conn.createStatement();
	  	           verif=st.executeUpdate(req);
	  	           if(verif!=0)
	  	           {
	  	           rep="valider";
	  	           }
		} catch (SQLException e) {
			rep="Erreur de " +e.getMessage();
			System.out.println(e.getMessage());
			// TODO: handle exception
			 
		}
	  	       return rep;
	}

    @Override
    public List<Memtac> GetAllMembreTache() {
         List<Memtac> listmemtac=new ArrayList<>();
		 Memtac memtac;
		 try {
	            ResultSet rs;
	            st=conn.createStatement();
	            rs = st.executeQuery("select * from tb_memtac");
	            while (rs.next()) {
	            //	System.out.println(rs.getInt("idtache")+" -  "+rs.getString("tachenom")+" - "+rs.getString("tachedescription"));
	            	
	            	/*tach.setTacheId(rs.getInt("tacheID"));
	                tach.setTacheNom(rs.getString("tacheNom"));
	                tach.setTacheDescription(rs.getString("tacheDescription"));
	                tach.setTacheDate_de_debut(rs.getString("tacheDate_de_debut"));
	                tach.setTacheDate_de_fin(rs.getString("tacheDate_de_fin"));
	                tach.setTacheEtat(rs.getString("tacheEtat"));*/
	                memtac=new Memtac(rs.getInt("tacheID"),rs.getInt("membreID"),rs.getInt("memtacID"));
	                listmemtac.add(memtac);
	                for(int i=0;i<listmemtac.size();i++) 
	                	{
	                	//System.out.println(listmemtac.get(i).getTacheID());
	                		}
	   			 
	            }
	        } catch (Exception e) {
	            System.err.println("Erreur de! "+e.getMessage());
	        }
		 
		 return listmemtac;
    }

 
}
