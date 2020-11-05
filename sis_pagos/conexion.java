package sis_pagos;
import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {
    private Connection con=null;
    
    public Connection conexion(){
        
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemapagos","root","root");
            //System.out.println("conectado");
           
        
    }catch (ClassNotFoundException |SQLException e){
            System.out.println("Error");
    }  
        return con;
    }
    
    public void cerrarConexion (Connection con) {
        try {
            con.close();
        }catch (SQLException e){
            System.out.println("error");
}
}
    public static void main(String[] args) {
        
    }
}

