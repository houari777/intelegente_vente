/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import intelegente_vente.ImagenBanner;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import net.proteanit.sql.DbUtils;

/**
 *
 * @author AlexJPZ
 */
public class Portail extends javax.swing.JFrame {

  
    
    ImagenBanner p = new ImagenBanner();

    /**
     * Creates new form Sistema
     */
    public Portail() {
  
  
 initComponents();
 this.pack();
        this.setDefaultLookAndFeelDecorated(true);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        Component add = PanelBanner.add(p);
produit1();  
//client();



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        PanelBanner = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        Button_Compras = new javax.swing.JButton();
        Button_Cat_Dpt = new javax.swing.JButton();
        Button_Cliente = new javax.swing.JButton();
        Button_Ventas = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Button_Poductos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("???????? ???????????? ??????????");

        PanelBanner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelBannerLayout = new javax.swing.GroupLayout(PanelBanner);
        PanelBanner.setLayout(PanelBannerLayout);
        PanelBannerLayout.setHorizontalGroup(
            PanelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1377, Short.MAX_VALUE)
        );
        PanelBannerLayout.setVerticalGroup(
            PanelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Process-Accept.png"))); // NOI18N
        jButton6.setText("?????????????? ????????????");
        jButton6.setToolTipText("");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        Button_Compras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button_Compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Carrito-de-compras.png"))); // NOI18N
        Button_Compras.setText("????????????");
        Button_Compras.setToolTipText("");
        Button_Compras.setBorder(null);
        Button_Compras.setBorderPainted(false);
        Button_Compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ComprasActionPerformed(evt);
            }
        });

        Button_Cat_Dpt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button_Cat_Dpt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Etiqueta.png"))); // NOI18N
        Button_Cat_Dpt.setText("??????????????");
        Button_Cat_Dpt.setToolTipText("");
        Button_Cat_Dpt.setBorder(null);
        Button_Cat_Dpt.setBorderPainted(false);
        Button_Cat_Dpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Cat_DptActionPerformed(evt);
            }
        });

        Button_Cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Clientes.png"))); // NOI18N
        Button_Cliente.setText("??????????????");
        Button_Cliente.setToolTipText("");
        Button_Cliente.setBorder(null);
        Button_Cliente.setBorderPainted(false);
        Button_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ClienteActionPerformed(evt);
            }
        });

        Button_Ventas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button_Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/compras.png"))); // NOI18N
        Button_Ventas.setText("??????????");
        Button_Ventas.setToolTipText("");
        Button_Ventas.setBorder(null);
        Button_Ventas.setBorderPainted(false);
        Button_Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_VentasActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(55, 65, 158));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        Button_Poductos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button_Poductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ordering.png"))); // NOI18N
        Button_Poductos.setText("??????????");
        Button_Poductos.setToolTipText("");
        Button_Poductos.setBorder(null);
        Button_Poductos.setBorderPainted(false);
        Button_Poductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PoductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(Button_Cat_Dpt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Button_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Button_Poductos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Button_Compras, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Compras, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Cat_Dpt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Poductos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_VentasActionPerformed
      
    }//GEN-LAST:event_Button_VentasActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Button_ComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ComprasActionPerformed
       
    }//GEN-LAST:event_Button_ComprasActionPerformed

    private void Button_PoductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PoductosActionPerformed
      
        
    }//GEN-LAST:event_Button_PoductosActionPerformed

    private void Button_Cat_DptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Cat_DptActionPerformed
    
    }//GEN-LAST:event_Button_Cat_DptActionPerformed

    private void Button_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ClienteActionPerformed
        
        
     // client();
    }//GEN-LAST:event_Button_ClienteActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked

        produit2();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

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
                /*  if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
                UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Portail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Portail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Portail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Portail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Portail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Cat_Dpt;
    private javax.swing.JButton Button_Cliente;
    private javax.swing.JButton Button_Compras;
    private javax.swing.JButton Button_Poductos;
    private javax.swing.JButton Button_Ventas;
    private javax.swing.JPanel PanelBanner;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton6;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
double somme=0.00;
         double subtot=0.00;
 void produit1(){
      Connection conn = null;

        try {
           
            

            String sql = "   SELECT QTE_IN_STOCK AS '???????? ??????????????',PRICE AS '?????? ?????????????? ' ,LABEL_PRODUIT AS '?????? ?????????????? ',ID_PRODUIT AS '?????? ??????????????'  FROM PRODUIT";
            String url = "jdbc:sqlite:Produit_DB.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            
            PreparedStatement stmt = conn.prepareStatement(sql);
            //Bind values into the parameters.
            ResultSet rs = stmt.executeQuery();

          
            //Table_Compras.setModel(DbUtils.resultSetToTableModel(rs));
            //Table_BodegaPDT.setModel(DbUtils.resultSetToTableModel(rs));
            stmt.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {

                if (conn != null) {
                    conn.close();

                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        }
 }
 void produit2(){
      Connection conn1 = null;               
try{
            String sql1 = "   SELECT QTE_IN_STOCK AS '???????? ??????????????',PRICE AS '?????? ?????????????? ' ,LABEL_PRODUIT AS '?????? ?????????????? ',ID_PRODUIT AS '?????? ??????????????'  FROM PRODUIT";
            String url1 = "jdbc:sqlite:Produit_DB.db";
            // create a connection to the database
            conn1 = DriverManager.getConnection(url1);

            
            PreparedStatement stmt1 = conn1.prepareStatement(sql1);
            //Bind values into the parameters.
            ResultSet rs1 = stmt1.executeQuery();

            //Table_Produit1.setModel(DbUtils.resultSetToTableModel(rs));
            //Table_Compras.setModel(DbUtils.resultSetToTableModel(rs));
          
            stmt1.close();
            rs1.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {

                if (conn1 != null) {
                    conn1.close();

                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

      }
 }
  void client(){
      Connection conn2 = null;               
try{
            String sql2 = "   SELECT TEL AS '?????? ????????????',PRENOM AS '?????? ?????????????? ' ,NOM AS '?????? ?????????????? ',ID_CLIENT AS '?????? ??????????????'  FROM CLIENT";
            String url2 = "jdbc:sqlite:Produit_DB.db";
            // create a connection to the database
            conn2 = DriverManager.getConnection(url2);

            
            PreparedStatement stmt2 = conn2.prepareStatement(sql2);
            //Bind values into the parameters.
            ResultSet rs2 = stmt2.executeQuery();

            
            stmt2.close();
            rs2.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {

                if (conn2 != null) {
                    conn2.close();

                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

      }

 }       
}
