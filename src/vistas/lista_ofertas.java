/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import Controladores.AdjudicacionControlador;
import Controladores.PedidoControlador;
import Entidades.Adjudicacion;
import Entidades.Oferta;
import Entidades.Pedido;
import Entidades.UbiDepartamento;
import Metodos.Ofertas;
import Metodos.Pedidos;
import Metodos.Sucursales;
import Procesos_Almacenados.SPAdjudicacion;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ProcesosE
 */
public final class lista_ofertas extends javax.swing.JFrame {

    DefaultTableModel modelo;
    DefaultTableModel modeluky;
    
    /**
     * Creates new form lista_ofertas
     */
    public lista_ofertas() {
        initComponents();
       
        modelo = new DefaultTableModel();
        modelo.addColumn("ID PEDIDO");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("FECHA DE CREACION");
        modelo.addColumn("ESTADO DEL PEDIDO");
        
        this.TablaPedidos.setModel(modelo);
        
         MostrarPedidoEncabezado();
         
        modeluky = new DefaultTableModel();
        modeluky.addColumn("NOMBRE PROVEEDOR");
        modeluky.addColumn("FECHA CREACION");
        modeluky.addColumn("ESTADO");
        modeluky.addColumn("ID OFERTA");
        modeluky.addColumn("ID PROVEEDOR");
        modeluky.addColumn("ID PEDIDO");
        
        this.TablaOfertas.setModel(modeluky);
         
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPedidos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaOfertas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Combotipoadjudicacion = new javax.swing.JComboBox<>();
        Bt_adjudicar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        TablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaPedidos);

        TablaOfertas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaOfertas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaOfertasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaOfertas);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("TIPO DE ADJUDICACION");

        Combotipoadjudicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "COMPRA PEQUEÑA", "COMPRA GRANDE" }));

        Bt_adjudicar.setBackground(new java.awt.Color(51, 51, 255));
        Bt_adjudicar.setText("ADJUDICAR");
        Bt_adjudicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_adjudicarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("0fertas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        jPanel3.setBackground(new java.awt.Color(51, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Combotipoadjudicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(Bt_adjudicar)
                        .addGap(17, 17, 17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Combotipoadjudicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Bt_adjudicar))
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPedidosMouseClicked
        // TODO add your handling code here:
        
         int selectedRow = TablaPedidos.getSelectedRow();
                    if (selectedRow != -1) {
                        // Obtiene los datos de la fila seleccionada
                        int idPedido = (int) TablaPedidos.getValueAt(selectedRow, 0);
                        
//                        Pedido nuevoPedido = PedidoControlador.pedidoVista(idPedido, descripcion);
//                          Oferta nuevaOferta = 
                        actualizarTablaOfertas(idPedido);
                        // Muestra los datos en el JTextField
                        System.out.println("Columna 1: " + idPedido );
//                        textField.setText("Columna 1: " + data1 + ", Columna 2: " + data2);
                    }
        
        
    }//GEN-LAST:event_TablaPedidosMouseClicked

    private void Bt_adjudicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_adjudicarActionPerformed
        // TODO add your handling code here:
        
        String tipoAdjudicacion = (String) Combotipoadjudicacion.getSelectedItem();
        if (!tipoAdjudicacion.equals("Seleccionar")) {
        
        int selectedRow = TablaOfertas.getSelectedRow();
                    if (selectedRow != -1) {
                        // Obtiene los datos de la fila seleccionada
                        int idPedido = (int) TablaOfertas.getValueAt(selectedRow, 3);
                        
                        Adjudicacion nuevaAdjudicacion = AdjudicacionControlador.insertarAdjudicacion(idPedido, tipoAdjudicacion);
                        
                        SPAdjudicacion.agregarOfertaEncabezado(nuevaAdjudicacion);
//                        Pedido nuevoPedido = PedidoControlador.pedidoVista(idPedido, descripcion);
//                          Oferta nuevaOferta = 
//                        actualizarTablaOfertas(idPedido);
                        // Muestra los datos en el JTextField
                        System.out.println("Columna 1: " + idPedido );
//                        textField.setText("Columna 1: " + data1 + ", Columna 2: " + data2);
                    }
                    
        }
        
        
    }//GEN-LAST:event_Bt_adjudicarActionPerformed

    private void TablaOfertasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaOfertasMouseClicked
        // TODO add your handling code here:
        int selectedRow = TablaOfertas.getSelectedRow();
                    if (selectedRow != -1) {
                        // Obtiene los datos de la fila seleccionada
                        int idPedido = (int) TablaOfertas.getValueAt(selectedRow, 3);
                        
//                        Pedido nuevoPedido = PedidoControlador.pedidoVista(idPedido, descripcion);
//                          Oferta nuevaOferta = 
//                        actualizarTablaOfertas(idPedido);
                        // Muestra los datos en el JTextField
                        System.out.println("Columna 1: " + idPedido );
//                        textField.setText("Columna 1: " + data1 + ", Columna 2: " + data2);
                    }
        
        
    }//GEN-LAST:event_TablaOfertasMouseClicked

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
            java.util.logging.Logger.getLogger(lista_ofertas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lista_ofertas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lista_ofertas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lista_ofertas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lista_ofertas().setVisible(true);
            }
        });
    }
    
    public void MostrarPedidoEncabezado(){
        Pedidos ped = new Pedidos();
        
       ArrayList<Pedido> datosPedido  = ped.obtenerPedido();
//        ComboTipoProducto.addItem("Seleccionar");
        
        for (Pedido pedido : datosPedido) {
            Object[] fila = {
                
                    pedido.getID_PEDIDO(),
                    pedido.getDESCRIPCION(),
                    pedido.getFECHA_CREACION(),
                    pedido.getESTADO(),
                    
            };
            modelo.addRow(fila);
        }
    
    }
    
    public void actualizarTablaOfertas(int idPedidoEncabezado) {
//    ComboDepartamento.removeAllItems(); // Limpiar el combo antes de actualizar
    
    Ofertas of = new Ofertas();
    ArrayList<Oferta> datosOfertaEncabezado = of.obtenerOfertaEncabezado(idPedidoEncabezado);
    
    for (Oferta oferta : datosOfertaEncabezado) {
            Object[] fila = {
                
                
                    oferta.getNOMBRE_PROVEEDOR(),
                    oferta.getFECHA_CREACION(),
                    oferta.getESTADO(),
                    oferta.getID_OFERTA(),
                    oferta.getID_PROVEEDOR(),
                    oferta.getID_PEDIDO()
                    
            };
            modeluky.addRow(fila);
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_adjudicar;
    private javax.swing.JComboBox<String> Combotipoadjudicacion;
    private javax.swing.JTable TablaOfertas;
    private javax.swing.JTable TablaPedidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
