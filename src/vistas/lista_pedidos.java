/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import Controladores.PedidoControlador;
import Entidades.Pedido;
import Entidades.TipoProducto;
import Metodos.Pedidos;
import Metodos.TipoProductos;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ProcesosE
 */
public final class lista_pedidos extends javax.swing.JFrame {

    DefaultTableModel modelo;
    
    private int idPedido;
    private String descripcion;
    
    /**
     * Creates new form lista_pedidos
     */
    public lista_pedidos() {
        initComponents();
        
       
        
        modelo = new DefaultTableModel();
        modelo.addColumn("ID PEDIDO");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("FECHA DE CREACION");
        modelo.addColumn("ESTADO DEL PEDIDO");
        
        this.TablaPedidos.setModel(modelo);
        
         MostrarPedidoEncabezado();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BT_OFERTAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPedidos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BT_OFERTAR.setText("OFERTAR");
        BT_OFERTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_OFERTARActionPerformed(evt);
            }
        });

        jLabel1.setText("TIPO DE PRODUCTO");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("ESTADO");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
        TablaPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPedidosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaPedidos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BT_OFERTAR)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(52, 52, 52)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(BT_OFERTAR)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_OFERTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_OFERTARActionPerformed
      
        
        ofertas f1 = new ofertas(idPedido, descripcion);
                f1.setVisible(true);
                setVisible(false);
        
        
    }//GEN-LAST:event_BT_OFERTARActionPerformed

    private void TablaPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPedidosMouseClicked
        // TODO add your handling code here:
        System.out.println("seleccionado");
        
//        if (!evt.getValueIsAdjusting()) {
                    int selectedRow = TablaPedidos.getSelectedRow();
                    if (selectedRow != -1) {
                        // Obtiene los datos de la fila seleccionada
                         idPedido = (int) TablaPedidos.getValueAt(selectedRow, 0);
                         descripcion = (String) TablaPedidos.getValueAt(selectedRow, 1);
                        Date data3 = (Date) TablaPedidos.getValueAt(selectedRow, 2);
                        String data4 = (String) TablaPedidos.getValueAt(selectedRow, 3);
                        
                        Pedido nuevoPedido = PedidoControlador.pedidoVista(idPedido, descripcion);
                        
                        
                        // Muestra los datos en el JTextField
                        System.out.println("Columna 1: " + idPedido + ", Columna 2: " + descripcion+ "Columna 3: " + data3 + ", Columna 4: " + data4);
//                        textField.setText("Columna 1: " + data1 + ", Columna 2: " + data2);
                    }
//                }
    }//GEN-LAST:event_TablaPedidosMouseClicked

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
            java.util.logging.Logger.getLogger(lista_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lista_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lista_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lista_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lista_pedidos().setVisible(true);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_OFERTAR;
    private javax.swing.JTable TablaPedidos;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
