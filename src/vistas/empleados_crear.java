/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Conexion.ConexionSQL;
import Entidades.Departamento;
import Entidades.Sucursal;
import Metodos.Departamentos;
import Metodos.Sucursales;
import Procesos_Almacenados.SP_Empleados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexander
 */
public final class empleados_crear extends javax.swing.JFrame {
    
    SP_Empleados emp;
    Connection conn = null;   
    ResultSet rs,rst;
    Statement st;
   
    public empleados_crear() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);   
        MostrarSucursales();
        emp = new SP_Empleados();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btncrearempleado = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btneditarE = new javax.swing.JButton();
        btnverE = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        panelEmpleado = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtpuesto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        txtdpiE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtsalario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jcsucursal = new javax.swing.JComboBox<>();
        jcdeptosucu = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PROVEEDORES");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        btncrearempleado.setBackground(new java.awt.Color(0, 0, 204));
        btncrearempleado.setForeground(new java.awt.Color(255, 255, 255));
        btncrearempleado.setText("CREAR");
        btncrearempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearempleadoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 102, 255));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btneditarE.setBackground(new java.awt.Color(0, 0, 204));
        btneditarE.setForeground(new java.awt.Color(255, 255, 255));
        btneditarE.setText("EDITAR");
        btneditarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarEActionPerformed(evt);
            }
        });

        btnverE.setBackground(new java.awt.Color(0, 0, 204));
        btnverE.setForeground(new java.awt.Color(255, 255, 255));
        btnverE.setText("VISUALIZAR");
        btnverE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverEActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 0, 204));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnnuevo.setBackground(new java.awt.Color(0, 102, 255));
        btnnuevo.setForeground(new java.awt.Color(0, 0, 0));
        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnverE, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btneditarE, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncrearempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btncrearempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnverE, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btneditarE, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        panelEmpleado.setBackground(new java.awt.Color(255, 255, 255));
<<<<<<< HEAD
        panelEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
=======
        panelEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
>>>>>>> main
        panelEmpleado.setForeground(new java.awt.Color(0, 102, 204));

        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("PUESTO:");

        txtpuesto.setBackground(new java.awt.Color(255, 255, 255));
        txtpuesto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtpuesto.setBorder(null);

        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("DIRECCION:");

        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("DPI:");

        txtdireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtdireccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtdireccion.setBorder(null);

        txtdpiE.setBackground(new java.awt.Color(255, 255, 255));
        txtdpiE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtdpiE.setBorder(null);

        jLabel2.setBackground(new java.awt.Color(0, 102, 204));
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText(" NOMBRE:");

        txtnombre.setBackground(new java.awt.Color(255, 255, 255));
        txtnombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtnombre.setBorder(null);

        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("APELLIDO:");

        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("DEPARTAMENTO:");

        txtapellidos.setBackground(new java.awt.Color(255, 255, 255));
        txtapellidos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtapellidos.setBorder(null);

        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("SALARIO:");

        txtsalario.setBackground(new java.awt.Color(255, 255, 255));
        txtsalario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtsalario.setBorder(null);

        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("TELEFONO:");

        jLabel10.setForeground(new java.awt.Color(0, 102, 204));
        jLabel10.setText("CORREO:");

        txttelefono.setBackground(new java.awt.Color(255, 255, 255));
        txttelefono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txttelefono.setBorder(null);

        txtcorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtcorreo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtcorreo.setBorder(null);

        jLabel11.setForeground(new java.awt.Color(0, 102, 204));
        jLabel11.setText("SUCURSAL");

        jcsucursal.setBackground(new java.awt.Color(255, 255, 255));
        jcsucursal.setForeground(new java.awt.Color(0, 51, 102));
        jcsucursal.setBorder(null);
        jcsucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcsucursalActionPerformed(evt);
            }
        });

        jcdeptosucu.setBackground(new java.awt.Color(255, 255, 255));
        jcdeptosucu.setForeground(new java.awt.Color(0, 51, 102));
        jcdeptosucu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jcdeptosucu.setBorder(null);

        javax.swing.GroupLayout panelEmpleadoLayout = new javax.swing.GroupLayout(panelEmpleado);
        panelEmpleado.setLayout(panelEmpleadoLayout);
        panelEmpleadoLayout.setHorizontalGroup(
            panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmpleadoLayout.createSequentialGroup()
                .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEmpleadoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(panelEmpleadoLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jcsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdpiE, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelEmpleadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))))
                .addGap(64, 64, 64)
                .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addComponent(jLabel10)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jcdeptosucu, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8)
                        .addComponent(txtsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelEmpleadoLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator10))
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEmpleadoLayout.createSequentialGroup()
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelEmpleadoLayout.setVerticalGroup(
            panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadoLayout.createSequentialGroup()
                .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEmpleadoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEmpleadoLayout.createSequentialGroup()
                                .addComponent(txtdpiE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(41, 41, 41))
                            .addGroup(panelEmpleadoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jcsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEmpleadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcdeptosucu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(3, 3, 3)
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

<<<<<<< HEAD
        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
=======
        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
>>>>>>> main

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("EMPLEADOS");

        jSeparator11.setBackground(new java.awt.Color(0, 51, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

<<<<<<< HEAD
        jPanel4.setBackground(new java.awt.Color(51, 255, 255));
=======
        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
>>>>>>> main

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(panelEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 8, Short.MAX_VALUE))
>>>>>>> main
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncrearempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearempleadoActionPerformed
        
        String nombres,apellidos,sucursal,puesto,correo,direccion,iddepto;
        String salario,pdi,telefono;
        
        nombres =txtnombre.getText(); apellidos = txtapellidos.getText(); sucursal = (String) jcsucursal.getSelectedItem();
        puesto = txtpuesto.getText(); telefono = txttelefono.getText(); correo =txtcorreo.getText(); direccion = txtdireccion.getText();
        salario = txtsalario.getText(); pdi = txtdpiE.getText(); iddepto = (String) jcdeptosucu.getSelectedItem();
        
        int id = IDdeptoSucursal(iddepto);
         
       
        if(emp.validar(pdi, nombres, apellidos, sucursal, puesto, telefono, correo, iddepto, direccion, salario)){
            emp.insertarEmpleados(nombres, apellidos, id, puesto, salario, direccion, telefono, correo, pdi);
            emp.limpiar(panelEmpleado);
            jcsucursal.setSelectedItem("Seleccionar");
            jcdeptosucu.setSelectedItem("Seleccionar");
        }
    }//GEN-LAST:event_btncrearempleadoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btneditarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarEActionPerformed
        // TODO add your handling code here:
        
        String nombres,apellidos,sucursal,puesto,correo,direccion,iddepto;
        String salario,pdi,telefono;
        
        nombres =txtnombre.getText(); apellidos = txtapellidos.getText(); sucursal = (String) jcsucursal.getSelectedItem();
        puesto = txtpuesto.getText(); telefono = txttelefono.getText(); correo =txtcorreo.getText(); direccion = txtdireccion.getText();
        salario = txtsalario.getText(); pdi = txtdpiE.getText(); iddepto = (String) jcdeptosucu.getSelectedItem();
        
        int id = IDdeptoSucursal(iddepto);
        
        if(emp.validar(pdi, nombres, apellidos, sucursal, puesto, telefono, correo, iddepto, direccion, salario)){
            emp.actualizarEmpleados(pdi, nombres, apellidos, id, puesto, salario, direccion, telefono, correo);
            emp.limpiar(panelEmpleado);
        }
        jcsucursal.setSelectedItem("Seleccionar");
        jcdeptosucu.setSelectedItem("Seleccionar");
    }//GEN-LAST:event_btneditarEActionPerformed

    private void btnverEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverEActionPerformed
       
        String dpi;
        dpi = txtdpiE.getText();
        
        if(emp.validarV(dpi)){
            
            String sucuE = emp.SecudeNombre(dpi);
            String deptosucuE = emp.DepartamentoE(dpi);
            
            try {
                Entidades.Empleados e = emp.mostrarEmpleadoDPI(dpi);
                txtnombre.setText(e.getNom());
                txtapellidos.setText(e.getApe());
                txtpuesto.setText(e.getPues());
                txttelefono.setText(e.getTel());
                txtcorreo.setText(e.getCorr());
                txtdireccion.setText(e.getDirec());
                txtsalario.setText(e.getSal());
                jcsucursal.setSelectedItem(sucuE);
                jcdeptosucu.setSelectedItem(deptosucuE);
                
            } catch (SQLException e) {
                System.out.println(e);
            }
            
        }
       
    }//GEN-LAST:event_btnverEActionPerformed

    private void jcsucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcsucursalActionPerformed
        // TODO add your handling code here:
        
        String sucursalSeleccionada = (String) jcsucursal.getSelectedItem();
        if (!sucursalSeleccionada.equals("Seleccionar")) {
            int idScucursal = obtenerIdSucursalPorNombre(sucursalSeleccionada); // Necesitas implementar este método
            actualizarComboDepartamento(idScucursal); 
        }
    }//GEN-LAST:event_jcsucursalActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        emp.limpiar(panelEmpleado);
        jcsucursal.setSelectedItem("Seleccionar");
        jcdeptosucu.setSelectedItem("Seleccionar");
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
 
        String dpi = txtdpiE.getText();
        
        if(emp.validarE(dpi)){
            emp.EliminarEmpleados(dpi);
            emp.limpiar(panelEmpleado);
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(empleados_crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empleados_crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empleados_crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empleados_crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new empleados_crear().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(empleados_crear.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    //mostrando los nombres de las sucursales 
    
    public void MostrarSucursales(){
        Sucursales suc = new Sucursales();
        
        ArrayList<Sucursal> lista = suc.obtenerSucursales();
        jcsucursal.addItem("Seleccionar");
        
        for (int i = 0; i < lista.size(); i++){
            jcsucursal.addItem(lista.get(i).getNOMBRE());
        }
    }
    
    public void actualizarComboDepartamento(int idScucursal) {
        jcdeptosucu.removeAllItems(); // Limpiar el combo antes de actualizar
    
        Departamentos dep = new Departamentos();
        ArrayList<Departamento> departamentosucu = dep.obtenerDepartamentosPorSucursal(idScucursal);
        jcdeptosucu.addItem("Seleccionar");
        for (Departamento departamento : departamentosucu) {
            jcdeptosucu.addItem(departamento.getNOMBRE_DEPARTAMENTO());
        }
    }

    public int obtenerIdSucursalPorNombre(String nombreSucursal) {
        int idScucursal = -1; // Valor predeterminado si no se encuentra ninguna coincidencia

        try {
            conn = ConexionSQL.conectar();

            String qry = "SELECT ID_SUCURSAL FROM SUCURSALES WHERE NOMBRE = ?";
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setString(1, nombreSucursal);
            rs = ps.executeQuery();

            if (rs.next()) {
                idScucursal = rs.getInt("ID_SUCURSAL");
            }

        } catch(SQLException e) {
            System.out.println("error" + e);
        }

        return idScucursal;
    }
    
    
    public int IDdeptoSucursal(String iddepto){
        
        int iddeptosucu = -1;
        
        try {
            conn = ConexionSQL.conectar();

            String qry = "SELECT ID_DEPARTAMENTO_SUCURSAL FROM DEPARTAMENTO_SUCURSAL WHERE NOMBRE_DEPARTAMENTO = ?";
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setString(1, iddepto);
            rs = ps.executeQuery();

            if (rs.next()) {
                iddeptosucu = rs.getInt("ID_DEPARTAMENTO_SUCURSAL");
            }

        } catch(SQLException e) {
            System.out.println("error" + e);
        }
        
        
        return iddeptosucu;
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btncrearempleado;
    private javax.swing.JButton btneditarE;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnverE;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JComboBox<String> jcdeptosucu;
    private javax.swing.JComboBox<String> jcsucursal;
    private javax.swing.JPanel panelEmpleado;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdpiE;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpuesto;
    private javax.swing.JTextField txtsalario;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
   
}
   







