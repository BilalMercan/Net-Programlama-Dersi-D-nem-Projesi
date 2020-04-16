/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_gui;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author A
 */
public class SearchPerson extends javax.swing.JFrame {

    /**
     * Creates new form Personaldelete
     */
    public SearchPerson() {
        initComponents();
        
        tblModel = (DefaultTableModel) jTable1.getModel();
		KDB = new KisiDBisleri(connectionUrl, user, pass);
		tblModel.setColumnIdentifiers(TableColName);
        
    }
    
    private DefaultTableModel tblModel;
	private String connectionUrl = "jdbc:sqlserver://A:1433;databaseName=IKVT;";
	private String user="AVT", pass="9900";
	String TableColName[] = { "No", "Ad", "Soyad", "TC", "Adres", "Telefon", "Mail", "Bölüm", "Maaş", "Kayıt", "Görev" };	// tabloda sütun başlıkları
	private KisiDBisleri KDB; // = new KisiDBisleri(connectionUrl, user, pass);

	private boolean TablodanVeriAl()
	{
		boolean sonuc=false;
		if (tblModel.getRowCount() >= 0 ) {
			int rowIndex = jTable1.getSelectedRow();
			int colIndex = jTable1.getSelectedColumn();

			if (rowIndex>=0 && colIndex>=0)
			{
				Vector row = tblModel.getDataVector().elementAt(rowIndex);
				jtf_Kid.setText(row.elementAt(0).toString());
				jtf_Adi.setText(row.elementAt(1).toString());
                                jtf_Soyad.setText(row.elementAt(2).toString());
                                jtf_Adres.setText(row.elementAt(3).toString());
                                jtf_TC.setText(row.elementAt(4).toString());
                                jtf_Tel.setText(row.elementAt(5).toString());
                                jtf_Mail.setText(row.elementAt(6).toString());
                                jtf_Bolum.setText(row.elementAt(7).toString());
                                jtf_Maas.setText(row.elementAt(8).toString());
                                jtf_Kayit.setText(row.elementAt(9).toString());
                                jtf_Gorev.setText(row.elementAt(10).toString());
                                
			}
			else
				JOptionPane.showMessageDialog(this,	"Tabloda secim yapilmadi!");
				//	tblModel.getDataVector().elementAt(rowIndex).elementAt(colIndex));	
		}		
		return sonuc;
	}

	private int KayitlariTabloyaYaz()
	{
		int say = 0;
		// clear table rows
		while (tblModel.getRowCount()>0)
			tblModel.removeRow(0);

		ArrayList<Kisi> Kisiler = KDB.KisiListesi(); //new ArrayList<>();
		
		for (Kisi k: Kisiler) {
			String data[] = {String.valueOf(k.getId()), k.getAdi(), k.getSoyad(), k.getAdres(), k.getTC(), k.getTel(), k.getMail(), k.getBolum(), k.getMaas(), k.getKayit(), k.getGorev()};
			tblModel.addRow(data);
			say++;
		}
		
        // Handle any errors that may have occurred.
		return say;
	}  

 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Personaldelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personaldelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personaldelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personaldelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                  new SearchPerson().setVisible(true);
                }
        });
    }
    
    // Variables declaration - do not modify                     


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author A
 */


    /**
     * Creates new form SearchPerson
     */
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtf_Kid = new javax.swing.JTextField();
        jtf_Adi = new javax.swing.JTextField();
        jtf_Tel = new javax.swing.JTextField();
        jtf_Bolum = new javax.swing.JTextField();
        jtf_Gorev = new javax.swing.JTextField();
        jtf_Mail = new javax.swing.JTextField();
        jtf_Soyad = new javax.swing.JTextField();
        jtf_Adres = new javax.swing.JTextField();
        jtf_Maas = new javax.swing.JTextField();
        jtf_Kayit = new javax.swing.JTextField();
        jtf_TC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtf2_listele = new javax.swing.JButton();
        searchtext = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtf_Kid.setEditable(false);
        jtf_Kid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_KidActionPerformed(evt);
            }
        });

        jtf_Bolum.setText("                                ");
        jtf_Bolum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_BolumActionPerformed(evt);
            }
        });

        jtf_Gorev.setText("                          ");

        jtf_Mail.setText("                                      ");

        jtf_Soyad.setText("                       ");

        jtf_Adres.setText("                    ");
        jtf_Adres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_AdresActionPerformed(evt);
            }
        });

        jtf_Maas.setText("                               ");
        jtf_Maas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_MaasActionPerformed(evt);
            }
        });

        jtf_TC.setText("                      ");
        jtf_TC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_TCActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Ad", "Soyad", "Tc", "Adres", "Telefon", "Mail", "Bölüm", "Maaş", "Kayıt", "Görev"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jtf2_listele.setText("Personel Listesi");
        jtf2_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf2_listeleActionPerformed(evt);
            }
        });

        searchtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtextActionPerformed(evt);
            }
        });
        searchtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchtextKeyPressed(evt);
            }
        });

        jButton1.setText("Geri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Çıkış");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtf_Maas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtf_Bolum, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(jtf_Gorev, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jtf_Kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_Adi, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtf_Soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jtf_Adres, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jtf_TC, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jtf2_listele)
                                .addGap(46, 46, 46))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtf_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtf_Kid, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(324, 324, 324)
                        .addComponent(searchtext, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_Kid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchtext, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_Soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_Adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_Adres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_TC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jtf2_listele))
                                .addGap(40, 40, 40)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_Maas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(14, 14, 14)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_Kayit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_Gorev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_Bolum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_KidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_KidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_KidActionPerformed

    private void jtf_BolumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_BolumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_BolumActionPerformed

    private void jtf_AdresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_AdresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_AdresActionPerformed

    private void jtf_MaasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_MaasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_MaasActionPerformed

    private void jtf_TCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_TCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_TCActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        TablodanVeriAl();
        jTable1.clearSelection();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jtf2_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf2_listeleActionPerformed
        KayitlariTabloyaYaz();
    }//GEN-LAST:event_jtf2_listeleActionPerformed

    private void searchtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtextKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtextKeyPressed

    private void searchtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtextActionPerformed
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         TableRowSorter<DefaultTableModel>tr = new TableRowSorter<DefaultTableModel>(model);
         jTable1.setRowSorter(tr);
         tr.setRowFilter(RowFilter.regexFilter(searchtext.getText().trim()));

    }//GEN-LAST:event_searchtextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Personaldelete frame = new Personaldelete();
         frame.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jtf2_listele;
    private javax.swing.JTextField jtf_Adi;
    private javax.swing.JTextField jtf_Adres;
    private javax.swing.JTextField jtf_Bolum;
    private javax.swing.JTextField jtf_Gorev;
    private javax.swing.JTextField jtf_Kayit;
    private javax.swing.JTextField jtf_Kid;
    private javax.swing.JTextField jtf_Maas;
    private javax.swing.JTextField jtf_Mail;
    private javax.swing.JTextField jtf_Soyad;
    private javax.swing.JTextField jtf_TC;
    private javax.swing.JTextField jtf_Tel;
    private javax.swing.JTextField searchtext;
    // End of variables declaration//GEN-END:variables
}
