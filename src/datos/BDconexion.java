/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alejandro Saenz
 */
public class BDconexion {
    private Connection conexion=null;//variable para conexion
    private Statement sentenciaSQL;//variable para crear sentencias: select, intsert into,delete, update, etc
    private ResultSet resultado;//generar tablas temporales
    //172.16.3.131
    public BDconexion() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        String controlador="com.mysql.jdbc.Driver";
        Class.forName(controlador).newInstance();
        String URL="jdbc:mysql://localhost:3306/software?zeroDateTimeBehavior=convertToNull";
        String usuario="root";
        String password="";
        conexion=DriverManager.getConnection(URL,usuario,password);
    }
    
    public Connection Conectarse(){
        return conexion;
    }
    public void CerrarConexion() throws SQLException{
        if(resultado!=null){
            resultado.close();
        }
        if(sentenciaSQL!=null){
            sentenciaSQL.close();
        }
        if(conexion!=null){
            conexion.close();
        }
    }
}
