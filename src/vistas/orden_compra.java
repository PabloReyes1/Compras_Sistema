/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import Controladores.OfertaControlador;
import Controladores.OrdenControlador;
import Entidades.Oferta;
import Entidades.OfertaDetalle;
import Entidades.OrdenCompra;
import Entidades.OrdenCompraDetalle;
import Entidades.PedidoDetalle;
import Entidades.Proveedor;
import Metodos.Ofertas;
import Metodos.Pedidos;
import Metodos.Proveedores;
import Procesos_Almacenados.SPOferta;
import Procesos_Almacenados.SPOrden;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ProcesosE
 */
public final class orden_compra extends javax.swing.JFrame {
    
    DefaultTableModel modelo;
    DefaultTableModel modeluky;

    /**
     * Creates new form orden_compra
     * @param idPedido
     * @param idOferta
     * @param montoAdjudicacion
     * @param tipoAdjudicacion
     */
    public orden_compra(int idPedido,int idOferta,int montoAdjudicacion,String tipoAdjudicacion) {
        initComponents();
        
        txt_idadjudicacion.setText(String.valueOf(idPedido));
        txt_idoferta.setText(String.valueOf(idOferta));
        txt_total.setText(String.valueOf(montoAdjudicacion));
        txt_tipodeorden.setText(tipoAdjudicacion);
        
        txt_idadjudicacion.setEditable(false);
        txt_idoferta.setEditable(false);
        txt_total.setEditable(false);
        txt_tipodeorden.setEditable(false);
        txt_idproveedor.setEditable(false);
        txt_idpedido.setEditable(false);
        txt_nombreproveedor.setEditable(false);
        
        modelo = new DefaultTableModel();
        modelo.addColumn("ID PRODUCTO");
        modelo.addColumn("NOMBRE PRODUCTO");
        modelo.addColumn("DESCRIPCION PRODUCTO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("PRECIO");
        modelo.addColumn("PRECIO UNIDAD");
        
        this.TablaOfertas.setModel(modelo);
        
        modeluky = new DefaultTableModel();
        modeluky.addColumn("ID PRODUCTO");
        modeluky.addColumn("NOMBRE PRODUCTO");
        modeluky.addColumn("DESCRIPCION PRODUCTO");
        modeluky.addColumn("CANTIDAD");
        modeluky.addColumn("PRECIO");
        modeluky.addColumn("PRECIO UNIDAD");
        
        this.TablaOrdeCompra.setModel(modeluky);
        
        actualizarCombonombreproveedor(idOferta);
        actualizarTablaOfertas(idOferta);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_idadjudicacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_idoferta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bt_agregar = new javax.swing.JButton();
        txt_idproveedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_nombreproveedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_idpedido = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaOfertas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ComboPrioridad = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txt_tipodeorden = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaOrdeCompra = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("ID_OFERTA");

        jLabel3.setText("ID_PROVEEDOR");

        bt_agregar.setText("AGREGAR");
        bt_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarActionPerformed(evt);
            }
        });

        jLabel4.setText("NOMBRE DEL PROVEEDOR");

        jLabel5.setText("ID_PEDIDO");

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
        jScrollPane1.setViewportView(TablaOfertas);

        jLabel1.setText("ID_ADJUDICACION");

        jLabel12.setText("TIPO DE ORDEN");

        ComboPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BAJA", "MEDIA", "ALTA" }));

        jLabel13.setText("PRIORIDAD");

        jLabel14.setText("DIRECCION DE ENTREGA");

        TablaOrdeCompra.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TablaOrdeCompra);

        jLabel15.setText("TOTAL DE ORDEN DE COMPRA");

        jButton2.setText("CREAR ORDEN DE COMPRA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(193, 193, 193)
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(txt_tipodeorden, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13)
                            .addGap(18, 18, 18)
                            .addComponent(ComboPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(18, 18, 18)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(590, 590, 590)
                            .addComponent(bt_agregar)
                            .addGap(12, 12, 12))
                        .addComponent(jSeparator1)
                        .addComponent(jScrollPane2)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(txt_idpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_idproveedor))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_idadjudicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_idoferta, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_nombreproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_tipodeorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(ComboPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_idadjudicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(txt_idoferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_idproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txt_nombreproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txt_idpedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(417, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregarActionPerformed
        // TODO add your handling code here:
        
        String prioridad = (String) ComboPrioridad.getSelectedItem();
        
        if (!prioridad.equals("Seleccionar")) {
            
                
               int idpedido = Integer.parseInt(txt_idpedido.getText());
               int idproveedor = Integer.parseInt(txt_idproveedor.getText());
               int idadjudicacion = Integer.parseInt(txt_idadjudicacion.getText());
               String descripcion = txt_direccion.getText();
               String tipoorden = txt_tipodeorden.getText();
               String direccion = txt_direccion.getText();
               int total = Integer.parseInt(txt_total.getText());
               
              // Oferta nuevaoferta = OfertaControlador.insertarOfertaEncabezado(idproveedor, idpedido, NombreSeleccionado);
               OrdenCompra nuevaOrden = OrdenControlador.insertarOrdenEncabezado(idpedido,idadjudicacion,idproveedor,tipoorden,prioridad,descripcion,direccion,total);
               
               SPOrden.agregarOrdenEncabezado(nuevaOrden);
               //SPOferta.agregarOfertaEncabezado(idpedido,idadjudicacion,idproveedor,tipoorden,prioridad,descripcion,direccion,total);
               
               TablaOfertas.getModel();
            
            for (int i = 0; i < modelo.getRowCount(); i++) {
            
            int ID_PRODUCTO = (int) modelo.getValueAt(i, 0);
            String NOMBRE_PRODUCTO = (String) modelo.getValueAt(i, 1); 
            String DESCRIPCION = (String) modelo.getValueAt(i, 2); 
            int CANTIDAD = (int) modelo.getValueAt(i, 3);
            int PRECIO_UNITARIO = (int) modelo.getValueAt(i, 4); // Suponiendo que la columna 2 contiene la DESCRIPCION_PRODUCTO
            int PRECIO = (int) modelo.getValueAt(i, 5); // Suponiendo que la columna 3 contiene la CANTIDAD_SOLICITADA
            
            
            OrdenCompraDetalle nuevoOrdenDetalle = OrdenControlador.insertarOrdenDetalle(ID_PRODUCTO, NOMBRE_PRODUCTO, DESCRIPCION, CANTIDAD, PRECIO, PRECIO_UNITARIO);
            
            SPOrden.agregarOrdenDetalle(nuevoOrdenDetalle);
            
            //prueba github1
            
            }
            
        
            
            
        }
        
        
    }//GEN-LAST:event_bt_agregarActionPerformed

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
            java.util.logging.Logger.getLogger(orden_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(orden_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(orden_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(orden_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }
    
    
    
    public void actualizarCombonombreproveedor(int idOferta){
    
        //Combonombreproveedor.removeAllItems(); // Limpiar el combo antes de actualizar
    
    Ofertas prov = new Ofertas();
    ArrayList<Oferta> datosOferta = prov.obtenerDatosOferta(idOferta);
    
    for (Oferta oferta : datosOferta) {
        //Combonombreproveedor.addItem(proveedor.getNOMBRE_PROVEEDOR());
        txt_idproveedor.setText(String.valueOf(oferta.getID_PROVEEDOR()));
        txt_idpedido.setText(String.valueOf(oferta.getID_PEDIDO()));
        txt_nombreproveedor.setText(oferta.getNOMBRE_PROVEEDOR());
        
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
    
    public void actualizarTablaOfertas(int idOferta) {
//    ComboDepartamento.removeAllItems(); // Limpiar el combo antes de actualizar
    
    Ofertas of = new Ofertas();
    ArrayList<OfertaDetalle> datosOfertaDetalle = of.obtenerOfertaDetalle(idOferta);
    
    for (OfertaDetalle ofertadetalle : datosOfertaDetalle) {
            Object[] fila = {
                
                
                    ofertadetalle.getID_PRODUCTO(),
                    ofertadetalle.getNOMBRE_PRODUCTO(),
                    ofertadetalle.getDESCRIPCION_PRODUCTO(),
                    ofertadetalle.getCANTIDAD(),
                    ofertadetalle.getPRECIO(),
                    ofertadetalle.getPRECIO_UNIDAD()
                    
            };
            modelo.addRow(fila);
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboPrioridad;
    private javax.swing.JTable TablaOfertas;
    private javax.swing.JTable TablaOrdeCompra;
    private javax.swing.JButton bt_agregar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_idadjudicacion;
    private javax.swing.JTextField txt_idoferta;
    private javax.swing.JTextField txt_idpedido;
    private javax.swing.JTextField txt_idproveedor;
    private javax.swing.JTextField txt_nombreproveedor;
    private javax.swing.JTextField txt_tipodeorden;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
