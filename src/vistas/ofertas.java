/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import Controladores.OfertaControlador;
import Controladores.PedidoControlador;
import Entidades.Departamento;
import Entidades.Oferta;
import Entidades.OfertaDetalle;
import Entidades.Pedido;
import Entidades.PedidoDetalle;
import Entidades.Proveedor;
import Entidades.Proveedor1;
import Metodos.Pedidos;
import Metodos.Proveedores;
import Procesos_Almacenados.SPOferta;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ProcesosE
 */
public final class ofertas extends javax.swing.JFrame {

    DefaultTableModel modelo;
    DefaultTableModel modeluky;
    
//    private final int idPedido;
//    private final String descripcion;

    /**
     * Creates new form ofertas
     * @param idPedido
     * @param descripcion
     */
    public ofertas(int idPedido, String descripcion) {
        initComponents();
        MostrarProveedores();
        
        txt_idpedido.setText(String.valueOf(idPedido));
        txt_descripcionpedido.setText(descripcion);
        txt_idpedido.setEditable(false);
        txt_descripcionpedido.setEditable(false);
        txt_nombreproducto.setEditable(false);
        txt_descripcionproducto.setEditable(false);
        txt_cantidad.setEditable(false);
        txt_idproducto.setEditable(false);
        
        modelo = new DefaultTableModel();
        modelo.addColumn("NOMBRE DEL PRODUCTO");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("CANTIDAD SOLICITADA");
        modelo.addColumn("ID PRODUCTO");
        modelo.addColumn("ID PEDIDO");
        modelo.addColumn("ID PEDIDO DETALLE");
        
        this.TablaPedidoDetalle.setModel(modelo);
        int idPedidoDetalle = Integer.parseInt(txt_idpedido.getText());
        
        MostrarDatosTabla(idPedidoDetalle);
        
        modeluky = new DefaultTableModel();
        modeluky.addColumn("NOMBRE DEL PRODUCTO");
        modeluky.addColumn("DESCRIPCION");
        modeluky.addColumn("CANTIDAD");
        modeluky.addColumn("ID PRODUCTO");
        modeluky.addColumn("PRECIO UNITARIO");
        modeluky.addColumn("PRECIO");
        
        this.TablaAgregarOferta.setModel(modeluky);
        
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
        txt_idpedido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_descripcionpedido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPedidoDetalle = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txt_idproducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_nombreproducto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_descripcionproducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_precioporunidad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_preciototal = new javax.swing.JTextField();
        bt_agregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaAgregarOferta = new javax.swing.JTable();
        bt_enviaroferta = new javax.swing.JButton();
        Comboidproveedor = new javax.swing.JComboBox<>();
        Combonombreproveedor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID_PEDIDO");

        jLabel2.setText("DESCRIPCION");

        jLabel3.setText("ID_PROVEEDOR");

        jLabel4.setText("NOMBRE DEL PROVEEDOR");

        jLabel5.setText("VIGENCIA DE OFERTA");

        jTextField5.setText("jTextField5");

        TablaPedidoDetalle.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaPedidoDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPedidoDetalleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaPedidoDetalle);

        jLabel6.setText("ID PRODUCTO");

        jLabel7.setText("NOMBRE PRODUCTO");

        jLabel8.setText("DESCRIPCION");

        jLabel9.setText("CANTIDAD");

        jLabel10.setText("PRECIO POR UNIDAD");

        jLabel11.setText("PRECIO TOTAL");

        bt_agregar.setText("AGREGAR");
        bt_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarActionPerformed(evt);
            }
        });

        TablaAgregarOferta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TablaAgregarOferta);

        bt_enviaroferta.setText("ENVIAR OFERTA");
        bt_enviaroferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_enviarofertaActionPerformed(evt);
            }
        });

        Comboidproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboidproveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(Comboidproveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_idpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_descripcionpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(Combonombreproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addComponent(txt_idproducto))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(txt_descripcionproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_precioporunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_preciototal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_nombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_cantidad)))
                                .addGap(65, 65, 65)
                                .addComponent(bt_agregar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(bt_enviaroferta)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_idpedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_descripcionpedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(Comboidproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combonombreproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_idproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_nombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_descripcionproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_agregar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_precioporunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_preciototal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_enviaroferta)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboidproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboidproveedorActionPerformed
        // TODO add your handling code here:
        String idSeleccionado = (String) Comboidproveedor.getSelectedItem();
        if (!idSeleccionado.equals("Seleccionar")) {
            
            int idProveedor = Integer.parseInt(idSeleccionado);
            
            actualizarCombonombreproveedor(idProveedor);
        }
        
    }//GEN-LAST:event_ComboidproveedorActionPerformed

    private void TablaPedidoDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPedidoDetalleMouseClicked
        // TODO add your handling code here:
        
        int selectedRow = TablaPedidoDetalle.getSelectedRow();
                    if (selectedRow != -1) {
                        // Obtiene los datos de la fila seleccionada
                        String nom = (String) TablaPedidoDetalle.getValueAt(selectedRow, 0);
                        String des = (String) TablaPedidoDetalle.getValueAt(selectedRow, 1);
                        int can = (int) TablaPedidoDetalle.getValueAt(selectedRow, 2);
                        int idprod = (int) TablaPedidoDetalle.getValueAt(selectedRow, 3);
                        int idped = (int) TablaPedidoDetalle.getValueAt(selectedRow, 4);
                        int idpedde = (int) TablaPedidoDetalle.getValueAt(selectedRow, 5);
                        
                        String cantx = String.valueOf(can);
                        String idprodtx = String.valueOf(idprod);
                        
                        txt_nombreproducto.setText(nom);
                        txt_descripcionproducto.setText(des);
                        txt_cantidad.setText(cantx);
                        txt_idproducto.setText(idprodtx);
//                        
//                        int preuni = Integer.parseInt(txt_precioporunidad.getText());
//                        int pretot = preuni * can;
//                        String pretotxt = String.valueOf(pretot);
                        //txt_preciototal.setText(pretotxt);
                        
                        System.out.println(nom + des + can + idprod + idped+ idpedde+cantx+idprodtx);
                        
//                        InsertarTabla(nom, des, can, idprod, preuni, pretot);
//                        
//                        Pedido nuevoPedido = PedidoControlador.pedidoVista(idPedido, descripcion);
                        
                        
                        // Muestra los datos en el JTextField
//                        System.out.println("Columna 1: " + idPedido + ", Columna 2: " + descripcion+ "Columna 3: " + data3 + ", Columna 4: " + data4);
//                        textField.setText("Columna 1: " + data1 + ", Columna 2: " + data2);
                    }
                    
    }//GEN-LAST:event_TablaPedidoDetalleMouseClicked

    private void bt_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregarActionPerformed
        // TODO add your handling code here:
        int idp = Integer.parseInt(txt_idproducto.getText());
        String nomp = txt_nombreproducto.getText();
        String descr = txt_descripcionproducto.getText();
        int canti = Integer.parseInt(txt_cantidad.getText());
        
        int preuni = Integer.parseInt(txt_precioporunidad.getText());
        int pretot = preuni * canti;
        String pretotxt = String.valueOf(pretot);
        txt_preciototal.setText(pretotxt);
        
        
                        InsertarTabla(nomp, descr, canti, idp, preuni, pretot);
        
        
        
        
        
    }//GEN-LAST:event_bt_agregarActionPerformed

    private void bt_enviarofertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_enviarofertaActionPerformed
        // TODO add your handling code here:
        
        String idProveedorSeleccionado = (String) Comboidproveedor.getSelectedItem();
        String NombreSeleccionado = (String) Combonombreproveedor.getSelectedItem();
        
        if (!idProveedorSeleccionado.equals("Seleccionar")) {
            if (!NombreSeleccionado.equals("Seleccionar")) {
                
               int idpedido = Integer.parseInt(txt_idpedido.getText());
               int idproveedor = Integer.parseInt(idProveedorSeleccionado);
               
               Oferta nuevaoferta = OfertaControlador.insertarOfertaEncabezado(idproveedor, idpedido, NombreSeleccionado);
               
               SPOferta.agregarOfertaEncabezado(nuevaoferta);
               
               TablaAgregarOferta.getModel();
            
            for (int i = 0; i < modeluky.getRowCount(); i++) {
            
            String NOMBRE_PRODUCTO = (String) modeluky.getValueAt(i, 0); 
            String DESCRIPCION = (String) modeluky.getValueAt(i, 1); 
            int CANTIDAD = (int) modeluky.getValueAt(i, 2);
            int ID_PRODUCTO = (int) modeluky.getValueAt(i, 3);
            int PRECIO_UNITARIO = (int) modeluky.getValueAt(i, 4); // Suponiendo que la columna 2 contiene la DESCRIPCION_PRODUCTO
            int PRECIO = (int) modeluky.getValueAt(i, 5); // Suponiendo que la columna 3 contiene la CANTIDAD_SOLICITADA
            
            
            OfertaDetalle nuevaOfertaDetalle = OfertaControlador.insertarOfertaDetalle(ID_PRODUCTO, NOMBRE_PRODUCTO, DESCRIPCION, CANTIDAD, PRECIO, PRECIO_UNITARIO);
            
            SPOferta.agregarOfertaDetalle(nuevaOfertaDetalle);
            
            }
            
        }
            
            
        }
        
        
    }//GEN-LAST:event_bt_enviarofertaActionPerformed

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
            java.util.logging.Logger.getLogger(ofertas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ofertas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ofertas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ofertas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new ofertas(int idPedido, String descripcion).setVisible(true);
            }
        });
    }
    
    public void MostrarProveedores(){
        Proveedores prov = new Proveedores();
        
        ArrayList<Proveedor1> datosProveedor = prov.obtenerProveedor();
        Comboidproveedor.addItem("Seleccionar");
        
        for (int i = 0; i < datosProveedor.size(); i++){
            Comboidproveedor.addItem(String.valueOf(datosProveedor.get(i).getID_PROVEEDOR()));
        }
    
    }
    
    public void actualizarCombonombreproveedor(int idProveedor){
    
        Combonombreproveedor.removeAllItems(); // Limpiar el combo antes de actualizar
    
    Proveedores prov = new Proveedores();
    ArrayList<Proveedor1> nombreproveedor = prov.obtenerNombreProveedor(idProveedor);
    
    for (Proveedor1 proveedor : nombreproveedor) {
        Combonombreproveedor.addItem(proveedor.getNOMBRE_PROVEEDOR());
    }
    }
    
    public void MostrarDatosTabla(int idPedidoDetalle){
    
        Pedidos ped = new Pedidos();
        
       ArrayList<PedidoDetalle> datosPedidoDetalle  = ped.obtenerPedidoDetalle(idPedidoDetalle);
//        ComboTipoProducto.addItem("Seleccionar");
        
        for (PedidoDetalle pedidodetalle : datosPedidoDetalle) {
            Object[] fila = {
                
                    pedidodetalle.getNOMBRE_PRODUCTO(),
                    pedidodetalle.getDESCRIPCION_PRODUCTO(),
                    pedidodetalle.getCANTIDAD_SOLICITADA(),
                    pedidodetalle.getID_PRODUCTO(),
                    pedidodetalle.getID_PEDIDO(),
                    pedidodetalle.getID_PEDIDO_DETALLE()
                    
            };
            modelo.addRow(fila);
        }
    
    }
    
    public void InsertarTabla(String nomp, String descr, int canti, int idp, int preuni, int pretot){
        
        
        
    Object[] fila = {nomp, descr, canti, idp, preuni, pretot};
        modeluky.addRow(fila);
    
    }
    
    
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Comboidproveedor;
    private javax.swing.JComboBox<String> Combonombreproveedor;
    private javax.swing.JTable TablaAgregarOferta;
    private javax.swing.JTable TablaPedidoDetalle;
    private javax.swing.JButton bt_agregar;
    private javax.swing.JButton bt_enviaroferta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_descripcionpedido;
    private javax.swing.JTextField txt_descripcionproducto;
    private javax.swing.JTextField txt_idpedido;
    private javax.swing.JTextField txt_idproducto;
    private javax.swing.JTextField txt_nombreproducto;
    private javax.swing.JTextField txt_precioporunidad;
    private javax.swing.JTextField txt_preciototal;
    // End of variables declaration//GEN-END:variables
}
