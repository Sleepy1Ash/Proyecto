/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis_pagos;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marti
 */
public class Interfaz extends javax.swing.JFrame {
        String folio, nombre,ap_pat,ap_mat,municipio,localidad,calle, no_casa,telefono,edad,pag,fechaop;
        int no_venta=0,objetos=0,venta1=0;
        float monto=0,total_pag=0,pagado=0,porpagar=0;
        ResultSet res;
    /**
     * Creates new form InicioSesion
     */
    public Interfaz() {
        initComponents();
        this.setSize(940,510);
        this.setResizable(false);
        setTitle("Sistema de Pagos");
        setIconImage(new ImageIcon(getClass().getResource("../imagenes2/logotipo.png")).getImage());
        registros.setVisible(true);
        bienvenido.setVisible(true);
        pagos.setVisible(false);
        eliminar.setVisible(false);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(false);
        eliminarpago.setVisible(false);
        cambios.setVisible(false);
        cambiosclientes.setVisible(false);
        cambiosventas.setVisible(false);
        cambiospagos.setVisible(false);
        busquedas.setVisible(false);
        calendario.setVisible(false);
        busquedasclientes.setVisible(false);
        busquedasventas.setVisible(false);
        busquedaspagos.setVisible(false);
        menuregistros.setVisible(false);
        registroventas.setVisible(false);
        bloquear();
        
    }
    
    void limpiar(){
        txtfolio.setText(null);
        txtnombre.setText(null);
        txtap_pat.setText(null);
        txtap_mat.setText(null);
        txtlocalidad.setText(null);
        txtmunicipio.setText(null);
        txtcalle.setText(null);
        txtcasa.setText(null);
        txttelefono.setText(null);
        txtventa.setText(null);
        txtobjetos.setText(null);
        txtmonto.setText(null);
    }
    void limpiar2(){
        txtelventa.setText(null);
        txtelfecha.setText(null);
        txtelobjetos.setText(null);
        txtelmonto.setText(null);
    }
    void limpiar3(){
        txtelpago.setText(null);
        txteltotal.setText(null);
        txtelpagado.setText(null);
        txtelporpagar.setText(null);
        txtelfechali.setText(null);
        txtelfechap.setText(null);
    }
    void bloquear(){
        txtfolio.setEnabled(false);
        txtnombre.setEnabled(false);
        txtap_pat.setEnabled(false);
        txtap_mat.setEnabled(false);
        txtlocalidad.setEnabled(false);
        txtmunicipio.setEnabled(false);
        txtcalle.setEnabled(false);
        txtcasa.setEnabled(false);
        txttelefono.setEnabled(false);
        txtventa.setEnabled(false);
        guardarventa.setEnabled(false);
        txtobjetos.setEnabled(false);
        txtmonto.setEnabled(false);
        nuevo.setEnabled(true);
        guardarcliente.setEnabled(false);
        cancelar.setEnabled(false);
        calendario.setEnabled(false);
    }
    void desbloquear(){
         txtfolio.setEnabled(true);
        txtnombre.setEnabled(true);
        txtap_pat.setEnabled(true);
        txtap_mat.setEnabled(true);
        txtlocalidad.setEnabled(true);
        txtmunicipio.setEnabled(true);
        txtcalle.setEnabled(true);
        txtcasa.setEnabled(true);
        txttelefono.setEnabled(true);
        nuevo.setEnabled(true);
        guardarcliente.setEnabled(true);
        cancelar.setEnabled(true);  
        calendario.setEnabled(true);
        busquedas.setEnabled(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registros = new javax.swing.JPanel();
        busquedas = new javax.swing.JPanel();
        busquedasventas = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        btnsalir14 = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        txtdb1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablad2 = new javax.swing.JTable();
        buscarventas5 = new javax.swing.JButton();
        listventas = new javax.swing.JButton();
        busquedasclientes = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        buscarcliente1 = new javax.swing.JButton();
        btnsalir13 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablad = new javax.swing.JTable();
        jLabel74 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        txtdb = new javax.swing.JTextField();
        list = new javax.swing.JButton();
        busquedaspagos = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        btnsalir15 = new javax.swing.JButton();
        buscarpagosc = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        tablad12 = new javax.swing.JTable();
        jLabel93 = new javax.swing.JLabel();
        txtdb12 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        btncliente1 = new javax.swing.JButton();
        btnventa1 = new javax.swing.JButton();
        btnpago1 = new javax.swing.JButton();
        btnsalir4 = new javax.swing.JButton();
        cambios = new javax.swing.JPanel();
        cambiosventas = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        monto3 = new javax.swing.JTextField();
        venta3 = new javax.swing.JTextField();
        fecha3 = new javax.swing.JTextField();
        objetos3 = new javax.swing.JTextField();
        buscarventa = new javax.swing.JButton();
        cambiarventa = new javax.swing.JButton();
        btnsalir11 = new javax.swing.JButton();
        limpiar2 = new javax.swing.JButton();
        cambiosclientes = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        telefono3 = new javax.swing.JTextField();
        folio3 = new javax.swing.JTextField();
        nombre3 = new javax.swing.JTextField();
        ap_pat3 = new javax.swing.JTextField();
        ap_mat3 = new javax.swing.JTextField();
        municipio3 = new javax.swing.JTextField();
        localidad3 = new javax.swing.JTextField();
        calle3 = new javax.swing.JTextField();
        casa3 = new javax.swing.JTextField();
        buscliente = new javax.swing.JButton();
        cambiarcliente = new javax.swing.JButton();
        btnsalir10 = new javax.swing.JButton();
        limpiar1 = new javax.swing.JButton();
        cambiospagos = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        fecha_p3 = new javax.swing.JTextField();
        pago3 = new javax.swing.JTextField();
        total3 = new javax.swing.JTextField();
        pagado3 = new javax.swing.JTextField();
        pagar3 = new javax.swing.JTextField();
        fecha_lim3 = new javax.swing.JTextField();
        buscarpago = new javax.swing.JButton();
        cambiarpago = new javax.swing.JButton();
        btnsalir12 = new javax.swing.JButton();
        limpiar3 = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        btncliente2 = new javax.swing.JButton();
        btnventa2 = new javax.swing.JButton();
        btnpago2 = new javax.swing.JButton();
        btnsalir9 = new javax.swing.JButton();
        eliminar = new javax.swing.JPanel();
        eliminarclientes = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txttelefono2 = new javax.swing.JTextField();
        txtfolio2 = new javax.swing.JTextField();
        txtnombre2 = new javax.swing.JTextField();
        txtap_pat2 = new javax.swing.JTextField();
        txtap_mat2 = new javax.swing.JTextField();
        txtmunicipio2 = new javax.swing.JTextField();
        txtlocalidad2 = new javax.swing.JTextField();
        txtcalle2 = new javax.swing.JTextField();
        txtcasa2 = new javax.swing.JTextField();
        buscarcliente = new javax.swing.JButton();
        eliminarcliente = new javax.swing.JButton();
        btnsalir6 = new javax.swing.JButton();
        cancelar3 = new javax.swing.JButton();
        eliminarpago = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtelfechap = new javax.swing.JTextField();
        txtelpago = new javax.swing.JTextField();
        txteltotal = new javax.swing.JTextField();
        txtelpagado = new javax.swing.JTextField();
        txtelporpagar = new javax.swing.JTextField();
        txtelfechali = new javax.swing.JTextField();
        btnsalir8 = new javax.swing.JButton();
        buscarpagos = new javax.swing.JButton();
        eliminarpagos = new javax.swing.JButton();
        cancelar5 = new javax.swing.JButton();
        eliminarventa = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtelmonto = new javax.swing.JTextField();
        txtelventa = new javax.swing.JTextField();
        txtelfecha = new javax.swing.JTextField();
        txtelobjetos = new javax.swing.JTextField();
        buscarventas = new javax.swing.JButton();
        eliminarventas = new javax.swing.JButton();
        btnsalir7 = new javax.swing.JButton();
        cancelar4 = new javax.swing.JButton();
        btnsalir5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btncliente = new javax.swing.JButton();
        btnventa = new javax.swing.JButton();
        btnpago = new javax.swing.JButton();
        menuregistros = new javax.swing.JPanel();
        btncliente3 = new javax.swing.JButton();
        titulo1 = new javax.swing.JLabel();
        btnventa3 = new javax.swing.JButton();
        btnsalir17 = new javax.swing.JButton();
        pagos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnsalir3 = new javax.swing.JButton();
        txtpago = new javax.swing.JTextField();
        txtpagado = new javax.swing.JTextField();
        txtporpagar = new javax.swing.JTextField();
        btnguardar2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txttotalpagar = new javax.swing.JTextField();
        fecha_lim = new com.toedter.calendar.JDateChooser();
        fecha_pag = new com.toedter.calendar.JDateChooser();
        nuevo2 = new javax.swing.JButton();
        cancelar2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        no_venta1 = new javax.swing.JTextField();
        registroventas = new javax.swing.JPanel();
        guardarventa = new javax.swing.JButton();
        lbventa = new javax.swing.JLabel();
        txtventa = new javax.swing.JTextField();
        lbfecha = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JDateChooser();
        lbobjetos = new javax.swing.JLabel();
        txtobjetos = new javax.swing.JTextField();
        lbmonto = new javax.swing.JLabel();
        txtmonto = new javax.swing.JTextField();
        btnsalir16 = new javax.swing.JButton();
        titulo2 = new javax.swing.JLabel();
        nuevo1 = new javax.swing.JButton();
        cancelar1 = new javax.swing.JButton();
        bienvenido = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        nuevo = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        lbtitulo = new javax.swing.JLabel();
        lbtelefono = new javax.swing.JLabel();
        lbnombre = new javax.swing.JLabel();
        lbap_pat = new javax.swing.JLabel();
        lbap_mat = new javax.swing.JLabel();
        lbmunicipio = new javax.swing.JLabel();
        lblocalidad = new javax.swing.JLabel();
        lbcalle = new javax.swing.JLabel();
        lbcasa = new javax.swing.JLabel();
        lbfolio = new javax.swing.JLabel();
        txtfolio = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtap_pat = new javax.swing.JTextField();
        txtap_mat = new javax.swing.JTextField();
        txtmunicipio = new javax.swing.JTextField();
        txtlocalidad = new javax.swing.JTextField();
        txtcalle = new javax.swing.JTextField();
        txtcasa = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        btnsalir2 = new javax.swing.JButton();
        guardarcliente = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btncambios = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnregistros = new javax.swing.JButton();
        btnpagos = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnbusqueda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        registros.setBackground(new java.awt.Color(255, 255, 255));
        registros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        registros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        busquedas.setBackground(new java.awt.Color(255, 255, 255));
        busquedas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        busquedas.setLayout(null);

        busquedasventas.setBackground(new java.awt.Color(255, 255, 255));
        busquedasventas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        busquedasventas.setLayout(null);

        jLabel68.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel68.setText("Busquedas Venta");
        busquedasventas.add(jLabel68);
        jLabel68.setBounds(250, 10, 200, 29);

        btnsalir14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar.png"))); // NOI18N
        btnsalir14.setContentAreaFilled(false);
        btnsalir14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar (Copiar).png"))); // NOI18N
        btnsalir14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir14ActionPerformed(evt);
            }
        });
        busquedasventas.add(btnsalir14);
        btnsalir14.setBounds(0, 10, 93, 69);

        jLabel82.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel82.setText("Escribe el numero de venta  :");
        busquedasventas.add(jLabel82);
        jLabel82.setBounds(30, 80, 210, 20);
        busquedasventas.add(txtdb1);
        txtdb1.setBounds(250, 80, 190, 30);

        tablad2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablad2);

        busquedasventas.add(jScrollPane2);
        jScrollPane2.setBounds(30, 220, 660, 190);

        buscarventas5.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        buscarventas5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar).png"))); // NOI18N
        buscarventas5.setText("Buscar");
        buscarventas5.setContentAreaFilled(false);
        buscarventas5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buscarventas5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar) (Copiar).png"))); // NOI18N
        buscarventas5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        buscarventas5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buscarventas5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarventas5ActionPerformed(evt);
            }
        });
        busquedasventas.add(buscarventas5);
        buscarventas5.setBounds(460, 20, 93, 100);

        listventas.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        listventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar).png"))); // NOI18N
        listventas.setText("Todas las ventas");
        listventas.setContentAreaFilled(false);
        listventas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        listventas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar) (Copiar).png"))); // NOI18N
        listventas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        listventas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        listventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listventasActionPerformed(evt);
            }
        });
        busquedasventas.add(listventas);
        listventas.setBounds(10, 110, 160, 100);

        busquedas.add(busquedasventas);
        busquedasventas.setBounds(0, 0, 710, 510);

        busquedasclientes.setBackground(new java.awt.Color(255, 255, 255));
        busquedasclientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        busquedasclientes.setLayout(null);

        jLabel58.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel58.setText("Buscar Cliente");
        busquedasclientes.add(jLabel58);
        jLabel58.setBounds(250, 10, 170, 29);

        buscarcliente1.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        buscarcliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar).png"))); // NOI18N
        buscarcliente1.setText("Buscar");
        buscarcliente1.setContentAreaFilled(false);
        buscarcliente1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buscarcliente1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar) (Copiar).png"))); // NOI18N
        buscarcliente1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        buscarcliente1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buscarcliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarcliente1ActionPerformed(evt);
            }
        });
        busquedasclientes.add(buscarcliente1);
        buscarcliente1.setBounds(460, 20, 93, 100);

        btnsalir13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar.png"))); // NOI18N
        btnsalir13.setContentAreaFilled(false);
        btnsalir13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar (Copiar).png"))); // NOI18N
        btnsalir13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir13ActionPerformed(evt);
            }
        });
        busquedasclientes.add(btnsalir13);
        btnsalir13.setBounds(20, 10, 93, 69);

        tablad.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablad);

        busquedasclientes.add(jScrollPane1);
        jScrollPane1.setBounds(30, 220, 660, 190);

        jLabel74.setText("Como quieres Buscar?");
        busquedasclientes.add(jLabel74);
        jLabel74.setBounds(130, 50, 360, 20);

        jLabel81.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel81.setText("Escribe el folio  :");
        busquedasclientes.add(jLabel81);
        jLabel81.setBounds(110, 80, 120, 20);
        busquedasclientes.add(txtdb);
        txtdb.setBounds(240, 80, 190, 30);

        list.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar).png"))); // NOI18N
        list.setText("Lista de clientes");
        list.setContentAreaFilled(false);
        list.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        list.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar) (Copiar).png"))); // NOI18N
        list.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        list.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });
        busquedasclientes.add(list);
        list.setBounds(10, 120, 141, 120);

        busquedas.add(busquedasclientes);
        busquedasclientes.setBounds(-10, 0, 710, 510);

        busquedaspagos.setBackground(new java.awt.Color(255, 255, 255));
        busquedaspagos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        busquedaspagos.setLayout(null);

        jLabel69.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel69.setText("Busquedas Pagos");
        busquedaspagos.add(jLabel69);
        jLabel69.setBounds(270, 10, 210, 29);

        btnsalir15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar.png"))); // NOI18N
        btnsalir15.setContentAreaFilled(false);
        btnsalir15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar (Copiar).png"))); // NOI18N
        btnsalir15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir15ActionPerformed(evt);
            }
        });
        busquedaspagos.add(btnsalir15);
        btnsalir15.setBounds(0, 10, 93, 69);

        buscarpagosc.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        buscarpagosc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar).png"))); // NOI18N
        buscarpagosc.setText("Buscar");
        buscarpagosc.setContentAreaFilled(false);
        buscarpagosc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buscarpagosc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar) (Copiar).png"))); // NOI18N
        buscarpagosc.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        buscarpagosc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buscarpagosc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarpagoscActionPerformed(evt);
            }
        });
        busquedaspagos.add(buscarpagosc);
        buscarpagosc.setBounds(570, 30, 93, 100);

        tablad12.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane13.setViewportView(tablad12);

        busquedaspagos.add(jScrollPane13);
        jScrollPane13.setBounds(30, 200, 660, 190);

        jLabel93.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel93.setText("Escribe el folio  :");
        busquedaspagos.add(jLabel93);
        jLabel93.setBounds(100, 90, 120, 20);
        busquedaspagos.add(txtdb12);
        txtdb12.setBounds(220, 80, 190, 30);

        busquedas.add(busquedaspagos);
        busquedaspagos.setBounds(0, 0, 710, 510);

        jLabel57.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel57.setText("Busquedas");
        busquedas.add(jLabel57);
        jLabel57.setBounds(290, 10, 120, 40);

        btncliente1.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btncliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/ayudante-de-camara (Copiar).png"))); // NOI18N
        btncliente1.setText("Cliente");
        btncliente1.setContentAreaFilled(false);
        btncliente1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncliente1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/ayudante-de-camara (Copiar) (Copiar).png"))); // NOI18N
        btncliente1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btncliente1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncliente1ActionPerformed(evt);
            }
        });
        busquedas.add(btncliente1);
        btncliente1.setBounds(180, 180, 80, 100);

        btnventa1.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btnventa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/tarjeta-de-credito (Copiar).png"))); // NOI18N
        btnventa1.setText("Venta");
        btnventa1.setContentAreaFilled(false);
        btnventa1.setDefaultCapable(false);
        btnventa1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnventa1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/tarjeta-de-credito (Copiar) (Copiar).png"))); // NOI18N
        btnventa1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnventa1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnventa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnventa1ActionPerformed(evt);
            }
        });
        busquedas.add(btnventa1);
        btnventa1.setBounds(360, 180, 90, 100);

        btnpago1.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btnpago1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/factura (1) (Copiar).png"))); // NOI18N
        btnpago1.setText("Pago");
        btnpago1.setContentAreaFilled(false);
        btnpago1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpago1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/factura (1) (Copiar) (Copiar).png"))); // NOI18N
        btnpago1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnpago1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnpago1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpago1ActionPerformed(evt);
            }
        });
        busquedas.add(btnpago1);
        btnpago1.setBounds(290, 340, 93, 100);

        btnsalir4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar.png"))); // NOI18N
        btnsalir4.setContentAreaFilled(false);
        btnsalir4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar (Copiar).png"))); // NOI18N
        btnsalir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir4ActionPerformed(evt);
            }
        });
        busquedas.add(btnsalir4);
        btnsalir4.setBounds(0, 0, 93, 69);

        registros.add(busquedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 500));

        cambios.setBackground(new java.awt.Color(255, 255, 255));
        cambios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        cambios.setLayout(null);

        cambiosventas.setBackground(new java.awt.Color(255, 255, 255));
        cambiosventas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cambiosventas.setLayout(null);

        jLabel45.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel45.setText("Cambios Ventas");
        cambiosventas.add(jLabel45);
        jLabel45.setBounds(260, 10, 200, 29);

        jLabel46.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel46.setText("Monto total:");
        cambiosventas.add(jLabel46);
        jLabel46.setBounds(90, 280, 120, 21);

        jLabel47.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel47.setText("No_venta:");
        cambiosventas.add(jLabel47);
        jLabel47.setBounds(90, 90, 90, 21);

        jLabel48.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel48.setText("Fecha:");
        cambiosventas.add(jLabel48);
        jLabel48.setBounds(90, 150, 60, 21);

        jLabel49.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel49.setText("Cantidad objetos:");
        cambiosventas.add(jLabel49);
        jLabel49.setBounds(90, 220, 160, 21);
        cambiosventas.add(monto3);
        monto3.setBounds(320, 280, 130, 30);
        cambiosventas.add(venta3);
        venta3.setBounds(320, 72, 130, 30);
        cambiosventas.add(fecha3);
        fecha3.setBounds(320, 140, 130, 30);

        objetos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                objetos3ActionPerformed(evt);
            }
        });
        cambiosventas.add(objetos3);
        objetos3.setBounds(320, 210, 130, 30);

        buscarventa.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        buscarventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar).png"))); // NOI18N
        buscarventa.setText("Buscar");
        buscarventa.setContentAreaFilled(false);
        buscarventa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buscarventa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar) (Copiar).png"))); // NOI18N
        buscarventa.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        buscarventa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buscarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarventaActionPerformed(evt);
            }
        });
        cambiosventas.add(buscarventa);
        buscarventa.setBounds(540, 60, 93, 100);

        cambiarventa.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        cambiarventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/cambiar (Copiar).png"))); // NOI18N
        cambiarventa.setText("Cambiar");
        cambiarventa.setContentAreaFilled(false);
        cambiarventa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cambiarventa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/cambiar (Copiar) (Copiar).png"))); // NOI18N
        cambiarventa.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cambiarventa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cambiarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarventaActionPerformed(evt);
            }
        });
        cambiosventas.add(cambiarventa);
        cambiarventa.setBounds(540, 200, 100, 100);

        btnsalir11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar.png"))); // NOI18N
        btnsalir11.setContentAreaFilled(false);
        btnsalir11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar (Copiar).png"))); // NOI18N
        btnsalir11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir11ActionPerformed(evt);
            }
        });
        cambiosventas.add(btnsalir11);
        btnsalir11.setBounds(0, 0, 70, 80);

        limpiar2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        limpiar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/barrer (Copiar).png"))); // NOI18N
        limpiar2.setText("Limpiar");
        limpiar2.setContentAreaFilled(false);
        limpiar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        limpiar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/barrer (Copiar) (Copiar).png"))); // NOI18N
        limpiar2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        limpiar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        limpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar2ActionPerformed(evt);
            }
        });
        cambiosventas.add(limpiar2);
        limpiar2.setBounds(540, 325, 93, 100);

        cambios.add(cambiosventas);
        cambiosventas.setBounds(0, 0, 710, 510);

        cambiosclientes.setBackground(new java.awt.Color(255, 255, 255));
        cambiosclientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cambiosclientes.setLayout(null);

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel29.setText("Cambios Clientes");
        cambiosclientes.add(jLabel29);
        jLabel29.setBounds(240, 10, 200, 20);

        jLabel36.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel36.setText("Telefono:");
        cambiosclientes.add(jLabel36);
        jLabel36.setBounds(120, 430, 90, 20);

        jLabel37.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel37.setText("Folio:");
        cambiosclientes.add(jLabel37);
        jLabel37.setBounds(130, 100, 60, 20);

        jLabel38.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel38.setText("Nombre:");
        cambiosclientes.add(jLabel38);
        jLabel38.setBounds(130, 140, 80, 20);

        jLabel39.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel39.setText("Ap_pat:");
        cambiosclientes.add(jLabel39);
        jLabel39.setBounds(120, 190, 80, 20);

        jLabel40.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel40.setText("Ap_mat:");
        cambiosclientes.add(jLabel40);
        jLabel40.setBounds(120, 230, 80, 20);

        jLabel41.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel41.setText("Municipio:");
        cambiosclientes.add(jLabel41);
        jLabel41.setBounds(120, 270, 90, 20);

        jLabel42.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel42.setText("Localidad:");
        cambiosclientes.add(jLabel42);
        jLabel42.setBounds(120, 310, 100, 20);

        jLabel43.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel43.setText("Calle:");
        cambiosclientes.add(jLabel43);
        jLabel43.setBounds(120, 350, 60, 20);

        jLabel44.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel44.setText("No_casa:");
        cambiosclientes.add(jLabel44);
        jLabel44.setBounds(120, 390, 80, 20);
        cambiosclientes.add(telefono3);
        telefono3.setBounds(310, 420, 120, 30);
        cambiosclientes.add(folio3);
        folio3.setBounds(310, 100, 120, 30);
        cambiosclientes.add(nombre3);
        nombre3.setBounds(310, 140, 120, 30);
        cambiosclientes.add(ap_pat3);
        ap_pat3.setBounds(310, 180, 120, 30);
        cambiosclientes.add(ap_mat3);
        ap_mat3.setBounds(310, 220, 120, 30);
        cambiosclientes.add(municipio3);
        municipio3.setBounds(310, 260, 120, 30);
        cambiosclientes.add(localidad3);
        localidad3.setBounds(310, 300, 120, 30);
        cambiosclientes.add(calle3);
        calle3.setBounds(310, 340, 120, 30);
        cambiosclientes.add(casa3);
        casa3.setBounds(310, 380, 120, 30);

        buscliente.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        buscliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar).png"))); // NOI18N
        buscliente.setText("Buscar");
        buscliente.setContentAreaFilled(false);
        buscliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buscliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar) (Copiar).png"))); // NOI18N
        buscliente.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        buscliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buscliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busclienteActionPerformed(evt);
            }
        });
        cambiosclientes.add(buscliente);
        buscliente.setBounds(540, 90, 93, 100);

        cambiarcliente.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        cambiarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/cambiar (Copiar).png"))); // NOI18N
        cambiarcliente.setText("Cambiar");
        cambiarcliente.setContentAreaFilled(false);
        cambiarcliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cambiarcliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/cambiar (Copiar) (Copiar).png"))); // NOI18N
        cambiarcliente.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cambiarcliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cambiarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarclienteActionPerformed(evt);
            }
        });
        cambiosclientes.add(cambiarcliente);
        cambiarcliente.setBounds(540, 210, 100, 100);

        btnsalir10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar.png"))); // NOI18N
        btnsalir10.setContentAreaFilled(false);
        btnsalir10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar (Copiar).png"))); // NOI18N
        btnsalir10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir10ActionPerformed(evt);
            }
        });
        cambiosclientes.add(btnsalir10);
        btnsalir10.setBounds(0, 0, 70, 80);

        limpiar1.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        limpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/barrer (Copiar).png"))); // NOI18N
        limpiar1.setText("Limpiar");
        limpiar1.setContentAreaFilled(false);
        limpiar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        limpiar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/barrer (Copiar) (Copiar).png"))); // NOI18N
        limpiar1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        limpiar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        limpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar1ActionPerformed(evt);
            }
        });
        cambiosclientes.add(limpiar1);
        limpiar1.setBounds(540, 325, 93, 100);

        cambios.add(cambiosclientes);
        cambiosclientes.setBounds(0, 0, 710, 510);

        cambiospagos.setBackground(new java.awt.Color(255, 255, 255));
        cambiospagos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cambiospagos.setLayout(null);

        jLabel50.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel50.setText("Cambios Pagos");
        cambiospagos.add(jLabel50);
        jLabel50.setBounds(260, 10, 190, 30);

        jLabel51.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel51.setText("Fecha_pag:");
        cambiospagos.add(jLabel51);
        jLabel51.setBounds(90, 300, 110, 30);

        jLabel52.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel52.setText("Pago:");
        cambiospagos.add(jLabel52);
        jLabel52.setBounds(90, 90, 60, 30);

        jLabel53.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel53.setText("Total a pagar:");
        cambiospagos.add(jLabel53);
        jLabel53.setBounds(90, 130, 130, 30);

        jLabel54.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel54.setText("Pagado:");
        cambiospagos.add(jLabel54);
        jLabel54.setBounds(90, 170, 80, 30);

        jLabel55.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel55.setText("Por Pagar:");
        cambiospagos.add(jLabel55);
        jLabel55.setBounds(90, 220, 100, 30);

        jLabel56.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel56.setText("Fecha_lim:");
        cambiospagos.add(jLabel56);
        jLabel56.setBounds(90, 260, 100, 30);
        cambiospagos.add(fecha_p3);
        fecha_p3.setBounds(310, 300, 110, 30);
        cambiospagos.add(pago3);
        pago3.setBounds(310, 80, 110, 30);
        cambiospagos.add(total3);
        total3.setBounds(310, 120, 110, 30);
        cambiospagos.add(pagado3);
        pagado3.setBounds(310, 160, 110, 30);
        cambiospagos.add(pagar3);
        pagar3.setBounds(310, 210, 110, 30);

        fecha_lim3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_lim3ActionPerformed(evt);
            }
        });
        cambiospagos.add(fecha_lim3);
        fecha_lim3.setBounds(310, 260, 110, 30);

        buscarpago.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        buscarpago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar).png"))); // NOI18N
        buscarpago.setText("Buscar");
        buscarpago.setContentAreaFilled(false);
        buscarpago.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buscarpago.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar) (Copiar).png"))); // NOI18N
        buscarpago.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        buscarpago.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buscarpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarpagoActionPerformed(evt);
            }
        });
        cambiospagos.add(buscarpago);
        buscarpago.setBounds(540, 60, 93, 100);

        cambiarpago.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        cambiarpago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/cambiar (Copiar).png"))); // NOI18N
        cambiarpago.setText("Cambiar");
        cambiarpago.setContentAreaFilled(false);
        cambiarpago.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cambiarpago.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/cambiar (Copiar) (Copiar).png"))); // NOI18N
        cambiarpago.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cambiarpago.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cambiarpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarpagoActionPerformed(evt);
            }
        });
        cambiospagos.add(cambiarpago);
        cambiarpago.setBounds(540, 200, 100, 100);

        btnsalir12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar.png"))); // NOI18N
        btnsalir12.setContentAreaFilled(false);
        btnsalir12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar (Copiar).png"))); // NOI18N
        btnsalir12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir12ActionPerformed(evt);
            }
        });
        cambiospagos.add(btnsalir12);
        btnsalir12.setBounds(0, 0, 70, 80);

        limpiar3.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        limpiar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/barrer (Copiar).png"))); // NOI18N
        limpiar3.setText("Limpiar");
        limpiar3.setContentAreaFilled(false);
        limpiar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        limpiar3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/barrer (Copiar) (Copiar).png"))); // NOI18N
        limpiar3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        limpiar3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        limpiar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar3ActionPerformed(evt);
            }
        });
        cambiospagos.add(limpiar3);
        limpiar3.setBounds(540, 325, 93, 100);

        cambios.add(cambiospagos);
        cambiospagos.setBounds(0, 0, 710, 510);

        titulo.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        titulo.setText("Que quieres cambiar?");
        cambios.add(titulo);
        titulo.setBounds(230, 10, 250, 40);

        btncliente2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btncliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/ayudante-de-camara (Copiar).png"))); // NOI18N
        btncliente2.setText("Cliente");
        btncliente2.setContentAreaFilled(false);
        btncliente2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncliente2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/ayudante-de-camara (Copiar) (Copiar).png"))); // NOI18N
        btncliente2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btncliente2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncliente2ActionPerformed(evt);
            }
        });
        cambios.add(btncliente2);
        btncliente2.setBounds(170, 180, 80, 100);

        btnventa2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btnventa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/tarjeta-de-credito (Copiar).png"))); // NOI18N
        btnventa2.setText("Venta");
        btnventa2.setContentAreaFilled(false);
        btnventa2.setDefaultCapable(false);
        btnventa2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnventa2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/tarjeta-de-credito (Copiar) (Copiar).png"))); // NOI18N
        btnventa2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnventa2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnventa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnventa2ActionPerformed(evt);
            }
        });
        cambios.add(btnventa2);
        btnventa2.setBounds(360, 180, 90, 100);

        btnpago2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btnpago2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/factura (1) (Copiar).png"))); // NOI18N
        btnpago2.setText("Pago");
        btnpago2.setContentAreaFilled(false);
        btnpago2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpago2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/factura (1) (Copiar) (Copiar).png"))); // NOI18N
        btnpago2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnpago2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnpago2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpago2ActionPerformed(evt);
            }
        });
        cambios.add(btnpago2);
        btnpago2.setBounds(280, 330, 93, 100);

        btnsalir9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar.png"))); // NOI18N
        btnsalir9.setContentAreaFilled(false);
        btnsalir9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar (Copiar).png"))); // NOI18N
        btnsalir9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir9ActionPerformed(evt);
            }
        });
        cambios.add(btnsalir9);
        btnsalir9.setBounds(0, 0, 70, 80);

        registros.add(cambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 510));

        eliminar.setBackground(new java.awt.Color(255, 255, 255));
        eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        eliminar.setLayout(null);

        eliminarclientes.setBackground(new java.awt.Color(255, 255, 255));
        eliminarclientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        eliminarclientes.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel13.setText("Eliminar Clientes");
        eliminarclientes.add(jLabel13);
        jLabel13.setBounds(250, 10, 200, 29);

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel14.setText("Telefono:");
        eliminarclientes.add(jLabel14);
        jLabel14.setBounds(100, 440, 90, 20);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel15.setText("Folio:");
        eliminarclientes.add(jLabel15);
        jLabel15.setBounds(100, 130, 60, 20);

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel16.setText("Nombre:");
        eliminarclientes.add(jLabel16);
        jLabel16.setBounds(100, 170, 80, 20);

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel17.setText("Ap_Pat:");
        eliminarclientes.add(jLabel17);
        jLabel17.setBounds(100, 210, 80, 20);

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel18.setText("Ap_Mat:");
        eliminarclientes.add(jLabel18);
        jLabel18.setBounds(100, 250, 80, 20);

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel19.setText("Municipio:");
        eliminarclientes.add(jLabel19);
        jLabel19.setBounds(100, 290, 90, 20);

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel20.setText("Localidad:");
        eliminarclientes.add(jLabel20);
        jLabel20.setBounds(100, 320, 100, 20);

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel21.setText("Calle:");
        eliminarclientes.add(jLabel21);
        jLabel21.setBounds(100, 360, 60, 20);

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel22.setText("No_Casa:");
        eliminarclientes.add(jLabel22);
        jLabel22.setBounds(100, 400, 90, 20);

        txttelefono2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefono2ActionPerformed(evt);
            }
        });
        eliminarclientes.add(txttelefono2);
        txttelefono2.setBounds(250, 440, 130, 30);

        txtfolio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfolio2ActionPerformed(evt);
            }
        });
        eliminarclientes.add(txtfolio2);
        txtfolio2.setBounds(250, 122, 130, 30);

        txtnombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre2ActionPerformed(evt);
            }
        });
        eliminarclientes.add(txtnombre2);
        txtnombre2.setBounds(250, 160, 130, 30);

        txtap_pat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtap_pat2ActionPerformed(evt);
            }
        });
        eliminarclientes.add(txtap_pat2);
        txtap_pat2.setBounds(250, 200, 130, 30);

        txtap_mat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtap_mat2ActionPerformed(evt);
            }
        });
        eliminarclientes.add(txtap_mat2);
        txtap_mat2.setBounds(250, 240, 130, 30);

        txtmunicipio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmunicipio2ActionPerformed(evt);
            }
        });
        eliminarclientes.add(txtmunicipio2);
        txtmunicipio2.setBounds(250, 280, 130, 30);

        txtlocalidad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlocalidad2ActionPerformed(evt);
            }
        });
        eliminarclientes.add(txtlocalidad2);
        txtlocalidad2.setBounds(250, 320, 130, 30);

        txtcalle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcalle2ActionPerformed(evt);
            }
        });
        eliminarclientes.add(txtcalle2);
        txtcalle2.setBounds(250, 360, 130, 30);

        txtcasa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcasa2ActionPerformed(evt);
            }
        });
        eliminarclientes.add(txtcasa2);
        txtcasa2.setBounds(250, 400, 130, 30);

        buscarcliente.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        buscarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar).png"))); // NOI18N
        buscarcliente.setText("Buscar");
        buscarcliente.setContentAreaFilled(false);
        buscarcliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buscarcliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar) (Copiar).png"))); // NOI18N
        buscarcliente.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        buscarcliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buscarcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarclienteMouseClicked(evt);
            }
        });
        buscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarclienteActionPerformed(evt);
            }
        });
        eliminarclientes.add(buscarcliente);
        buscarcliente.setBounds(510, 140, 93, 100);

        eliminarcliente.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        eliminarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/expediente (Copiar).png"))); // NOI18N
        eliminarcliente.setText("Borrar");
        eliminarcliente.setContentAreaFilled(false);
        eliminarcliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eliminarcliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/expediente (Copiar) (Copiar).png"))); // NOI18N
        eliminarcliente.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        eliminarcliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        eliminarcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarclienteMouseClicked(evt);
            }
        });
        eliminarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarclienteActionPerformed(evt);
            }
        });
        eliminarclientes.add(eliminarcliente);
        eliminarcliente.setBounds(510, 260, 100, 100);

        btnsalir6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar.png"))); // NOI18N
        btnsalir6.setContentAreaFilled(false);
        btnsalir6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar (Copiar).png"))); // NOI18N
        btnsalir6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir6ActionPerformed(evt);
            }
        });
        eliminarclientes.add(btnsalir6);
        btnsalir6.setBounds(0, 0, 70, 80);

        cancelar3.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        cancelar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/portapapeles (Copiar).png"))); // NOI18N
        cancelar3.setText("Cancelar");
        cancelar3.setContentAreaFilled(false);
        cancelar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelar3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/portapapeles (Copiar) (Copiar).png"))); // NOI18N
        cancelar3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cancelar3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar3ActionPerformed(evt);
            }
        });
        eliminarclientes.add(cancelar3);
        cancelar3.setBounds(520, 370, 93, 110);

        eliminar.add(eliminarclientes);
        eliminarclientes.setBounds(0, 0, 710, 510);

        eliminarpago.setBackground(new java.awt.Color(255, 255, 255));
        eliminarpago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        eliminarpago.setLayout(null);

        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel28.setText("Eliminar Pago");
        eliminarpago.add(jLabel28);
        jLabel28.setBounds(250, 10, 170, 29);

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel30.setText("Pago:");
        eliminarpago.add(jLabel30);
        jLabel30.setBounds(100, 140, 70, 30);

        jLabel31.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel31.setText("Total a pagar:");
        eliminarpago.add(jLabel31);
        jLabel31.setBounds(100, 180, 130, 30);

        jLabel32.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel32.setText("Pagado:");
        eliminarpago.add(jLabel32);
        jLabel32.setBounds(100, 230, 80, 30);

        jLabel33.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel33.setText("Por pagar:");
        eliminarpago.add(jLabel33);
        jLabel33.setBounds(100, 280, 100, 30);

        jLabel35.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel35.setText("Fecha_pag:");
        eliminarpago.add(jLabel35);
        jLabel35.setBounds(100, 360, 110, 30);
        eliminarpago.add(txtelfechap);
        txtelfechap.setBounds(280, 360, 120, 30);
        eliminarpago.add(txtelpago);
        txtelpago.setBounds(280, 140, 120, 30);
        eliminarpago.add(txteltotal);
        txteltotal.setBounds(280, 180, 120, 30);
        eliminarpago.add(txtelpagado);
        txtelpagado.setBounds(280, 220, 120, 30);
        eliminarpago.add(txtelporpagar);
        txtelporpagar.setBounds(280, 270, 120, 30);

        txtelfechali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtelfechaliActionPerformed(evt);
            }
        });
        eliminarpago.add(txtelfechali);
        txtelfechali.setBounds(280, 310, 120, 30);

        btnsalir8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar.png"))); // NOI18N
        btnsalir8.setContentAreaFilled(false);
        btnsalir8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar (Copiar).png"))); // NOI18N
        btnsalir8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir8ActionPerformed(evt);
            }
        });
        eliminarpago.add(btnsalir8);
        btnsalir8.setBounds(0, 0, 70, 80);

        buscarpagos.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        buscarpagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar).png"))); // NOI18N
        buscarpagos.setText("Buscar");
        buscarpagos.setContentAreaFilled(false);
        buscarpagos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buscarpagos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar) (Copiar).png"))); // NOI18N
        buscarpagos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        buscarpagos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buscarpagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarpagosActionPerformed(evt);
            }
        });
        eliminarpago.add(buscarpagos);
        buscarpagos.setBounds(520, 80, 93, 100);

        eliminarpagos.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        eliminarpagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/expediente (Copiar).png"))); // NOI18N
        eliminarpagos.setText("Borrar");
        eliminarpagos.setContentAreaFilled(false);
        eliminarpagos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eliminarpagos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/expediente (Copiar) (Copiar).png"))); // NOI18N
        eliminarpagos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        eliminarpagos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        eliminarpagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarpagosActionPerformed(evt);
            }
        });
        eliminarpago.add(eliminarpagos);
        eliminarpagos.setBounds(520, 200, 100, 100);

        cancelar5.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        cancelar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/portapapeles (Copiar).png"))); // NOI18N
        cancelar5.setText("cancelar");
        cancelar5.setContentAreaFilled(false);
        cancelar5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelar5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/portapapeles (Copiar) (Copiar).png"))); // NOI18N
        cancelar5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cancelar5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cancelar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar5ActionPerformed(evt);
            }
        });
        eliminarpago.add(cancelar5);
        cancelar5.setBounds(530, 310, 93, 110);

        eliminar.add(eliminarpago);
        eliminarpago.setBounds(0, 0, 710, 510);

        eliminarventa.setBackground(new java.awt.Color(255, 255, 255));
        eliminarventa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        eliminarventa.setLayout(null);

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel23.setText("Eliminar Ventas");
        eliminarventa.add(jLabel23);
        jLabel23.setBounds(250, 10, 190, 29);

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel24.setText("Monto total:");
        eliminarventa.add(jLabel24);
        jLabel24.setBounds(90, 280, 110, 21);

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel25.setText("No_venta:");
        eliminarventa.add(jLabel25);
        jLabel25.setBounds(90, 130, 100, 21);

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel26.setText("Fecha:");
        eliminarventa.add(jLabel26);
        jLabel26.setBounds(90, 180, 100, 21);

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel27.setText("Cantidad objetos:");
        eliminarventa.add(jLabel27);
        jLabel27.setBounds(90, 230, 160, 21);
        eliminarventa.add(txtelmonto);
        txtelmonto.setBounds(290, 270, 140, 30);
        eliminarventa.add(txtelventa);
        txtelventa.setBounds(290, 120, 140, 30);
        eliminarventa.add(txtelfecha);
        txtelfecha.setBounds(290, 170, 140, 30);
        eliminarventa.add(txtelobjetos);
        txtelobjetos.setBounds(290, 220, 140, 30);

        buscarventas.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        buscarventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar).png"))); // NOI18N
        buscarventas.setText("Buscar");
        buscarventas.setContentAreaFilled(false);
        buscarventas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buscarventas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/demandante-de-empleo (Copiar) (Copiar).png"))); // NOI18N
        buscarventas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        buscarventas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buscarventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarventasActionPerformed(evt);
            }
        });
        eliminarventa.add(buscarventas);
        buscarventas.setBounds(560, 100, 93, 100);

        eliminarventas.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        eliminarventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/expediente (Copiar).png"))); // NOI18N
        eliminarventas.setText("Borrar");
        eliminarventas.setContentAreaFilled(false);
        eliminarventas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eliminarventas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/expediente (Copiar) (Copiar).png"))); // NOI18N
        eliminarventas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        eliminarventas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        eliminarventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarventasActionPerformed(evt);
            }
        });
        eliminarventa.add(eliminarventas);
        eliminarventas.setBounds(560, 230, 100, 100);

        btnsalir7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar.png"))); // NOI18N
        btnsalir7.setContentAreaFilled(false);
        btnsalir7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar (Copiar).png"))); // NOI18N
        btnsalir7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir7ActionPerformed(evt);
            }
        });
        eliminarventa.add(btnsalir7);
        btnsalir7.setBounds(0, 0, 70, 80);

        cancelar4.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        cancelar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/portapapeles (Copiar).png"))); // NOI18N
        cancelar4.setText("cancelar");
        cancelar4.setContentAreaFilled(false);
        cancelar4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelar4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/portapapeles (Copiar) (Copiar).png"))); // NOI18N
        cancelar4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cancelar4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cancelar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar4ActionPerformed(evt);
            }
        });
        eliminarventa.add(cancelar4);
        cancelar4.setBounds(570, 350, 93, 110);

        eliminar.add(eliminarventa);
        eliminarventa.setBounds(0, 0, 710, 510);

        btnsalir5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar.png"))); // NOI18N
        btnsalir5.setContentAreaFilled(false);
        btnsalir5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar (Copiar).png"))); // NOI18N
        btnsalir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir5ActionPerformed(evt);
            }
        });
        eliminar.add(btnsalir5);
        btnsalir5.setBounds(0, 0, 70, 80);

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel12.setText("Que quieres eliminar?");
        eliminar.add(jLabel12);
        jLabel12.setBounds(230, 10, 250, 30);

        btncliente.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btncliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/ayudante-de-camara (Copiar).png"))); // NOI18N
        btncliente.setText("Cliente");
        btncliente.setContentAreaFilled(false);
        btncliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/ayudante-de-camara (Copiar) (Copiar).png"))); // NOI18N
        btncliente.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btncliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclienteActionPerformed(evt);
            }
        });
        eliminar.add(btncliente);
        btncliente.setBounds(180, 180, 80, 100);

        btnventa.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btnventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/tarjeta-de-credito (Copiar).png"))); // NOI18N
        btnventa.setText("Venta");
        btnventa.setContentAreaFilled(false);
        btnventa.setDefaultCapable(false);
        btnventa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnventa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/tarjeta-de-credito (Copiar) (Copiar).png"))); // NOI18N
        btnventa.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnventa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnventaActionPerformed(evt);
            }
        });
        eliminar.add(btnventa);
        btnventa.setBounds(360, 180, 90, 100);

        btnpago.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btnpago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/factura (1) (Copiar).png"))); // NOI18N
        btnpago.setText("Pago");
        btnpago.setContentAreaFilled(false);
        btnpago.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpago.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/factura (1) (Copiar) (Copiar).png"))); // NOI18N
        btnpago.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnpago.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpagoActionPerformed(evt);
            }
        });
        eliminar.add(btnpago);
        btnpago.setBounds(290, 340, 93, 100);

        registros.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 510));

        menuregistros.setBackground(new java.awt.Color(255, 255, 255));
        menuregistros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        menuregistros.setLayout(null);

        btncliente3.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btncliente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/ayudante-de-camara (Copiar).png"))); // NOI18N
        btncliente3.setText("Cliente");
        btncliente3.setContentAreaFilled(false);
        btncliente3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncliente3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/ayudante-de-camara (Copiar) (Copiar).png"))); // NOI18N
        btncliente3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btncliente3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncliente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncliente3ActionPerformed(evt);
            }
        });
        menuregistros.add(btncliente3);
        btncliente3.setBounds(210, 200, 80, 100);

        titulo1.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        titulo1.setText("¿Que quieres registrar?");
        menuregistros.add(titulo1);
        titulo1.setBounds(220, 10, 280, 40);

        btnventa3.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btnventa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/tarjeta-de-credito (Copiar).png"))); // NOI18N
        btnventa3.setText("Venta");
        btnventa3.setContentAreaFilled(false);
        btnventa3.setDefaultCapable(false);
        btnventa3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnventa3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/tarjeta-de-credito (Copiar) (Copiar).png"))); // NOI18N
        btnventa3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnventa3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnventa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnventa3ActionPerformed(evt);
            }
        });
        menuregistros.add(btnventa3);
        btnventa3.setBounds(400, 200, 90, 100);

        btnsalir17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar.png"))); // NOI18N
        btnsalir17.setContentAreaFilled(false);
        btnsalir17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar (Copiar).png"))); // NOI18N
        btnsalir17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir17ActionPerformed(evt);
            }
        });
        menuregistros.add(btnsalir17);
        btnsalir17.setBounds(0, 10, 93, 69);

        registros.add(menuregistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 510));

        pagos.setBackground(new java.awt.Color(255, 255, 255));
        pagos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pagos.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel2.setText("Registro de los pagos");
        pagos.add(jLabel2);
        jLabel2.setBounds(210, 10, 250, 40);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel3.setText("Fecha de pago:");
        pagos.add(jLabel3);
        jLabel3.setBounds(50, 340, 140, 20);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel6.setText("No_venta:");
        pagos.add(jLabel6);
        jLabel6.setBounds(50, 110, 90, 20);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel7.setText("Pagado:");
        pagos.add(jLabel7);
        jLabel7.setBounds(50, 240, 80, 20);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel8.setText("Por Pagar:");
        pagos.add(jLabel8);
        jLabel8.setBounds(50, 280, 100, 20);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel10.setText("Fecha limite:");
        pagos.add(jLabel10);
        jLabel10.setBounds(50, 310, 120, 20);

        btnsalir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar.png"))); // NOI18N
        btnsalir3.setContentAreaFilled(false);
        btnsalir3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar (Copiar).png"))); // NOI18N
        btnsalir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir3ActionPerformed(evt);
            }
        });
        pagos.add(btnsalir3);
        btnsalir3.setBounds(10, 10, 70, 80);

        txtpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpagoActionPerformed(evt);
            }
        });
        txtpago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpagoKeyTyped(evt);
            }
        });
        pagos.add(txtpago);
        txtpago.setBounds(230, 150, 120, 30);

        txtpagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpagadoActionPerformed(evt);
            }
        });
        txtpagado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpagadoKeyTyped(evt);
            }
        });
        pagos.add(txtpagado);
        txtpagado.setBounds(230, 230, 120, 30);

        txtporpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtporpagarActionPerformed(evt);
            }
        });
        txtporpagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtporpagarKeyTyped(evt);
            }
        });
        pagos.add(txtporpagar);
        txtporpagar.setBounds(230, 270, 120, 30);

        btnguardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/boton-guardar (Copiar).png"))); // NOI18N
        btnguardar2.setContentAreaFilled(false);
        btnguardar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/boton-guardar (Copiar) (Copiar).png"))); // NOI18N
        btnguardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar2ActionPerformed(evt);
            }
        });
        pagos.add(btnguardar2);
        btnguardar2.setBounds(590, 400, 90, 70);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel11.setText("Total a Pagar:");
        pagos.add(jLabel11);
        jLabel11.setBounds(50, 200, 130, 20);

        txttotalpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalpagarActionPerformed(evt);
            }
        });
        txttotalpagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttotalpagarKeyTyped(evt);
            }
        });
        pagos.add(txttotalpagar);
        txttotalpagar.setBounds(230, 190, 120, 30);

        fecha_lim.setDateFormatString("yyyy/MM/dd");
        pagos.add(fecha_lim);
        fecha_lim.setBounds(230, 310, 120, 20);

        fecha_pag.setDateFormatString("yyyy/MM/dd");
        pagos.add(fecha_pag);
        fecha_pag.setBounds(230, 340, 120, 20);

        nuevo2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        nuevo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/nuevo-documento (Copiar).png"))); // NOI18N
        nuevo2.setText("nuevo ");
        nuevo2.setContentAreaFilled(false);
        nuevo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nuevo2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/nuevo-documento (Copiar) (Copiar).png"))); // NOI18N
        nuevo2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        nuevo2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nuevo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo2ActionPerformed(evt);
            }
        });
        pagos.add(nuevo2);
        nuevo2.setBounds(590, 140, 93, 100);

        cancelar2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        cancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/portapapeles (Copiar).png"))); // NOI18N
        cancelar2.setText("cancelar");
        cancelar2.setContentAreaFilled(false);
        cancelar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/portapapeles (Copiar) (Copiar).png"))); // NOI18N
        cancelar2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cancelar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar2ActionPerformed(evt);
            }
        });
        pagos.add(cancelar2);
        cancelar2.setBounds(590, 260, 93, 100);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel9.setText("Pago:");
        pagos.add(jLabel9);
        jLabel9.setBounds(50, 150, 60, 20);

        no_venta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_venta1ActionPerformed(evt);
            }
        });
        no_venta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                no_venta1KeyTyped(evt);
            }
        });
        pagos.add(no_venta1);
        no_venta1.setBounds(230, 110, 120, 30);

        registros.add(pagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 510));

        registroventas.setBackground(new java.awt.Color(255, 255, 255));
        registroventas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        registroventas.setLayout(null);

        guardarventa.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        guardarventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/boton-guardar (Copiar).png"))); // NOI18N
        guardarventa.setText("Guardar_v");
        guardarventa.setContentAreaFilled(false);
        guardarventa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guardarventa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/boton-guardar (Copiar) (Copiar).png"))); // NOI18N
        guardarventa.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        guardarventa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        guardarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarventaActionPerformed(evt);
            }
        });
        registroventas.add(guardarventa);
        guardarventa.setBounds(590, 350, 101, 100);

        lbventa.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        lbventa.setText("No_venta:");
        registroventas.add(lbventa);
        lbventa.setBounds(120, 160, 80, 20);

        txtventa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtventaKeyTyped(evt);
            }
        });
        registroventas.add(txtventa);
        txtventa.setBounds(310, 150, 140, 30);

        lbfecha.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        lbfecha.setText("Fecha:");
        registroventas.add(lbfecha);
        lbfecha.setBounds(120, 200, 50, 20);

        calendario.setDateFormatString("yyyy/MM/dd");
        registroventas.add(calendario);
        calendario.setBounds(310, 200, 140, 20);

        lbobjetos.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        lbobjetos.setText("Cantidad objetos:");
        registroventas.add(lbobjetos);
        lbobjetos.setBounds(120, 240, 130, 20);

        txtobjetos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtobjetosKeyTyped(evt);
            }
        });
        registroventas.add(txtobjetos);
        txtobjetos.setBounds(310, 240, 140, 30);

        lbmonto.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        lbmonto.setText("Monto Total:");
        registroventas.add(lbmonto);
        lbmonto.setBounds(120, 290, 90, 20);

        txtmonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmontoKeyTyped(evt);
            }
        });
        registroventas.add(txtmonto);
        txtmonto.setBounds(310, 290, 140, 30);

        btnsalir16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar.png"))); // NOI18N
        btnsalir16.setContentAreaFilled(false);
        btnsalir16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar (Copiar).png"))); // NOI18N
        btnsalir16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir16ActionPerformed(evt);
            }
        });
        registroventas.add(btnsalir16);
        btnsalir16.setBounds(0, 10, 93, 69);

        titulo2.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        titulo2.setText("Registro de Ventas");
        registroventas.add(titulo2);
        titulo2.setBounds(250, 10, 220, 40);

        nuevo1.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        nuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/nuevo-documento (Copiar).png"))); // NOI18N
        nuevo1.setText("nuevo ");
        nuevo1.setContentAreaFilled(false);
        nuevo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nuevo1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/nuevo-documento (Copiar) (Copiar).png"))); // NOI18N
        nuevo1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        nuevo1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo1ActionPerformed(evt);
            }
        });
        registroventas.add(nuevo1);
        nuevo1.setBounds(590, 100, 93, 100);

        cancelar1.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        cancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/portapapeles (Copiar).png"))); // NOI18N
        cancelar1.setText("cancelar");
        cancelar1.setContentAreaFilled(false);
        cancelar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/portapapeles (Copiar) (Copiar).png"))); // NOI18N
        cancelar1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cancelar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar1ActionPerformed(evt);
            }
        });
        registroventas.add(cancelar1);
        cancelar1.setBounds(590, 220, 93, 100);

        registros.add(registroventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 510));

        bienvenido.setBackground(new java.awt.Color(255, 255, 255));
        bienvenido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        bienvenido.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/logotipo (Copiar).png"))); // NOI18N
        bienvenido.add(jLabel4);
        jLabel4.setBounds(150, 110, 350, 250);

        jLabel5.setFont(new java.awt.Font("Wide Latin", 3, 36)); // NOI18N
        jLabel5.setText("\"Bienvenido\"");
        bienvenido.add(jLabel5);
        jLabel5.setBounds(160, 20, 420, 90);

        jLabel59.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel59.setText("Versión 1.0 ");
        bienvenido.add(jLabel59);
        jLabel59.setBounds(20, 470, 170, 30);

        registros.add(bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 510));

        nuevo.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/nuevo-documento (Copiar).png"))); // NOI18N
        nuevo.setText("nuevo ");
        nuevo.setContentAreaFilled(false);
        nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/nuevo-documento (Copiar) (Copiar).png"))); // NOI18N
        nuevo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        nuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        registros.add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, -1, 100));

        cancelar.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/portapapeles (Copiar).png"))); // NOI18N
        cancelar.setText("cancelar");
        cancelar.setContentAreaFilled(false);
        cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/portapapeles (Copiar) (Copiar).png"))); // NOI18N
        cancelar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        registros.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 100, 100));

        lbtitulo.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbtitulo.setText("Registro de clientes y ventas");
        registros.add(lbtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 280, 30));

        lbtelefono.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        lbtelefono.setText("Telefono:");
        registros.add(lbtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 70, -1));

        lbnombre.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        lbnombre.setText("Nombre:");
        registros.add(lbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 70, 20));

        lbap_pat.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        lbap_pat.setText("Apellido_pat:");
        registros.add(lbap_pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 100, 20));

        lbap_mat.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        lbap_mat.setText("Apeliido_mat:");
        registros.add(lbap_mat, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 110, -1));

        lbmunicipio.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        lbmunicipio.setText("Municipio:");
        registros.add(lbmunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 80, -1));

        lblocalidad.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        lblocalidad.setText("Localidad:");
        registros.add(lblocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 80, -1));

        lbcalle.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        lbcalle.setText("Calle:");
        registros.add(lbcalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 50, -1));

        lbcasa.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        lbcasa.setText("No_casa:");
        registros.add(lbcasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 70, -1));

        lbfolio.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        lbfolio.setText("Folio:");
        registros.add(lbfolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 40, 20));

        txtfolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfolioActionPerformed(evt);
            }
        });
        txtfolio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfolioKeyTyped(evt);
            }
        });
        registros.add(txtfolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 140, 30));

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        registros.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 140, 30));

        txtap_pat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtap_patKeyTyped(evt);
            }
        });
        registros.add(txtap_pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 140, 30));

        txtap_mat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtap_matKeyTyped(evt);
            }
        });
        registros.add(txtap_mat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 140, 30));

        txtmunicipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmunicipioKeyTyped(evt);
            }
        });
        registros.add(txtmunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 140, 30));

        txtlocalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtlocalidadKeyTyped(evt);
            }
        });
        registros.add(txtlocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 140, 30));

        txtcalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcalleKeyTyped(evt);
            }
        });
        registros.add(txtcalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 140, 30));

        txtcasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcasaKeyTyped(evt);
            }
        });
        registros.add(txtcasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 140, 30));

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        registros.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 140, 30));

        btnsalir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar.png"))); // NOI18N
        btnsalir2.setContentAreaFilled(false);
        btnsalir2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/regresar (Copiar).png"))); // NOI18N
        btnsalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir2ActionPerformed(evt);
            }
        });
        registros.add(btnsalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 70));

        guardarcliente.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        guardarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/boton-guardar (Copiar).png"))); // NOI18N
        guardarcliente.setText("Guardar_c");
        guardarcliente.setContentAreaFilled(false);
        guardarcliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guardarcliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/boton-guardar (Copiar) (Copiar).png"))); // NOI18N
        guardarcliente.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        guardarcliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        guardarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarclienteActionPerformed(evt);
            }
        });
        registros.add(guardarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 100, 100));

        jLabel34.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel34.setText("Fecha_lim:");
        registros.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(registros);
        registros.setBounds(230, 0, 710, 510);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Elige una opcion : ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 40, 150, 20);

        btncambios.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btncambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/recibo (Copiar).png"))); // NOI18N
        btncambios.setText("Cambios");
        btncambios.setContentAreaFilled(false);
        btncambios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncambios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/recibo (Copiar)_1.png"))); // NOI18N
        btncambios.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btncambios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncambiosActionPerformed(evt);
            }
        });
        jPanel1.add(btncambios);
        btncambios.setBounds(120, 240, 90, 100);

        btneliminar.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/basura (Copiar).png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.setContentAreaFilled(false);
        btneliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btneliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/basura (Copiar)_1.png"))); // NOI18N
        btneliminar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btneliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btneliminar);
        btneliminar.setBounds(10, 240, 100, 100);

        btnregistros.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btnregistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/factura (Copiar).png"))); // NOI18N
        btnregistros.setText("Registro");
        btnregistros.setContentAreaFilled(false);
        btnregistros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnregistros.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/factura (Copiar)_1.png"))); // NOI18N
        btnregistros.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnregistros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnregistros.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnregistrosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnregistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrosActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistros);
        btnregistros.setBounds(10, 100, 100, 110);

        btnpagos.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btnpagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/metodo-de-pago (Copiar).png"))); // NOI18N
        btnpagos.setText("Pagos");
        btnpagos.setContentAreaFilled(false);
        btnpagos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpagos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/metodo-de-pago (Copiar)_1.png"))); // NOI18N
        btnpagos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnpagos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnpagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpagosActionPerformed(evt);
            }
        });
        jPanel1.add(btnpagos);
        btnpagos.setBounds(130, 100, 80, 100);

        btnsalir.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/flecha_regresar.png"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.setToolTipText("");
        btnsalir.setContentAreaFilled(false);
        btnsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/flecha_regresar (Copiar).png"))); // NOI18N
        btnsalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnsalir);
        btnsalir.setBounds(20, 360, 70, 110);

        btnbusqueda.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btnbusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/candidato (Copiar).png"))); // NOI18N
        btnbusqueda.setText("Consultas");
        btnbusqueda.setContentAreaFilled(false);
        btnbusqueda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbusqueda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/candidato (Copiar) (Copiar).png"))); // NOI18N
        btnbusqueda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbusquedaActionPerformed(evt);
            }
        });
        jPanel1.add(btnbusqueda);
        btnbusqueda.setBounds(120, 360, 100, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 230, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnregistrosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btnregistrosAncestorAdded

    private void btnregistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrosActionPerformed
        registros.setVisible(true);
        menuregistros.setVisible(true);
        bienvenido.setVisible(false);
        btnpagos.setEnabled(false);
        btneliminar.setEnabled(false);
        btncambios.setEnabled(false);
        btnbusqueda.setEnabled(false);
        btnsalir.setEnabled(false);
        calendario.setVisible(true);
    }//GEN-LAST:event_btnregistrosActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
    VentanaAcceso abrir= new VentanaAcceso();
    abrir.setVisible(true);
    this.setVisible(false); 
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txtfolioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfolioKeyTyped
        if(txtfolio.getText().length()>4)
            evt.consume();
    }//GEN-LAST:event_txtfolioKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && Character.isDigit(evt.getKeyChar()))
            evt.consume();
        if(txtnombre.getText().length()>49)
            evt.consume();
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtap_patKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtap_patKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && Character.isDigit(evt.getKeyChar()))
            evt.consume();
        if(txtap_pat.getText().length()>29)
            evt.consume();
    }//GEN-LAST:event_txtap_patKeyTyped

    private void txtap_matKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtap_matKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && Character.isDigit(evt.getKeyChar()))
            evt.consume();
        if(txtap_mat.getText().length()>19)
            evt.consume();
    }//GEN-LAST:event_txtap_matKeyTyped

    private void txtmunicipioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmunicipioKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && Character.isDigit(evt.getKeyChar()))
            evt.consume();
        if(txtmunicipio.getText().length()>29)
            evt.consume();
    }//GEN-LAST:event_txtmunicipioKeyTyped

    private void txtlocalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlocalidadKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && Character.isDigit(evt.getKeyChar()))
            evt.consume();
        if(txtlocalidad.getText().length()>14)
            evt.consume();
    }//GEN-LAST:event_txtlocalidadKeyTyped

    private void txtcalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcalleKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && Character.isDigit(evt.getKeyChar()))
            evt.consume();
        if(txtcalle.getText().length()>49)
            evt.consume();
    }//GEN-LAST:event_txtcalleKeyTyped

    private void txtcasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcasaKeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
        if(txtcasa.getText().length()>4)
            evt.consume();
    }//GEN-LAST:event_txtcasaKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
        if(txttelefono.getText().length()>9)
            evt.consume();
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtventaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtventaKeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
        if(txtventa.getText().length()>4)
            evt.consume();
    }//GEN-LAST:event_txtventaKeyTyped

    private void txtobjetosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtobjetosKeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
        if(txtobjetos.getText().length()>4)
            evt.consume();
    }//GEN-LAST:event_txtobjetosKeyTyped

    private void txtmontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmontoKeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
        if(txtmonto.getText().length()>5)
            evt.consume();
    }//GEN-LAST:event_txtmontoKeyTyped

    private void btnsalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir2ActionPerformed
        bienvenido.setVisible(false); 
        registros.setVisible(true);
        menuregistros.setVisible(true);
        btnpagos.setEnabled(true);
        btneliminar.setEnabled(true);
        btncambios.setEnabled(true);
        btnbusqueda.setEnabled(true);
        btnsalir.setEnabled(true);
        ///////////////////////////
        txtfolio.setEnabled(false);
        txtnombre.setEnabled(false);
        txtap_pat.setEnabled(false);
        txtap_mat.setEnabled(false);
        txtlocalidad.setEnabled(false);
        txtmunicipio.setEnabled(false);
        txtcalle.setEnabled(false);
        txtcasa.setEnabled(false);
        txttelefono.setEnabled(false);
    }//GEN-LAST:event_btnsalir2ActionPerformed

    private void btnpagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagosActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(true);
        btnregistros.setEnabled(false);
        btneliminar.setEnabled(false);
        btncambios.setEnabled(false);
        btnbusqueda.setEnabled(false);
        btnsalir.setEnabled(false);
        txtpago.setEnabled(false);
        txttotalpagar.setEnabled(false);
        txtpagado.setEnabled(false);
        txtporpagar.setEnabled(false);
        fecha_lim.setEnabled(false);
        fecha_pag.setEnabled(false);
        no_venta1.setEnabled(false);
    }//GEN-LAST:event_btnpagosActionPerformed

    private void btnsalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir3ActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(true);
        pagos.setVisible(false);
        btnregistros.setEnabled(true);
        btneliminar.setEnabled(true);
        btncambios.setEnabled(true);
        btnbusqueda.setEnabled(true);
        btnsalir.setEnabled(true);
    }//GEN-LAST:event_btnsalir3ActionPerformed

    private void txtpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpagoActionPerformed

    private void txtpagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpagadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpagadoActionPerformed

    private void txtporpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtporpagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtporpagarActionPerformed

    private void btnguardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar2ActionPerformed
                txtpagado.setEnabled(false);
                txttotalpagar.setEnabled(false);
                txtpagado.setEnabled(false);
                txtporpagar.setEnabled(false);
                fecha_lim.setEnabled(false);
                fecha_pag.setEnabled(false);
                pag=txtpago.getText();
                total_pag=Float.parseFloat(txttotalpagar.getText());
                pagado=Float.parseFloat(txtpagado.getText());
                porpagar=Float.parseFloat(txtporpagar.getText());
                venta1=Integer.parseInt(no_venta1.getText());
                conexion cc= new conexion();
                Connection cn=cc.conexion();
                String sql="";              
                sql="INSERT INTO pagos (pago,total_p,pagado,pagar,fecha_lim,fecha_pag,no_venta) VALUES (?,?,?,?,?,?,?)";
            try {
                PreparedStatement pst=cn.prepareStatement(sql);
                pst.setString(1,pag);
                pst.setFloat(2,total_pag);
                pst.setFloat(3,pagado);
                pst.setFloat(4,porpagar);
                pst.setString(5,((JTextField)fecha_lim.getDateEditor().getUiComponent()).getText());
                pst.setString(6,((JTextField)fecha_pag.getDateEditor().getUiComponent()).getText());
                pst.setInt(7,venta1);
                int n=pst.executeUpdate();  
                if(n>0){
                    JOptionPane.showMessageDialog(null,"Registro Guardado");
                    txtpago.setText(null);
                    txttotalpagar.setText(null);
                    txtpagado.setText(null);
                    txtporpagar.setText(null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Registro no guardado");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Error");
            }
    }//GEN-LAST:event_btnguardar2ActionPerformed

    private void txttotalpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalpagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalpagarActionPerformed

    private void txtpagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpagoKeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
        if(txtpago.getText().length()>5)
            evt.consume();
    }//GEN-LAST:event_txtpagoKeyTyped

    private void txttotalpagarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttotalpagarKeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
        if(txttotalpagar.getText().length()>5)
            evt.consume();
    }//GEN-LAST:event_txttotalpagarKeyTyped

    private void txtpagadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpagadoKeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
        if(txtpagado.getText().length()>5)
            evt.consume();
    }//GEN-LAST:event_txtpagadoKeyTyped

    private void txtporpagarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtporpagarKeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
        if(txtporpagar.getText().length()>5)
            evt.consume();
    }//GEN-LAST:event_txtporpagarKeyTyped

    private void guardarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarclienteActionPerformed
        folio=txtfolio.getText();
        nombre=txtnombre.getText();
        ap_pat=txtap_pat.getText();
        ap_mat=txtap_mat.getText();
        municipio=txtmunicipio.getText();
        localidad=txtlocalidad.getText();
        calle=txtcalle.getText();
        no_casa=txtcasa.getText();
        telefono=txttelefono.getText();
        conexion cc= new conexion();
        Connection cn=cc.conexion();
        String sql="";      
        sql="INSERT INTO cliente (folio,Nombre,Ap_pat,Ap_mat,Municipio,Localidad,Calle,No_casa,Telefono) VALUES (?,?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement pst=cn.prepareStatement(sql);
                pst.setString(1,folio);
                pst.setString(2,nombre);
                pst.setString(3,ap_pat);
                pst.setString(4,ap_mat);
                pst.setString(5,municipio);
                pst.setString(6,localidad);
                pst.setString(7,calle);
                pst.setString(8,no_casa);
                pst.setString(9,telefono);
                int n=pst.executeUpdate();
                if(n>0){
                    JOptionPane.showMessageDialog(null,"Registro Guardado");
                    bloquear();
                    txtfolio.setText(null);
                    txtnombre.setText(null);
                    txtap_pat.setText(null);
                    txtap_mat.setText(null);
                    txtmunicipio.setText(null);
                    txtlocalidad.setText(null);
                    txtcalle.setText(null);
                    txtcasa.setText(null);
                    txttelefono.setText(null);
                    guardarventa.setEnabled(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }               
          
    }//GEN-LAST:event_guardarclienteActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
    desbloquear();
    txtfolio.requestFocus();
    }//GEN-LAST:event_nuevoActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        bloquear();
    }//GEN-LAST:event_cancelarActionPerformed

    private void txtfolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfolioActionPerformed

        txtfolio.transferFocus();
    }//GEN-LAST:event_txtfolioActionPerformed

    private void btnsalir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir5ActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(true);
        pagos.setVisible(false);
        eliminar.setVisible(false);
        btnregistros.setEnabled(true);
        btnpagos.setEnabled(true);
        btncambios.setEnabled(true);
        btnbusqueda.setEnabled(true);
        btnsalir.setEnabled(true);
    }//GEN-LAST:event_btnsalir5ActionPerformed

    private void btnclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclienteActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(true);
        eliminarclientes.setVisible(true);
        eliminarcliente.setEnabled(false);
        txtap_pat2.setEnabled(false);
        txtap_mat2.setEnabled(false);
        txtap_mat2.setEnabled(false);
        txtmunicipio2.setEnabled(false);
        txtlocalidad2.setEnabled(false);
        txtcalle2.setEnabled(false);
        txtcasa2.setEnabled(false);
        txttelefono2.setEnabled(false);
        cancelar3.setEnabled(false);
        txtnombre2.setEnabled(false);
        
    }//GEN-LAST:event_btnclienteActionPerformed

    private void btnventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnventaActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(true);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(true);
        ///////////////////////
        txtelfecha.setEnabled(false);
        txtelobjetos.setEnabled(false);
        txtelmonto.setEnabled(false);
        eliminarventas.setEnabled(false);
        cancelar4.setEnabled(false);
    }//GEN-LAST:event_btnventaActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(true);
        btnregistros.setEnabled(false);
        btnpagos.setEnabled(false);
        btncambios.setEnabled(false);
        btnbusqueda.setEnabled(false);
        btnsalir.setEnabled(false);
        
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txttelefono2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefono2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefono2ActionPerformed

    private void txtfolio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfolio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfolio2ActionPerformed

    private void txtnombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre2ActionPerformed

    private void txtap_pat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtap_pat2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtap_pat2ActionPerformed

    private void txtap_mat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtap_mat2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtap_mat2ActionPerformed

    private void txtmunicipio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmunicipio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmunicipio2ActionPerformed

    private void txtlocalidad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlocalidad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlocalidad2ActionPerformed

    private void txtcalle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcalle2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcalle2ActionPerformed

    private void txtcasa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcasa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcasa2ActionPerformed

    private void btnsalir6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir6ActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(true);
        eliminarclientes.setVisible(false);
    }//GEN-LAST:event_btnsalir6ActionPerformed

    private void btnsalir7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir7ActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(true);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(false);
    }//GEN-LAST:event_btnsalir7ActionPerformed

    private void txtelfechaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtelfechaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtelfechaliActionPerformed

    private void btnsalir8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir8ActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(true);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(false);
        eliminarpago.setVisible(false);
    }//GEN-LAST:event_btnsalir8ActionPerformed

    private void btnpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagoActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(true);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(false);
        eliminarpago.setVisible(true);
        /////////////////////////////
        txteltotal.setEnabled(false);
        txtelpagado.setEnabled(false);
        txtelporpagar.setEnabled(false);
        txtelfechali.setEnabled(false);
        txtelfechap.setEnabled(false);
        cancelar5.setEnabled(false);
        eliminarpagos.setEnabled(false);
    }//GEN-LAST:event_btnpagoActionPerformed

    private void btncliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncliente2ActionPerformed
        cambiarcliente.setEnabled(false);
        limpiar1.setEnabled(false);
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(false);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(false);
        eliminarpago.setVisible(false);
        cambios.setVisible(true);
        cambiosclientes.setVisible(true);
        nombre3.setEnabled(false);
        ap_pat3.setEnabled(false);
        ap_mat3.setEnabled(false);
        municipio3.setEnabled(false);
        localidad3.setEnabled(false);
        calle3.setEnabled(false);
        casa3.setEnabled(false);
        telefono3.setEnabled(false);
    }//GEN-LAST:event_btncliente2ActionPerformed

    private void btnventa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnventa2ActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(false);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(false);
        eliminarpago.setVisible(false);
        cambios.setVisible(true);
        cambiosclientes.setVisible(false);
        cambiosventas.setVisible(true);
        //////////////
        fecha3.setEnabled(false);
        objetos3.setEnabled(false);
        monto3.setEnabled(false);
    }//GEN-LAST:event_btnventa2ActionPerformed

    private void btnpago2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpago2ActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(false);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(false);
        eliminarpago.setVisible(false);
        cambios.setVisible(true);
        cambiosclientes.setVisible(false);
        cambiosventas.setVisible(false);
        cambiospagos.setVisible(true);
        ////////////////////////////////
        total3.setEnabled(false);
        pagado3.setEnabled(false);
        pagar3.setEnabled(false);
        fecha_lim3.setEnabled(false);
        fecha_p3.setEnabled(false);
    }//GEN-LAST:event_btnpago2ActionPerformed

    private void btnsalir9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir9ActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(true);
        pagos.setVisible(false);
        eliminar.setVisible(false);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(false);
        eliminarpago.setVisible(false);
        cambios.setVisible(false);
        btnregistros.setEnabled(true);
        btnpagos.setEnabled(true);
        btneliminar.setEnabled(true);
        btnbusqueda.setEnabled(true);
        btnsalir.setEnabled(true);
    }//GEN-LAST:event_btnsalir9ActionPerformed

    private void btncambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncambiosActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(false);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(false);
        eliminarpago.setVisible(false);
        cambios.setVisible(true);
        btnregistros.setEnabled(false);
        btnpagos.setEnabled(false);
        btneliminar.setEnabled(false);
        btnbusqueda.setEnabled(false);
        btnsalir.setEnabled(false);
        
        
    }//GEN-LAST:event_btncambiosActionPerformed

    private void cambiarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarclienteActionPerformed
        conexion cc= new conexion();
        Connection cn=cc.conexion();
        String sql="";      
        sql="UPDATE cliente SET Nombre='"+nombre3.getText()+"',Ap_pat='"+ap_pat3.getText()+"',Ap_mat='"+ap_mat3.getText()+"',Municipio='"+municipio3.getText()+"',Localidad='"+localidad3.getText()+"',Calle='"+calle3.getText()+"',No_casa='"+casa3.getText()+"',Telefono='"+telefono3.getText()+"' WHERE folio="+folio3.getText();
            try {
                PreparedStatement pst=cn.prepareStatement(sql);
                int res=pst.executeUpdate();
                if(res>0){
                    JOptionPane.showMessageDialog(null,"Los datos han sidos modificados");
                }
                else{
                   JOptionPane.showMessageDialog(null,"Los datos no han sido modificados"); 
                }
            } catch (SQLException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Error");
            }            
    }//GEN-LAST:event_cambiarclienteActionPerformed

    private void btnsalir10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir10ActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(false);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(false);
        eliminarpago.setVisible(false);
        cambios.setVisible(true);
        cambiosclientes.setVisible(false);
    }//GEN-LAST:event_btnsalir10ActionPerformed

    private void cambiarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarventaActionPerformed
        conexion cc= new conexion();
        Connection cn=cc.conexion();
        String sql="";      
        sql="UPDATE venta SET fecha='"+fecha3.getText()+"',c_objetos='"+objetos3.getText()+"',monto_t='"+monto3.getText()+"' WHERE no_venta="+venta3.getText();
            try {
                PreparedStatement pst=cn.prepareStatement(sql);
                int res=pst.executeUpdate();
                if(res>0){
                    JOptionPane.showMessageDialog(null,"Los datos han sidos modificados");
                }
                else{
                   JOptionPane.showMessageDialog(null,"Los datos no han sido modificados"); 
                }
            } catch (SQLException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Error");
            }  
    }//GEN-LAST:event_cambiarventaActionPerformed

    private void btnsalir11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir11ActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(false);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(false);
        eliminarpago.setVisible(false);
        cambios.setVisible(true);
        cambiosclientes.setVisible(false);
        cambiosventas.setVisible(false);
    }//GEN-LAST:event_btnsalir11ActionPerformed

    private void cambiarpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarpagoActionPerformed
        conexion cc= new conexion();
        Connection cn=cc.conexion();
        String sql="";      
        sql="UPDATE pagos SET total_p='"+total3.getText()+"',pagado='"+pagado3.getText()+"',pagar='"+pagar3.getText()+"',fecha_lim='"+fecha_lim3.getText()+"',fecha_pag='"+fecha_p3.getText()+"' WHERE pago="+pago3.getText();
            try {
                PreparedStatement pst=cn.prepareStatement(sql);
                int res=pst.executeUpdate();
                if(res>0){
                    JOptionPane.showMessageDialog(null,"Los datos han sidos modificados");
                }
                else{
                   JOptionPane.showMessageDialog(null,"Los datos no han sido modificados"); 
                }
            } catch (SQLException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Error");
            }  
    }//GEN-LAST:event_cambiarpagoActionPerformed

    private void btnsalir12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir12ActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(false);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(false);
        eliminarpago.setVisible(false);
        cambios.setVisible(true);
        cambiosclientes.setVisible(false);
        cambiosventas.setVisible(false);
        cambiospagos.setVisible(false);
        
    }//GEN-LAST:event_btnsalir12ActionPerformed

    private void btncliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncliente1ActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(false);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(false);
        eliminarpago.setVisible(false);
        cambios.setVisible(false);
        cambiosclientes.setVisible(false);
        cambiosventas.setVisible(false);
        cambiospagos.setVisible(false);
        busquedas.setVisible(true);
        calendario.setVisible(false);
        busquedasclientes.setVisible(true);
    }//GEN-LAST:event_btncliente1ActionPerformed

    private void btnventa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnventa1ActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(false);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(false);
        eliminarpago.setVisible(false);
        cambios.setVisible(false);
        cambiosclientes.setVisible(false);
        cambiosventas.setVisible(false);
        cambiospagos.setVisible(false);
        busquedas.setVisible(true);
        calendario.setVisible(false);
        busquedasclientes.setVisible(false);
        busquedasventas.setVisible(true);
    }//GEN-LAST:event_btnventa1ActionPerformed

    private void btnpago1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpago1ActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(false);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(false);
        eliminarpago.setVisible(false);
        cambios.setVisible(false);
        cambiosclientes.setVisible(false);
        cambiosventas.setVisible(false);
        cambiospagos.setVisible(false);
        busquedas.setVisible(true);
        calendario.setVisible(false);
        busquedasclientes.setVisible(false);
        busquedasventas.setVisible(false);
        busquedaspagos.setVisible(true);
    }//GEN-LAST:event_btnpago1ActionPerformed

    private void btnsalir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir4ActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(true);
        pagos.setVisible(false);
        eliminar.setVisible(false);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(false);
        eliminarpago.setVisible(false);
        cambios.setVisible(false);
        cambiosclientes.setVisible(false);
        cambiosventas.setVisible(false);
        cambiospagos.setVisible(false);
        busquedas.setVisible(false);
        calendario.setVisible(false);
        btnregistros.setEnabled(true);
        btnpagos.setEnabled(true);
        btneliminar.setEnabled(true);
        btncambios.setEnabled(true);
        btnsalir.setEnabled(true);
    }//GEN-LAST:event_btnsalir4ActionPerformed

    private void btnbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbusquedaActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(false);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(false);
        eliminarpago.setVisible(false);
        cambios.setVisible(false);
        cambiosclientes.setVisible(false);
        cambiosventas.setVisible(false);
        cambiospagos.setVisible(false);
        busquedas.setVisible(true);
        calendario.setVisible(false);
        btnregistros.setEnabled(false);
        btnpagos.setEnabled(false);
        btneliminar.setEnabled(false);
        btncambios.setEnabled(false);
        btnsalir.setEnabled(false);
    }//GEN-LAST:event_btnbusquedaActionPerformed

    private void btnsalir13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir13ActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(false);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(false);
        eliminarpago.setVisible(false);
        cambios.setVisible(false);
        cambiosclientes.setVisible(false);
        cambiosventas.setVisible(false);
        cambiospagos.setVisible(false);
        busquedas.setVisible(true);
        calendario.setVisible(false);
        busquedasclientes.setVisible(false);
    }//GEN-LAST:event_btnsalir13ActionPerformed

    private void btnsalir14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir14ActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(false);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(false);
        eliminarpago.setVisible(false);
        cambios.setVisible(false);
        cambiosclientes.setVisible(false);
        cambiosventas.setVisible(false);
        cambiospagos.setVisible(false);
        busquedas.setVisible(true);
        calendario.setVisible(false);
        busquedasclientes.setVisible(false);
        busquedasventas.setVisible(false);
    }//GEN-LAST:event_btnsalir14ActionPerformed

    private void buscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarclienteActionPerformed
        eliminarcliente.setEnabled(true);
        cancelar3.setEnabled(true);

    }//GEN-LAST:event_buscarclienteActionPerformed

    private void eliminarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarclienteActionPerformed
    
    }//GEN-LAST:event_eliminarclienteActionPerformed

    private void guardarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarventaActionPerformed
        no_venta=Integer.parseInt(txtventa.getText());
        objetos=Integer.parseInt(txtobjetos.getText());
        monto=Float.parseFloat(txtmonto.getText());
        folio=txtfolio.getText();
        conexion cc= new conexion();
        Connection cn=cc.conexion();
        String sql="";
        sql="INSERT INTO venta (no_venta,fecha,c_objetos,monto_t,folio) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement pst=cn.prepareStatement(sql);
            pst.setInt(1,no_venta);
            pst.setString(2,((JTextField)calendario.getDateEditor().getUiComponent()).getText());
            pst.setInt(3,objetos);
            pst.setFloat(4,monto);
            pst.setString(5,folio);
            int n=pst.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null,"Registro Guardado");
                txtventa.setText(null);
                txtobjetos.setText(null);
                txtmonto.setText(null);
                bloquear();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_guardarventaActionPerformed

    private void nuevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo2ActionPerformed
        txtpago.setEnabled(true);
        txttotalpagar.setEnabled(true);
        txtpagado.setEnabled(true);
        txtporpagar.setEnabled(true);
        fecha_lim.setEnabled(true);
        fecha_pag.setEnabled(true);
        no_venta1.setEnabled(true);
    }//GEN-LAST:event_nuevo2ActionPerformed

    private void cancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar2ActionPerformed
        txtpago.setText(null);
        txttotalpagar.setText(null);
        txtpagado.setText(null);
        txtporpagar.setText(null);
        txtpago.setEnabled(false);
        txttotalpagar.setEnabled(false);
        txtpagado.setEnabled(false);
        txtporpagar.setEnabled(false);
        fecha_lim.setEnabled(false);
        fecha_pag.setEnabled(false);
    }//GEN-LAST:event_cancelar2ActionPerformed

    private void cancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar3ActionPerformed
        txtfolio2.setText(null);
        txtnombre2.setText(null);
        txtap_pat2.setText(null);
        txtap_mat2.setText(null);
        txtmunicipio2.setText(null);
        txtlocalidad2.setText(null);
        txtcalle2.setText(null);
        txtcasa2.setText(null);
        txttelefono2.setText(null);
        cancelar3.setEnabled(false);
        eliminarcliente.setEnabled(false);
    }//GEN-LAST:event_cancelar3ActionPerformed

    private void cancelar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar4ActionPerformed
        txtelventa.setText(null);
        txtelfecha.setText(null);
        txtelobjetos.setText(null);
        txtelmonto.setText(null);
        txtelfecha.setEnabled(false);
        txtelobjetos.setEnabled(false);
        txtelmonto.setEnabled(false);
        eliminarventas.setEnabled(false);
        cancelar4.setEnabled(false);        
    }//GEN-LAST:event_cancelar4ActionPerformed

    private void buscarventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarventasActionPerformed
        txtelfecha.setEnabled(false);
        txtelobjetos.setEnabled(false);
        txtelmonto.setEnabled(false);
        eliminarventas.setEnabled(true);
        cancelar4.setEnabled(true);
        conexion cc= new conexion();
        Connection cn=cc.conexion();
        String sql="";
        sql="SELECT * FROM venta WHERE no_venta=?";
        try{
            PreparedStatement pst=cn.prepareStatement(sql);
            pst.setString(1,txtelventa.getText());
            res=pst.executeQuery();
            if(res.next()){
                txtelfecha.setText(res.getString("fecha"));
                txtelobjetos.setText(res.getString("c_objetos"));
                txtelmonto.setText(res.getString("monto_t"));
                 JOptionPane.showMessageDialog(null,"Venta encontrada");
            }
            else{
              JOptionPane.showMessageDialog(null,"Venta no encontrada");  
            }
        }catch (SQLException ex){
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error");
        }
    }//GEN-LAST:event_buscarventasActionPerformed

    private void cancelar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar5ActionPerformed
        cancelar5.setEnabled(false);
        eliminarpagos.setEnabled(false);
        txtelpago.setText(null);
        txtelpagado.setText(null);
        txtelporpagar.setText(null);
        txteltotal.setText(null);
        txtelfechali.setText(null);
        txtelfechap.setText(null);
    }//GEN-LAST:event_cancelar5ActionPerformed

    private void buscarpagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarpagosActionPerformed
        cancelar5.setEnabled(true);
        eliminarpagos.setEnabled(true);
        conexion cc= new conexion();
        Connection cn=cc.conexion();
        String sql="";
        sql="SELECT * FROM pagos WHERE pago=?";
        try{
            PreparedStatement pst=cn.prepareStatement(sql);
            pst.setString(1,txtelpago.getText());
            res=pst.executeQuery();
            if(res.next()){
                txteltotal.setText(res.getString("total_p"));
                txtelpagado.setText(res.getString("pagado"));
                txtelporpagar.setText(res.getString("pagar"));
                txtelfechali.setText(res.getString("fecha_lim"));
                txtelfechap.setText(res.getString("fecha_pag"));
                 JOptionPane.showMessageDialog(null,"Pago encontrado");
            }
            else{
              JOptionPane.showMessageDialog(null,"Pago no encontrado");  
              
            }
        }catch (SQLException ex){
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error");
        }
    }//GEN-LAST:event_buscarpagosActionPerformed

    private void buscarclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarclienteMouseClicked
        folio=txtfolio2.getText();
        conexion cc= new conexion();
        Connection cn=cc.conexion();
        String sql="";
        sql="SELECT * FROM cliente WHERE folio=?";
        try{
            PreparedStatement pst=cn.prepareStatement(sql);
            pst.setString(1,txtfolio2.getText());
            res=pst.executeQuery();
            if(res.next()){
                txtfolio2.setText(res.getString("folio"));
                txtnombre2.setText(res.getString("Nombre"));
                txtap_pat2.setText(res.getString("Ap_pat"));
                txtap_mat2.setText(res.getString("Ap_mat"));
                txtmunicipio2.setText(res.getString("Municipio"));
                txtlocalidad2.setText(res.getString("Localidad"));
                txtcalle2.setText(res.getString("Calle"));
                txtcasa2.setText(res.getString("No_casa"));
                txttelefono2.setText(res.getString("Telefono"));
                 JOptionPane.showMessageDialog(null,"Cliente encontrado");
            }
            else{
              JOptionPane.showMessageDialog(null,"Cliente no encontrado");  
            }
        }catch (SQLException ex){
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error 404");
        }
    }//GEN-LAST:event_buscarclienteMouseClicked

    private void eliminarclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarclienteMouseClicked
        eliminarcliente.setEnabled(false);
        cancelar3.setEnabled(true);
        conexion cc= new conexion();
        Connection cn=cc.conexion();
        String sql="";
        sql="DELETE FROM cliente WHERE folio=?";
        try{
            PreparedStatement pst=cn.prepareStatement(sql);
            pst.setString(1,txtfolio2.getText());
            int res=pst.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"Cliente eliminado");
                limpiar2();
                cancelar3.setEnabled(false);
                txtfolio2.setText(null);
                txtnombre2.setText(null);
                txtap_pat2.setText(null);
                txtap_mat2.setText(null);
                txtmunicipio2.setText(null);
                txtlocalidad2.setText(null);
                txtcalle2.setText(null);
                txtcasa2.setText(null);
                txttelefono2.setText(null);
            }
            else{
                JOptionPane.showMessageDialog(null,"Error al eliminar cliente");
            }
        }
        catch(SQLException ex){
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error");
        }   
    }//GEN-LAST:event_eliminarclienteMouseClicked

    private void eliminarventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarventasActionPerformed

        conexion cc= new conexion();
        Connection cn=cc.conexion();
        String sql="";
        sql="DELETE FROM venta WHERE no_venta=?";
        try{
            PreparedStatement pst=cn.prepareStatement(sql);
            pst.setString(1,txtelventa.getText());
            int res=pst.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"Venta eliminada");
                limpiar2();
                cancelar4.setEnabled(false);
            }
            else{
                JOptionPane.showMessageDialog(null,"Error al eliminar venta");
            }
        }
        catch(SQLException ex){
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error");
        }     
    }//GEN-LAST:event_eliminarventasActionPerformed

    private void eliminarpagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarpagosActionPerformed
        conexion cc= new conexion();
        Connection cn=cc.conexion();
        String sql="";
        sql="DELETE FROM pagos WHERE pago=?";
        try{
            PreparedStatement pst=cn.prepareStatement(sql);
            pst.setString(1,txtelpago.getText());
            int res=pst.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"Pago eliminado");
                limpiar3();
                cancelar5.setEnabled(false);
            }
            else{
                JOptionPane.showMessageDialog(null,"Error al eliminar el pago");
            }
        }
        catch(SQLException ex){
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error");
        } 
    }//GEN-LAST:event_eliminarpagosActionPerformed

    private void busclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busclienteActionPerformed
        nombre3.setEnabled(true);
        cambiarcliente.setEnabled(true);
        ap_pat3.setEnabled(true);
        ap_mat3.setEnabled(true);
        municipio3.setEnabled(true);
        localidad3.setEnabled(true);
        calle3.setEnabled(true);
        casa3.setEnabled(true);
        telefono3.setEnabled(true);
        conexion cc= new conexion();
        Connection cn=cc.conexion();
        String sql="";
        sql="SELECT * FROM cliente WHERE folio=?";
        try{
            PreparedStatement pst=cn.prepareStatement(sql);
            pst.setString(1,folio3.getText());
            res=pst.executeQuery();
            if(res.next()){
                nombre3.setText(res.getString("Nombre"));
                ap_pat3.setText(res.getString("Ap_pat"));
                ap_mat3.setText(res.getString("Ap_mat"));
                municipio3.setText(res.getString("Municipio"));
                localidad3.setText(res.getString("Localidad"));
                calle3.setText(res.getString("Calle"));
                casa3.setText(res.getString("No_casa"));
                telefono3.setText(res.getString("Telefono"));
                 JOptionPane.showMessageDialog(null,"Cliente encontrado");
                 limpiar1.setEnabled(true);
                 cambiarcliente.setEnabled(true);
            }
            else{
              JOptionPane.showMessageDialog(null,"Cliente no encontrado"); 
              nombre3.setEnabled(false);
              ap_pat3.setEnabled(false);
              ap_mat3.setEnabled(false);
              municipio3.setEnabled(false);
              localidad3.setEnabled(false);
              calle3.setEnabled(false);
              casa3.setEnabled(false);
              telefono3.setEnabled(false);
              limpiar1.setEnabled(false);
              cambiarcliente.setEnabled(false);
            }
        }catch (SQLException ex){
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error 404");
        }
    }//GEN-LAST:event_busclienteActionPerformed

    private void limpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar1ActionPerformed
        folio3.setText(null);
        nombre3.setText(null);
        ap_pat3.setText(null);
        ap_mat3.setText(null);
        municipio3.setText(null);
        localidad3.setText(null);
        calle3.setText(null);
        casa3.setText(null);
        telefono3.setText(null);
        nombre3.setEnabled(false);
        ap_pat3.setEnabled(false);
        ap_mat3.setEnabled(false);
        municipio3.setEnabled(false);
        localidad3.setEnabled(false);
        calle3.setEnabled(false);
        casa3.setEnabled(false);
        telefono3.setEnabled(false);
        limpiar1.setEnabled(false);
        cambiarcliente.setEnabled(false);
    }//GEN-LAST:event_limpiar1ActionPerformed

    private void limpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar2ActionPerformed
        venta3.setText(null);
        fecha3.setText(null);
        objetos3.setText(null);
        monto3.setText(null);
        fecha3.setEnabled(false);
        objetos3.setEnabled(false);
        monto3.setEnabled(false);
        limpiar2.setEnabled(false);
        cambiarventa.setEnabled(false);
    }//GEN-LAST:event_limpiar2ActionPerformed

    private void objetos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_objetos3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_objetos3ActionPerformed

    private void buscarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarventaActionPerformed
        fecha3.setEnabled(true);
        objetos3.setEnabled(true);
        monto3.setEnabled(true);
        conexion cc= new conexion();
        Connection cn=cc.conexion();
        String sql="";
        sql="SELECT * FROM venta WHERE no_venta=?";
        try{
            PreparedStatement pst=cn.prepareStatement(sql);
            pst.setString(1,venta3.getText());
            res=pst.executeQuery();
            if(res.next()){
                fecha3.setText(res.getString("fecha"));
                objetos3.setText(res.getString("c_objetos"));
                monto3.setText(res.getString("monto_t"));
                JOptionPane.showMessageDialog(null,"Venta encontrada");  
            }
            else{
              JOptionPane.showMessageDialog(null,"Venta no encontrada");
              fecha3.setEnabled(false);
              objetos3.setEnabled(false);
              monto3.setEnabled(false);
            }
        }catch (SQLException ex){
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error 404");
        }
    }//GEN-LAST:event_buscarventaActionPerformed

    private void limpiar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar3ActionPerformed
        total3.setEnabled(false);
        pagado3.setEnabled(false);
        pagar3.setEnabled(false);
        fecha_lim3.setEnabled(false);
        fecha_p3.setEnabled(false);
        ////////////////////////////
        pago3.setText(null);
        total3.setText(null);
        pagado3.setText(null);
        pagar3.setText(null);
        fecha_lim3.setText(null);
        fecha_p3.setText(null);
    }//GEN-LAST:event_limpiar3ActionPerformed

    private void fecha_lim3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_lim3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_lim3ActionPerformed

    private void buscarpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarpagoActionPerformed
        total3.setEnabled(true);
        pagado3.setEnabled(true);
        pagar3.setEnabled(true);
        fecha_lim3.setEnabled(true);
        fecha_p3.setEnabled(true);
        conexion cc= new conexion();
        Connection cn=cc.conexion();
        String sql="";
        sql="SELECT * FROM pagos WHERE pago=?";
        try{
            PreparedStatement pst=cn.prepareStatement(sql);
            pst.setString(1,pago3.getText());
            res=pst.executeQuery();
            if(res.next()){
                total3.setText(res.getString("total_p"));
                pagado3.setText(res.getString("pagado"));
                pagar3.setText(res.getString("pagar"));
                fecha_lim3.setText(res.getString("fecha_lim"));
                fecha_p3.setText(res.getString("fecha_pag"));
                JOptionPane.showMessageDialog(null,"Pago encontrado");  
            }
            else{
                JOptionPane.showMessageDialog(null,"Pago no encontrado");  
                total3.setEnabled(false);
                pagado3.setEnabled(false);
                pagar3.setEnabled(false);
                fecha_lim3.setEnabled(false);
                fecha_p3.setEnabled(false);
            }
        }catch (SQLException ex){
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error 404");
        }
        
    }//GEN-LAST:event_buscarpagoActionPerformed

    private void no_venta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_venta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_venta1ActionPerformed

    private void no_venta1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_venta1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_no_venta1KeyTyped

    private void btncliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncliente3ActionPerformed
        registros.setVisible(true);
        menuregistros.setVisible(false);
        bienvenido.setVisible(false);
        btnpagos.setEnabled(false);
        btneliminar.setEnabled(false);
        btncambios.setEnabled(false);
        btnbusqueda.setEnabled(false);
        btnsalir.setEnabled(false);
        calendario.setVisible(true);
    }//GEN-LAST:event_btncliente3ActionPerformed

    private void btnventa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnventa3ActionPerformed
        registros.setVisible(true);
        registroventas.setVisible(true);
        bienvenido.setVisible(false); 
        registros.setVisible(true);
        menuregistros.setVisible(false);
        btnpagos.setEnabled(true);
        btneliminar.setEnabled(true);
        btncambios.setEnabled(true);
        btnbusqueda.setEnabled(true);
        btnsalir.setEnabled(true); 
        ////////////////
        txtventa.setEnabled(false);
        guardarventa.setEnabled(false);
        txtobjetos.setEnabled(false);
        txtmonto.setEnabled(false);
    }//GEN-LAST:event_btnventa3ActionPerformed

    private void btnsalir16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir16ActionPerformed
        registros.setVisible(true);
        registroventas.setVisible(false);
        bienvenido.setVisible(false); 
        registros.setVisible(true);
        menuregistros.setVisible(true);
        btnpagos.setEnabled(true);
        btneliminar.setEnabled(true);
        btncambios.setEnabled(true);
        btnbusqueda.setEnabled(true);
        btnsalir.setEnabled(true); 
    }//GEN-LAST:event_btnsalir16ActionPerformed

    private void nuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo1ActionPerformed
        txtventa.setEnabled(true);
        guardarventa.setEnabled(true);
        txtobjetos.setEnabled(true);
        txtmonto.setEnabled(true);
        calendario.setEnabled(true);
    }//GEN-LAST:event_nuevo1ActionPerformed

    private void cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar1ActionPerformed
        txtventa.setEnabled(false);
        guardarventa.setEnabled(false);
        txtobjetos.setEnabled(false);
        txtmonto.setEnabled(false);
        calendario.setEnabled(false);
        ///////////
        txtventa.setText(null);
        txtobjetos.setText(null);
        txtmonto.setText(null);
    }//GEN-LAST:event_cancelar1ActionPerformed

    private void btnsalir17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir17ActionPerformed
        bienvenido.setVisible(true); 
        registros.setVisible(true);
        menuregistros.setVisible(false);
        btnpagos.setEnabled(true);
        btneliminar.setEnabled(true);
        btncambios.setEnabled(true);
        btnbusqueda.setEnabled(true);
        btnsalir.setEnabled(true);
    }//GEN-LAST:event_btnsalir17ActionPerformed

    private void buscarcliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarcliente1ActionPerformed
        String aa;
        aa=txtdb.getText();
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String [] columnas={"Folio","Nombre","Municipio","Telefono","Localidad","Calle","No. Casa"};
        String [] registro=new String[7];
        String sql;
            DefaultTableModel ModeloTabla = new DefaultTableModel(null,columnas);
        sql = "SELECT folio,Nombre,Municipio,Telefono,Localidad,calle,No_casa from cliente where folio='"+txtdb.getText()+"'";
        if (aa.isEmpty()){
            JOptionPane.showMessageDialog(null,"ERROR CAMPO VACIO");
        }
        else{
            try {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

        while (rs.next()){
            registro[0]=rs.getString("folio");
            registro[1]=rs.getString("Nombre");
            registro[2]=rs.getString("Municipio");
            registro[3]=rs.getString("Telefono");
            registro[4]=rs.getString("Localidad");
            registro[5]=rs.getString("calle");
            registro[6]=rs.getString("No_casa");
            ModeloTabla.addRow(registro);
           
        }
        tablad.setModel(ModeloTabla);
    } catch (SQLException e) {
      //JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);      
      JOptionPane.showMessageDialog(null, "ERROR");
    }
    }  // TODO add your handling code here:
    }//GEN-LAST:event_buscarcliente1ActionPerformed

    private void btnsalir15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir15ActionPerformed
        registros.setVisible(true);
        bienvenido.setVisible(false);
        pagos.setVisible(false);
        eliminar.setVisible(false);
        eliminarclientes.setVisible(false);
        eliminarventa.setVisible(false);
        eliminarpago.setVisible(false);
        cambios.setVisible(false);
        cambiosclientes.setVisible(false);
        cambiosventas.setVisible(false);
        cambiospagos.setVisible(false);
        busquedas.setVisible(true);
        calendario.setVisible(false);
        busquedasclientes.setVisible(false);
        busquedasventas.setVisible(false);
        busquedaspagos.setVisible(false);
    }//GEN-LAST:event_btnsalir15ActionPerformed

    private void buscarpagoscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarpagoscActionPerformed
     String aa;
        aa=txtdb12.getText();
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        String [] columnas={"No. pago","Total_p","Pagado","Pagar","Fecha Limite","Fecha de Pago"};
        String [] registro=new String[6];
        String sql;
            DefaultTableModel ModeloTabla = new DefaultTableModel(null,columnas);
        sql = "SELECT pago,total_p,pagado,pagar,fecha_lim,fecha_pag from pagos where pago='"+txtdb12.getText()+"'";
        if (aa.isEmpty()){
            JOptionPane.showMessageDialog(null,"ERROR CAMPO VACIO");
        }
        else{
            try {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

        while (rs.next()){
            registro[0]=rs.getString("pago");
            registro[1]=rs.getString("total_p");
            registro[2]=rs.getString("pagado");
            registro[3]=rs.getString("pagar");
            registro[4]=rs.getString("fecha_lim");
            registro[5]=rs.getString("fecha_pag");
            ModeloTabla.addRow(registro);
           
        }
        tablad12.setModel(ModeloTabla);
    } catch (SQLException e) {
      //JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);      
      JOptionPane.showMessageDialog(null, "ERROR");
    }
    }  // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarpagoscActionPerformed

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed
        conexion cc=new conexion();
        Connection cn = cc.conexion();
        tablad.disable();
        String [] columnas={"Folio","Nombre","Ap Paterno","Ap Materno","Municipio","Localidad","Calle","No.Casa","Telefono"};
        String [] registro=new String[9];
        String sql;
            DefaultTableModel ModeloTabla = new DefaultTableModel(null,columnas);
        sql = "SELECT * FROM cliente";
        if (tablad.isEnabled()){
            JOptionPane.showMessageDialog(null,"ERROR CAMPO VACIO");
        }
        else{
            try {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

        while (rs.next()){
            registro[0]=rs.getString("folio");
            registro[1]=rs.getString("Nombre");
            registro[2]=rs.getString("Ap_pat");
            registro[3]=rs.getString("Ap_mat");
            registro[4]=rs.getString("Municipio");
            registro[5]=rs.getString("Localidad");
            registro[6]=rs.getString("calle");
            registro[7]=rs.getString("No_casa");
            registro[8]=rs.getString("Telefono");
            ModeloTabla.addRow(registro);
           
        }
        tablad.setModel(ModeloTabla);
    } catch (SQLException e) {
      //JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);      
      JOptionPane.showMessageDialog(null, "ERROR");
    }
    }    // TODO add your handling code here:
    }//GEN-LAST:event_listActionPerformed

    private void buscarventas5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarventas5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarventas5ActionPerformed

    private void listventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listventasActionPerformed
conexion cc=new conexion();
        Connection cn = cc.conexion();
        tablad2.disable();
        String [] columnas={"No. Venta","Fecha","Cantidad Objetos","Monto Total","Folio"};
        String [] registro=new String[5];
        String sql;
            DefaultTableModel ModeloTabla = new DefaultTableModel(null,columnas);
        sql = "SELECT * FROM venta";
        if (tablad2.isEnabled()){
            JOptionPane.showMessageDialog(null,"ERROR CAMPO VACIO");
        }
        else{
            try {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

        while (rs.next()){
            registro[0]=rs.getString("no_venta");
            registro[1]=rs.getString("fecha");
            registro[2]=rs.getString("c_objetos");
            registro[3]=rs.getString("monto_t");
            registro[4]=rs.getString("folio");
            ModeloTabla.addRow(registro);
           
        }
        tablad2.setModel(ModeloTabla);
    } catch (SQLException e) {
      //JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);      
      JOptionPane.showMessageDialog(null, "ERROR");
    }
    }        // TODO add your handling code here:
    }//GEN-LAST:event_listventasActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ap_mat3;
    private javax.swing.JTextField ap_pat3;
    private javax.swing.JPanel bienvenido;
    private javax.swing.JButton btnbusqueda;
    private javax.swing.JButton btncambios;
    private javax.swing.JButton btncliente;
    private javax.swing.JButton btncliente1;
    private javax.swing.JButton btncliente2;
    private javax.swing.JButton btncliente3;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar2;
    private javax.swing.JButton btnpago;
    private javax.swing.JButton btnpago1;
    private javax.swing.JButton btnpago2;
    private javax.swing.JButton btnpagos;
    private javax.swing.JButton btnregistros;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnsalir10;
    private javax.swing.JButton btnsalir11;
    private javax.swing.JButton btnsalir12;
    private javax.swing.JButton btnsalir13;
    private javax.swing.JButton btnsalir14;
    private javax.swing.JButton btnsalir15;
    private javax.swing.JButton btnsalir16;
    private javax.swing.JButton btnsalir17;
    private javax.swing.JButton btnsalir2;
    private javax.swing.JButton btnsalir3;
    private javax.swing.JButton btnsalir4;
    private javax.swing.JButton btnsalir5;
    private javax.swing.JButton btnsalir6;
    private javax.swing.JButton btnsalir7;
    private javax.swing.JButton btnsalir8;
    private javax.swing.JButton btnsalir9;
    private javax.swing.JButton btnventa;
    private javax.swing.JButton btnventa1;
    private javax.swing.JButton btnventa2;
    private javax.swing.JButton btnventa3;
    private javax.swing.JButton buscarcliente;
    private javax.swing.JButton buscarcliente1;
    private javax.swing.JButton buscarpago;
    private javax.swing.JButton buscarpagos;
    private javax.swing.JButton buscarpagosc;
    private javax.swing.JButton buscarventa;
    private javax.swing.JButton buscarventas;
    private javax.swing.JButton buscarventas5;
    private javax.swing.JButton buscliente;
    private javax.swing.JPanel busquedas;
    private javax.swing.JPanel busquedasclientes;
    private javax.swing.JPanel busquedaspagos;
    private javax.swing.JPanel busquedasventas;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JTextField calle3;
    private javax.swing.JButton cambiarcliente;
    private javax.swing.JButton cambiarpago;
    private javax.swing.JButton cambiarventa;
    private javax.swing.JPanel cambios;
    private javax.swing.JPanel cambiosclientes;
    private javax.swing.JPanel cambiospagos;
    private javax.swing.JPanel cambiosventas;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton cancelar1;
    private javax.swing.JButton cancelar2;
    private javax.swing.JButton cancelar3;
    private javax.swing.JButton cancelar4;
    private javax.swing.JButton cancelar5;
    private javax.swing.JTextField casa3;
    private javax.swing.JPanel eliminar;
    private javax.swing.JButton eliminarcliente;
    private javax.swing.JPanel eliminarclientes;
    private javax.swing.JPanel eliminarpago;
    private javax.swing.JButton eliminarpagos;
    private javax.swing.JPanel eliminarventa;
    private javax.swing.JButton eliminarventas;
    private javax.swing.JTextField fecha3;
    private com.toedter.calendar.JDateChooser fecha_lim;
    private javax.swing.JTextField fecha_lim3;
    private javax.swing.JTextField fecha_p3;
    private com.toedter.calendar.JDateChooser fecha_pag;
    private javax.swing.JTextField folio3;
    private javax.swing.JButton guardarcliente;
    private javax.swing.JButton guardarventa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbap_mat;
    private javax.swing.JLabel lbap_pat;
    private javax.swing.JLabel lbcalle;
    private javax.swing.JLabel lbcasa;
    private javax.swing.JLabel lbfecha;
    private javax.swing.JLabel lbfolio;
    private javax.swing.JLabel lblocalidad;
    private javax.swing.JLabel lbmonto;
    private javax.swing.JLabel lbmunicipio;
    private javax.swing.JLabel lbnombre;
    private javax.swing.JLabel lbobjetos;
    private javax.swing.JLabel lbtelefono;
    private javax.swing.JLabel lbtitulo;
    private javax.swing.JLabel lbventa;
    private javax.swing.JButton limpiar1;
    private javax.swing.JButton limpiar2;
    private javax.swing.JButton limpiar3;
    private javax.swing.JButton list;
    private javax.swing.JButton listventas;
    private javax.swing.JTextField localidad3;
    private javax.swing.JPanel menuregistros;
    private javax.swing.JTextField monto3;
    private javax.swing.JTextField municipio3;
    private javax.swing.JTextField no_venta1;
    private javax.swing.JTextField nombre3;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton nuevo1;
    private javax.swing.JButton nuevo2;
    private javax.swing.JTextField objetos3;
    private javax.swing.JTextField pagado3;
    private javax.swing.JTextField pagar3;
    private javax.swing.JTextField pago3;
    private javax.swing.JPanel pagos;
    private javax.swing.JPanel registros;
    private javax.swing.JPanel registroventas;
    private javax.swing.JTable tablad;
    private javax.swing.JTable tablad12;
    private javax.swing.JTable tablad2;
    private javax.swing.JTextField telefono3;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JTextField total3;
    private javax.swing.JTextField txtap_mat;
    private javax.swing.JTextField txtap_mat2;
    private javax.swing.JTextField txtap_pat;
    private javax.swing.JTextField txtap_pat2;
    private javax.swing.JTextField txtcalle;
    private javax.swing.JTextField txtcalle2;
    private javax.swing.JTextField txtcasa;
    private javax.swing.JTextField txtcasa2;
    private javax.swing.JTextField txtdb;
    private javax.swing.JTextField txtdb1;
    private javax.swing.JTextField txtdb12;
    private javax.swing.JTextField txtelfecha;
    private javax.swing.JTextField txtelfechali;
    private javax.swing.JTextField txtelfechap;
    private javax.swing.JTextField txtelmonto;
    private javax.swing.JTextField txtelobjetos;
    private javax.swing.JTextField txtelpagado;
    private javax.swing.JTextField txtelpago;
    private javax.swing.JTextField txtelporpagar;
    private javax.swing.JTextField txteltotal;
    private javax.swing.JTextField txtelventa;
    private javax.swing.JTextField txtfolio;
    private javax.swing.JTextField txtfolio2;
    private javax.swing.JTextField txtlocalidad;
    private javax.swing.JTextField txtlocalidad2;
    private javax.swing.JTextField txtmonto;
    private javax.swing.JTextField txtmunicipio;
    private javax.swing.JTextField txtmunicipio2;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombre2;
    private javax.swing.JTextField txtobjetos;
    private javax.swing.JTextField txtpagado;
    private javax.swing.JTextField txtpago;
    private javax.swing.JTextField txtporpagar;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttelefono2;
    private javax.swing.JTextField txttotalpagar;
    private javax.swing.JTextField txtventa;
    private javax.swing.JTextField venta3;
    // End of variables declaration//GEN-END:variables

    private conexion conexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
