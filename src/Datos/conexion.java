/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author officedepot61417
 */
public class conexion {
    private Connection conexion=null;
    private Statement sentenciaSQL;
    private ResultSet cdr;
    
    public conexion() throws ClassNotFoundException,SQLException,InstantiationException,IllegalAccessException
    {
        String controlador="com.mysql.jdbc.Driver";
        Class.forName(controlador).newInstance();
        
        String URL="jdbc:mysql://localhost:3306/muebleria?zeroDateTimeBehavior=convertToNull";
        String usuario="root";
        String contraseña="";
        conexion=DriverManager.getConnection(URL, usuario, contraseña);
    }
    public Connection Conectarse(){
        return conexion;
    }
    public void CerrarConexion()throws SQLException{
        if(cdr!=null) 
            cdr.close();
        if(sentenciaSQL!=null) 
            sentenciaSQL.close();
        if(conexion!=null)
            conexion.close();
    }
    
}
