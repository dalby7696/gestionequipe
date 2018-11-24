/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestionequipe.vue;

import com.gestionequipe.controleur.ServiceILocal;
import com.gestionequipe.controleur.ServiceImpl;
import com.gestionequipe.metier.Tache;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author yblad
 */
public class frmTache extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmTache
     */
   	public ServiceILocal se = new ServiceImpl();
	private Tache tache=new Tache();
	   List<Tache> listtache; 
           
	   Date dateDebut,dateFin;
            java.sql.Date sqldatedeb,sqldatefin;
            String datedeb, datefin;
    public frmTache() {
        initComponents();
    }
public void ClearTextField() 
	{
		txtId.setText("");
		txtNom.setText("");
		txtDescription.setText("");
                txtEtat.setText("");
	        DateChooserDebut.setCalendar(null);
	        DateChooserFin.setCalendar(null);
                
        }
public void ListerTacheTab()
{
      listtache=se.GetAllTache();
      DefaultTableModel model= (DefaultTableModel) tbTache.getModel();
    
       
	
    
			 
			 Object[]data=new Object[6] ;
			 for(int i=0;i<listtache.size();i++) 
			 {
				 data[0]=listtache.get(i).getTacheId();
				 data[1]=listtache.get(i).getTacheNom();
				 data[2]=listtache.get(i).getTacheDescription();
      
				 data[3]=listtache.get(i).getTacheDate_de_debut();
				 data[4]=listtache.get(i).getTacheDate_de_fin();
				 data[5]=listtache.get(i).getTacheEtat(); 
				 model.addRow(data);
				 //System.out.println(data);
			 }


}
public void ListerTache()
{
    

                         listtache=se.GetAllTache();
			 DefaultTableModel model= (DefaultTableModel) tbTache.getModel();
			 
			 Object[]data=new Object[6] ;
			 for(int i=0;i<listtache.size();i++) 
			 {
				// System.out.println(listtache.get(i).getTacheId()+"  "+listtache.get(i).getTacheNom());
				 data[0]=listtache.get(i).getTacheId();
				 data[1]=listtache.get(i).getTacheNom();
				 data[2]=listtache.get(i).getTacheDescription();
				 data[3]=listtache.get(i).getTacheDate_de_debut();
				 data[4]=listtache.get(i).getTacheDate_de_fin();
				 data[5]=listtache.get(i).getTacheEtat(); 
				 model.addRow(data);
				 //System.out.println(data);
			 }



}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTache = new javax.swing.JTable();
        btnAjouter = new javax.swing.JButton();
        btnRechercher = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        DateChooserDebut = new com.toedter.calendar.JDateChooser();
        DateChooserFin = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtEtat = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("NOM:");

        jLabel3.setText("DESCRIPTION:");

        txtDescription.setText(" ");

        jLabel4.setText("DATE DEBUT");

        jLabel5.setText("DATE FIN:");

        tbTache.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOM", "DESCRIPTION", "DATE DEBUT", "DATE FIN", "Etat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTache.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTacheMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTache);

        btnAjouter.setText("AJOUTER");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnRechercher.setText("RECHERCHER");
        btnRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercherActionPerformed(evt);
            }
        });

        btnModifier.setText("MODIFIER");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        jLabel6.setText("ETAT:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescription))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAjouter)
                        .addGap(74, 74, 74)
                        .addComponent(btnRechercher)
                        .addGap(84, 84, 84)
                        .addComponent(btnModifier)
                        .addGap(77, 77, 77)
                        .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 104, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateChooserDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateChooserFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtEtat, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(DateChooserFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtEtat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(DateChooserDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjouter)
                    .addComponent(btnRechercher)
                    .addComponent(btnModifier)
                    .addComponent(btnSupprimer))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        // TODO add your handling code here:
        dateDebut= DateChooserDebut.getDate();
        sqldatedeb= new java.sql.Date(dateDebut.getTime());
        datedeb =sqldatedeb.toString();
        ////////////////////date fin
        dateFin= DateChooserFin.getDate();
        sqldatefin= new java.sql.Date(dateFin.getTime());
        datefin =sqldatefin.toString();
        	                tache.setTacheId(new Integer(txtId.getText()));
				tache.setTacheNom(txtNom.getText());
				tache.setTacheDescription(txtDescription.getText());
				tache.setTacheDate_de_debut(datedeb);
				tache.setTacheDate_de_fin(datefin);
                                tache.setTacheEtat(txtEtat.getText());
				 
			String rep=se.UpdateTache(tache);	
			if(rep=="valider")
			{
			   JOptionPane.showMessageDialog(frmTache.this, "tache Modifie", "Information Message", 1);
                           refresh();
				ClearTextField();
			}
			else
			{
				JOptionPane.showMessageDialog(frmTache.this, "Modification echoue", "Information Message", 1);
				
			}
    }//GEN-LAST:event_btnModifierActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        ListerTache();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        
/*Prendre date in JDateChooser*/
	dateDebut= DateChooserDebut.getDate();
        sqldatedeb= new java.sql.Date(dateDebut.getTime());
        datedeb =sqldatedeb.toString();
        ////////////////////date fin
        dateFin= DateChooserFin.getDate();
        sqldatefin= new java.sql.Date(dateFin.getTime());
        datefin =sqldatefin.toString();
        
// TODO add your handling code here
         
				tache.setTacheId(new Integer(txtId.getText()));
				tache.setTacheNom(txtNom.getText());
				tache.setTacheDescription(txtDescription.getText());
				tache.setTacheDate_de_debut(datedeb);
				tache.setTacheDate_de_fin(datefin);
                                tache.setTacheEtat(txtEtat.getText());
				String rep=se.AddTache(tache);	
				if(rep=="valider")
				{
					 
                                        JOptionPane.showMessageDialog(frmTache.this, "Tache enregistrer", "Information Message", 1);
                                        refresh();
					ClearTextField();
				}
				else
				{
					JOptionPane.showMessageDialog(frmTache.this, "Enregistrement echoue", "Information Message", 1);
					
				}
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void btnRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercherActionPerformed
       tache= se.FindOneTache(new Integer(txtId.getText()));	
      //JDateChooser Debut
       datedeb=tache.getTacheDate_de_debut();
 SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");  
        try {  
        dateDebut=formatter.parse(datedeb);
         } catch (ParseException ex) {
        Logger.getLogger(frmTache.class.getName()).log(Level.SEVERE, null, ex);
   	 }
      sqldatedeb=new java.sql.Date(dateDebut.getTime());
	DateChooserDebut.setDate(sqldatedeb); 
        ///////////////////////////JDateChooser Fin///////////////////////////////////
              datefin=tache.getTacheDate_de_fin();
          try {  
        dateFin=formatter.parse(datefin);
         } catch (ParseException ex) {
        Logger.getLogger(frmTache.class.getName()).log(Level.SEVERE, null, ex);
   	 }
      sqldatefin=new java.sql.Date(dateFin.getTime());
	DateChooserFin.setDate(sqldatefin); 
	
// TODO add your handling code here:
                               		
			     
				txtNom.setText(tache.getTacheNom());
				txtDescription.setText(tache.getTacheDescription());
                                txtEtat.setText(tache.getTacheEtat());
                               
    }//GEN-LAST:event_btnRechercherActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        // TODO add your handling code here:
        	String rep=	se.DeleteTache(new Integer(txtId.getText()));
				if(rep=="valider")
				{
					JOptionPane.showMessageDialog(frmTache.this, "Tache supprime", "Information Message", 1);
                                        refresh();
					ClearTextField();
				}
				else
				{
					JOptionPane.showMessageDialog(frmTache.this, "Supression echoue", "Information Message", 1);
					
				}
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void tbTacheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTacheMouseClicked
        // TODO add your handling code here:
        	                int index =tbTache.getSelectedRow();
				TableModel model=tbTache.getModel();
				txtId.setText(model.getValueAt(index, 0).toString());
				txtNom.setText(model.getValueAt(index, 1).toString());
				txtDescription.setText(model.getValueAt(index, 2).toString());
          //JDateChooser Debut
       datedeb=model.getValueAt(index,3).toString() ;
      SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");  
        try {  
        dateDebut=formatter.parse(datedeb);
         } catch (ParseException ex) {
        Logger.getLogger(frmTache.class.getName()).log(Level.SEVERE, null, ex);
   	 }
      sqldatedeb=new java.sql.Date(dateDebut.getTime());
	DateChooserDebut.setDate(sqldatedeb);
	//JDateChooser Fin			 
       datefin=model.getValueAt(index,4).toString() ;
         try {  
        dateFin=formatter.parse(datefin);
         } catch (ParseException ex) {
        Logger.getLogger(frmTache.class.getName()).log(Level.SEVERE, null, ex);
   	 }
      sqldatefin=new java.sql.Date(dateFin.getTime());
	DateChooserFin.setDate(sqldatefin);
        txtEtat.setText(model.getValueAt(index, 5).toString());
				 
    }//GEN-LAST:event_tbTacheMouseClicked
public void refresh()
{  
   listtache=se.GetAllTache();
			 DefaultTableModel model= (DefaultTableModel) tbTache.getModel();
			 model.setRowCount(0);
			 Object[]data=new Object[6] ;
			 for(int i=0;i<listtache.size();i++) 
			 {
				 
				 data[0]=listtache.get(i).getTacheId();
				 data[1]=listtache.get(i).getTacheNom();
				 data[2]=listtache.get(i).getTacheDescription();
				 data[3]=listtache.get(i).getTacheDate_de_debut();
				 data[4]=listtache.get(i).getTacheDate_de_fin();
				 data[5]=listtache.get(i).getTacheEtat(); 
				 model.addRow(data);
                               
			 }   
                        
                         
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooserDebut;
    private com.toedter.calendar.JDateChooser DateChooserFin;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnRechercher;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTache;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtEtat;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
