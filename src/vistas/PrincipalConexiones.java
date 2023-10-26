

package vistas;

import Conexion.ConexionPost;
import java.awt.Color;
import Conexion.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import vistas.loging;


/**
 *
 * @author ajane
 */
public class PrincipalConexiones extends javax.swing.JFrame {

    public String campo;
    public static  String dato;
    private Connection con1,con2;
    JTextField txt_user = new JTextField(20);
    ConexionPost conectarPost = new ConexionPost();
    ConexionSQL conectarSQL = new ConexionSQL();
  
    
    public PrincipalConexiones() throws SQLException {
        initComponents(); 
        this.setLocationRelativeTo(null);
    }
    public void setCampo(String campo){
        this.campo = campo;
        lblusuario.setText(campo);
        
    }
      public String obtenerValorDelCampo() {
        return txt_user.getText();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnsql = new javax.swing.JButton();
        btnpost = new javax.swing.JButton();
        conn2 = new javax.swing.JButton();
        conn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnsql.setBackground(new java.awt.Color(255, 0, 51));
        btnsql.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnsql.setText("Conectar a SQLServer");
        btnsql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsqlActionPerformed(evt);
            }
        });

        btnpost.setBackground(new java.awt.Color(255, 0, 51));
        btnpost.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnpost.setText("Conectar a PostgreSQL");
        btnpost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpostActionPerformed(evt);
            }
        });

        conn2.setBackground(new java.awt.Color(0, 51, 255));
        conn2.setForeground(new java.awt.Color(255, 255, 255));
        conn2.setText("Cerrar Conexion");
        conn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conn2ActionPerformed(evt);
            }
        });

        conn1.setBackground(new java.awt.Color(0, 51, 255));
        conn1.setForeground(new java.awt.Color(255, 255, 255));
        conn1.setText("Cerrar Conexion");
        conn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conn1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Eliga a que BD se quiere Conectar");

        jLabel2.setText("BIENVENIDO: ");

        lblusuario.setText("jLabel3");
        lblusuario.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblusuarioAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnpost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsql, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(conn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conn2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsql, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conn1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpost, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conn2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblusuario))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conn1ActionPerformed

        try {
            ConexionSQL.desconectar(con1);
            btnsql.setBackground(Color.red);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalConexiones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_conn1ActionPerformed

    private void conn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conn2ActionPerformed

        try {
            ConexionPost.desconectar(con2);
            btnpost.setBackground(Color.red);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalConexiones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_conn2ActionPerformed

    private void btnpostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpostActionPerformed

        try {
            con2 = conectarPost.getConnection();
            if(con2==null){
                btnsql.setBackground(Color.RED);

            }
            if(con2!=null){
                btnsql.setBackground(Color.GREEN);
                sucursales_crear f1 = new sucursales_crear();
                f1.setVisible(true);
                setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalConexiones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnpostActionPerformed

    private void btnsqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsqlActionPerformed

        try {
            con1 = ConexionSQL.conectar();
            if(con1==null){
                btnsql.setBackground(Color.RED);
            }
            if(con1!=null){
                btnsql.setBackground(Color.GREEN);
           
                PrincipalConexiones prc = new PrincipalConexiones();
               
                prc.setCampo(campo);
                
            
                
               try (Connection conn =  ConexionSQL.conectar()){
               String sql = "SELECT ROL FROM usuario WHERE LOGIN_NAME = ?";
                PreparedStatement stmt = conn.prepareStatement (sql);
         try {
            stmt.setString(1, campo);
        } catch (SQLException ex) {
            Logger.getLogger(loging.class.getName()).log(Level.SEVERE, null, ex);
        }
                
           ResultSet resultSet = stmt.executeQuery();   
           if (resultSet.next()) {
           String rol = resultSet.getString("ROL"); 
                System.out.println(rol);
           
           if(rol.equals("empleado")){
               prc.empleado(true);
           }else if (rol.equals("Administrador")){
               prc.Administrador(true);
           }
                
           
               
           }  
            }catch (SQLException ex) {
            Logger.getLogger(loging.class.getName()).log(Level.SEVERE, null, ex);
                   System.out.println(ex);
        }
               
                   
               }
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalConexiones.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnsqlActionPerformed

    private void lblusuarioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblusuarioAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblusuarioAncestorAdded

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
            java.util.logging.Logger.getLogger(PrincipalConexiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalConexiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalConexiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalConexiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PrincipalConexiones().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PrincipalConexiones.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpost;
    private javax.swing.JButton btnsql;
    private javax.swing.JButton conn1;
    private javax.swing.JButton conn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblusuario;
    // End of variables declaration//GEN-END:variables

public void Administrador(boolean activar) throws SQLException{

        principal pr = new principal();
        
        pr.habilitarMenu(true);
        pr.setVisible(true);
    
}

public void empleado(boolean desactivar) throws SQLException{
    principal pr = new principal();
    pr.habilitarMenu(false);
    pr.setVisible(true);
}

}
