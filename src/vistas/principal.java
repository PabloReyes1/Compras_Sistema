
package vistas;


import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import javax.swing.JOptionPane;


/**
 *
 * @author 50258
 */
public class principal extends javax.swing.JFrame {
   
    public JMenu getmen_emp;
    public JMenu getmen_sucursales;
    public JMenu setmen_dep;
    public JMenu getmen_ordenes;
    public JMenu getmen_compras;
  
    public loging getroldeusuario;
    public String Campo;
    
    /**
     * Creates new form principal
     */
    public principal() throws SQLException {
        initComponents();
         this.setLocationRelativeTo(null);
         
        
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Menuprincipal = new javax.swing.JMenuBar();
        men_emp = new javax.swing.JMenu();
        men_sucursales = new javax.swing.JMenu();
        men_dep = new javax.swing.JMenu();
        men_ordenes = new javax.swing.JMenu();
        men_compras = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.blue));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 948, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 1078, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        men_emp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 102, 204)));
        men_emp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleadosgen.png"))); // NOI18N
        men_emp.setText("EMPLEADOS");
        men_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_empActionPerformed(evt);
            }
        });
        Menuprincipal.add(men_emp);

        men_sucursales.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 102, 204)));
        men_sucursales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sucursalesgen.png"))); // NOI18N
        men_sucursales.setText("SUCURSALES");
        Menuprincipal.add(men_sucursales);

        men_dep.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 102, 255)));
        men_dep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/departamentos.png"))); // NOI18N
        men_dep.setText("DEPARTAMENTOS");
        men_dep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_depActionPerformed(evt);
            }
        });
        Menuprincipal.add(men_dep);

        men_ordenes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 102, 255)));
        men_ordenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ordenes.png"))); // NOI18N
        men_ordenes.setText("ORDENES");
        men_ordenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_ordenesActionPerformed(evt);
            }
        });
        Menuprincipal.add(men_ordenes);

        men_compras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 102, 255)));
        men_compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compras.png"))); // NOI18N
        men_compras.setText("COMPRAS");
        men_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_comprasActionPerformed(evt);
            }
        });
        Menuprincipal.add(men_compras);

        setJMenuBar(Menuprincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void men_depActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_depActionPerformed

        
        
    }//GEN-LAST:event_men_depActionPerformed

    private void men_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_empActionPerformed
   
     
        
    }//GEN-LAST:event_men_empActionPerformed

    private void men_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_comprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_men_comprasActionPerformed

    private void men_ordenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_ordenesActionPerformed
        
        
        
    }//GEN-LAST:event_men_ordenesActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new principal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menuprincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu men_compras;
    private javax.swing.JMenu men_dep;
    private javax.swing.JMenu men_emp;
    private javax.swing.JMenu men_ordenes;
    private javax.swing.JMenu men_sucursales;
    // End of variables declaration//GEN-END:variables

   
    
    
    /**
     * @return the Menuprincipal
     */
    public javax.swing.JMenuBar getMenuprincipal() {
        return Menuprincipal;
    }

    /**
     * @param Menuprincipal the Menuprincipal to set
     */
    public void setMenuprincipal(javax.swing.JMenuBar Menuprincipal) {
        this.Menuprincipal = Menuprincipal;
    }

    /**
     * @return the jDateChooser1
     */


    /**
     * @return the jPanel1
     */
    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * @param jPanel1 the jPanel1 to set
     */
    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    /**
     * @return the jPanel2
     */
    public javax.swing.JPanel getjPanel2() {
        return jPanel2;
    }

    /**
     * @param jPanel2 the jPanel2 to set
     */
    public void setjPanel2(javax.swing.JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    /**
     * @return the men_compras
     */
    public javax.swing.JMenu getMen_compras() {
        return men_compras;
    }

    /**
     * @param men_compras the men_compras to set
     */
    public void setMen_compras(javax.swing.JMenu men_compras) {
        this.men_compras = men_compras;
    }

    /**
     * @return the men_dep
     */
    public javax.swing.JMenu getMen_dep() {
        return men_dep;
    }

    /**
     * @param men_dep the men_dep to set
     */
    public void setMen_dep(javax.swing.JMenu men_dep) {
        this.men_dep = men_dep;
    }

    /**
     * @return the men_emp
     */
    public javax.swing.JMenu getMen_emp() {
        return men_emp;
    }

    /**
     * @param men_emp the men_emp to set
     */
    public void setMen_emp(javax.swing.JMenu men_emp) {
        this.men_emp = men_emp;
    }

    /**
     * @return the men_ordenes
     */
    public javax.swing.JMenu getMen_ordenes() {
        return men_ordenes;
    }

    /**
     * @param men_ordenes the men_ordenes to set
     */
    public void setMen_ordenes(javax.swing.JMenu men_ordenes) {
        this.men_ordenes = men_ordenes;
    }

    /**
     * @return the men_sucursales
     */
    public javax.swing.JMenu getMen_sucursales() {
        return men_sucursales;
    }

    /**
     * @param men_sucursales the men_sucursales to set
     */
    public void setMen_sucursales(javax.swing.JMenu men_sucursales) {
        this.men_sucursales = men_sucursales;
    }


       public void habilitarMenu(boolean habilitar) {
         men_emp.setEnabled(habilitar);
      men_sucursales.setEnabled(habilitar);
      men_dep.setEnabled(habilitar);
      men_compras.setEnabled(habilitar);
    }
}
