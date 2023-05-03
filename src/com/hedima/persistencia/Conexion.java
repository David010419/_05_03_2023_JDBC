package com.hedima.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //1.Atributos

    protected Connection miConexion;
    //2.Metodos
    public void abrirConexion() throws ClassNotFoundException, SQLException {
        //1. Cargar el controlador (driver)
        Class.forName("org.postgresql.Driver");
        //2. Definir una variable de tipo String para la conexion
        String url = "jdbc:postgresql://localhost:5432/northwind";
        String user =  "postgres";
        String password = "postgres";
        //3. Obtener la conexion
        miConexion = DriverManager.getConnection(url, user, password);
        System.out.println("Exito al abrir la conexion");
    }

    public void cerrar() throws SQLException {
        miConexion.close();
    }
    //3.Constructores

    public Conexion() {
    }

    //4.Getter y Setters


    public Connection getMiConexion() {
        return miConexion;
    }

    public void setMiConexion(Connection miConexion) {
        this.miConexion = miConexion;
    }
}
