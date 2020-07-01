/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import presentacion.GRUPO;

/**
 *
 * @author Alejandro Saenz
 */
public class Mantenimiento_Calificaciones {
    Statement sentenciaSQL;
    BDconexion con;
    public void Registro_Nuevo(DCalificaciones pdto){
        try {
            con=new BDconexion();
            /*sentenciaSQL=con.Conectarse().createStatement();
            sentenciaSQL.executeUpdate("INSERT INTO tblproductos(clavepdto,descripcion,stock,precio,UdMedida,Fecha_Ingreso,NoCompra,Codbarras,rutaImagen,claveProv,imagenes)VALUES("+pdto.getClavePdto()+",'"+pdto.getDescripcion()+"',"+pdto.getStock()+","+pdto.getPrecio()+",'"+pdto.getUnidadmedida()+"','"+pdto.getFecha_ingreso()+"',"+pdto.getNo_compra()+","+pdto.getCodBarras()+",'"+pdto.getImagen()+"',"+pdto.getClave_prov()+",'"+pdto.getImagenes()+"')" );*/
            
            String insertar = "INSERT INTO calificaciones(Numero_de_Control,Nombre,Carrera,ClaveMateria,U1,U2,U3,U4,U5,U6) VALUES(?,?,?,?,?,?,?,?,?,?)";
        
        //*******Convertir la imagen a bits*********
          
           //**************
           PreparedStatement pst=con.Conectarse().prepareStatement(insertar);
           pst.setInt(1,pdto.getNumero_de_Control());
           pst.setString(2,pdto.getNombre());
           pst.setString(3,pdto.getCarrera());
           pst.setInt(4,pdto.getClaveMateria());
           pst.setInt(5,pdto.getU1());
           pst.setInt(6,pdto.getU2());
           pst.setInt(7,pdto.getU3());
           pst.setInt(8,pdto.getU4());
           pst.setInt(9,pdto.getU5());
           pst.setInt(10,pdto.getU6());
           
           
          
           
           int n=pst.executeUpdate();
           if(n>0)
           {
               JOptionPane.showMessageDialog(null,"Registro Guardado","Confirmacion",JOptionPane.INFORMATION_MESSAGE);
           }
           con.CerrarConexion();
           } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Clase no encontrada..."+ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion..."+ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null,"Acceso ilegal a la base de datos..."+ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de sentencia..."+ex);
        }
    }
    public JTable MostrarTabla(JTable TablaDatos){
        try {
            String sql="SELECT * FROM calificaciones";
            
            con=new BDconexion();
            sentenciaSQL=con.Conectarse().createStatement();
            ResultSet rs=sentenciaSQL.executeQuery(sql);
            ResultSetMetaData rsm=rs.getMetaData();//manipular filas y columnas
            
            //************** para llenar el encabezado de la TABLA en FrmProductos
            int col=rsm.getColumnCount();//obtener el numero de columnas de la tabla de BD
            DefaultTableModel modelo=new DefaultTableModel();
            for(int i=1; i<=col; i++){
                modelo.addColumn(rsm.getColumnLabel(i));//obtener el nombre de la columna en i de la BD (nombre de columnas)
            }
            //**************
            while(rs.next()){//mientras existan registros
                String fila[]=new String[col];
                for(int j=0;j<col;j++){//para pasar los datos de RS a el arreglo fila y para luego mandarlo a TABLA DATOS
                    fila[j]=rs.getString(j+1);
                }
                modelo.addRow(fila);//agregar el registro a la tabla temporal modelo
                
            }
            TablaDatos.setModel(modelo);//es la tabla que se muestra en FrmProductos
            rs.close();//cerramos tabla temporal
            con.CerrarConexion();//cerramos conexión
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Clase no encontrada..."+ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion..."+ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null,"Acceso ilegal a la base de datos..."+ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de sentencia..."+ex);
        }
        return TablaDatos;
    }
    public JTable MostrarTablaSistemas(JTable TablaDatos){
        try {
            String sql="SELECT * FROM calificaciones where Carrera='Sistemas'";
            
            con=new BDconexion();
            sentenciaSQL=con.Conectarse().createStatement();
            ResultSet rs=sentenciaSQL.executeQuery(sql);
            ResultSetMetaData rsm=rs.getMetaData();//manipular filas y columnas
            
            //************** para llenar el encabezado de la TABLA en FrmProductos
            int col=rsm.getColumnCount();//obtener el numero de columnas de la tabla de BD
            DefaultTableModel modelo=new DefaultTableModel();
            for(int i=1; i<=col; i++){
                modelo.addColumn(rsm.getColumnLabel(i));//obtener el nombre de la columna en i de la BD (nombre de columnas)
            }
            //**************
            while(rs.next()){//mientras existan registros
                String fila[]=new String[col];
                for(int j=0;j<col;j++){//para pasar los datos de RS a el arreglo fila y para luego mandarlo a TABLA DATOS
                    fila[j]=rs.getString(j+1);
                }
                modelo.addRow(fila);//agregar el registro a la tabla temporal modelo
                
            }
            TablaDatos.setModel(modelo);//es la tabla que se muestra en FrmProductos
            rs.close();//cerramos tabla temporal
            con.CerrarConexion();//cerramos conexión
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Clase no encontrada..."+ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion..."+ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null,"Acceso ilegal a la base de datos..."+ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de sentencia..."+ex);
        }
        return TablaDatos;
    }
    public JTable MostrarTablaElectromecanica(JTable TablaDatos){
        try {
            String sql="SELECT * FROM calificaciones where Carrera='Electromecanica'";
            
            con=new BDconexion();
            sentenciaSQL=con.Conectarse().createStatement();
            ResultSet rs=sentenciaSQL.executeQuery(sql);
            ResultSetMetaData rsm=rs.getMetaData();//manipular filas y columnas
            
            //************** para llenar el encabezado de la TABLA en FrmProductos
            int col=rsm.getColumnCount();//obtener el numero de columnas de la tabla de BD
            DefaultTableModel modelo=new DefaultTableModel();
            for(int i=1; i<=col; i++){
                modelo.addColumn(rsm.getColumnLabel(i));//obtener el nombre de la columna en i de la BD (nombre de columnas)
            }
            //**************
            while(rs.next()){//mientras existan registros
                String fila[]=new String[col];
                for(int j=0;j<col;j++){//para pasar los datos de RS a el arreglo fila y para luego mandarlo a TABLA DATOS
                    fila[j]=rs.getString(j+1);
                }
                modelo.addRow(fila);//agregar el registro a la tabla temporal modelo
                
            }
            TablaDatos.setModel(modelo);//es la tabla que se muestra en FrmProductos
            rs.close();//cerramos tabla temporal
            con.CerrarConexion();//cerramos conexión
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Clase no encontrada..."+ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion..."+ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null,"Acceso ilegal a la base de datos..."+ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de sentencia..."+ex);
        }
        return TablaDatos;
    }
    public JTable MostrarTablaIndustrial(JTable TablaDatos){
        try {
            String sql="SELECT * FROM calificaciones where Carrera='Industrial'";
            
            con=new BDconexion();
            sentenciaSQL=con.Conectarse().createStatement();
            ResultSet rs=sentenciaSQL.executeQuery(sql);
            ResultSetMetaData rsm=rs.getMetaData();//manipular filas y columnas
            
            //************** para llenar el encabezado de la TABLA en FrmProductos
            int col=rsm.getColumnCount();//obtener el numero de columnas de la tabla de BD
            DefaultTableModel modelo=new DefaultTableModel();
            for(int i=1; i<=col; i++){
                modelo.addColumn(rsm.getColumnLabel(i));//obtener el nombre de la columna en i de la BD (nombre de columnas)
            }
            //**************
            while(rs.next()){//mientras existan registros
                String fila[]=new String[col];
                for(int j=0;j<col;j++){//para pasar los datos de RS a el arreglo fila y para luego mandarlo a TABLA DATOS
                    fila[j]=rs.getString(j+1);
                }
                modelo.addRow(fila);//agregar el registro a la tabla temporal modelo
                
            }
            TablaDatos.setModel(modelo);//es la tabla que se muestra en FrmProductos
            rs.close();//cerramos tabla temporal
            con.CerrarConexion();//cerramos conexión
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Clase no encontrada..."+ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion..."+ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null,"Acceso ilegal a la base de datos..."+ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de sentencia..."+ex);
        }
        return TablaDatos;
    }
    public JTable MostrarTablaRenovables(JTable TablaDatos){
        try {
            String sql="SELECT * FROM calificaciones where Carrera='Renovables'";
            
            con=new BDconexion();
            sentenciaSQL=con.Conectarse().createStatement();
            ResultSet rs=sentenciaSQL.executeQuery(sql);
            ResultSetMetaData rsm=rs.getMetaData();//manipular filas y columnas
            
            //************** para llenar el encabezado de la TABLA en FrmProductos
            int col=rsm.getColumnCount();//obtener el numero de columnas de la tabla de BD
            DefaultTableModel modelo=new DefaultTableModel();
            for(int i=1; i<=col; i++){
                modelo.addColumn(rsm.getColumnLabel(i));//obtener el nombre de la columna en i de la BD (nombre de columnas)
            }
            //**************
            while(rs.next()){//mientras existan registros
                String fila[]=new String[col];
                for(int j=0;j<col;j++){//para pasar los datos de RS a el arreglo fila y para luego mandarlo a TABLA DATOS
                    fila[j]=rs.getString(j+1);
                }
                modelo.addRow(fila);//agregar el registro a la tabla temporal modelo
                
            }
            TablaDatos.setModel(modelo);//es la tabla que se muestra en FrmProductos
            rs.close();//cerramos tabla temporal
            con.CerrarConexion();//cerramos conexión
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Clase no encontrada..."+ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion..."+ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null,"Acceso ilegal a la base de datos..."+ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de sentencia..."+ex);
        }
        return TablaDatos;
    }
    public JTable MostrarTablaIGE(JTable TablaDatos){
        try {
            String sql="SELECT * FROM calificaciones where Carrera='IGE'";
            
            con=new BDconexion();
            sentenciaSQL=con.Conectarse().createStatement();
            ResultSet rs=sentenciaSQL.executeQuery(sql);
            ResultSetMetaData rsm=rs.getMetaData();//manipular filas y columnas
            
            //************** para llenar el encabezado de la TABLA en FrmProductos
            int col=rsm.getColumnCount();//obtener el numero de columnas de la tabla de BD
            DefaultTableModel modelo=new DefaultTableModel();
            for(int i=1; i<=col; i++){
                modelo.addColumn(rsm.getColumnLabel(i));//obtener el nombre de la columna en i de la BD (nombre de columnas)
            }
            //**************
            while(rs.next()){//mientras existan registros
                String fila[]=new String[col];
                for(int j=0;j<col;j++){//para pasar los datos de RS a el arreglo fila y para luego mandarlo a TABLA DATOS
                    fila[j]=rs.getString(j+1);
                }
                modelo.addRow(fila);//agregar el registro a la tabla temporal modelo
                
            }
            TablaDatos.setModel(modelo);//es la tabla que se muestra en FrmProductos
            rs.close();//cerramos tabla temporal
            con.CerrarConexion();//cerramos conexión
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Clase no encontrada..."+ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion..."+ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null,"Acceso ilegal a la base de datos..."+ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de sentencia..."+ex);
        }
        return TablaDatos;
    }
    
    
    
    public void Eliminar(DCalificaciones pro){
        try {
            String sql="DELETE FROM calificaciones WHERE Numero_de_Control="+pro.getNumero_de_Control();
            con=new BDconexion();
            sentenciaSQL=con.Conectarse().createStatement();
            int n=sentenciaSQL.executeUpdate(sql);
            if(n>0){
                JOptionPane.showMessageDialog(null,"Registro Eliminado: ","Confimación",JOptionPane.INFORMATION_MESSAGE);
            }
            con.CerrarConexion();
            sentenciaSQL.close();
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error 1: "+ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null,"Error 2: "+ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null,"Error 3: "+ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error 4: "+ex);
        }
    }
    public void Actualizar(DCalificaciones pdto){
        String sql="UPDATE calificaciones SET Numero_de_Control=?,Nombre=?, Carrera=?,ClaveMateria=?,U1=?,U2=?,U3=?,U4=?,U5=?,U6=? WHERE Numero_de_Control=?";
        try {
            
        //*******Convertir la imagen a bits*********
           
           //**************
           con=new BDconexion();
           PreparedStatement pst=con.Conectarse().prepareStatement(sql);
            pst.setInt(1,pdto.getNumero_de_Control());
           pst.setString(2,pdto.getNombre());
           pst.setString(3,pdto.getCarrera());
           pst.setInt(4,pdto.getClaveMateria());
           pst.setInt(5,pdto.getU1());
           pst.setInt(6,pdto.getU2());
           pst.setInt(7,pdto.getU3());
           pst.setInt(8,pdto.getU4());
           pst.setInt(9,pdto.getU5());
           pst.setInt(10,pdto.getU6());
           pst.setInt(11,pdto.getNumero_de_Control());
           int n=pst.executeUpdate();
           if(n>=0)
           {
               JOptionPane.showMessageDialog(null,"Registro Modificado","Confirmacion",JOptionPane.INFORMATION_MESSAGE);
           }
           con.CerrarConexion();
           } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Clase no encontrada..."+ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion..."+ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null,"Acceso ilegal a la base de datos..."+ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de sentencia..."+ex);
        }
}
    
    
    
    /*public DCalificaciones Consulta(DCalificaciones pro){
        String sql;
        try{
            sql="SELECT * FROM calificaciones WHERE Numero_de_Control="+pro.getNumero_de_Control();
            con=new BDconexion();
            sentenciaSQL=con.Conectarse().createStatement();
            ResultSet rs=sentenciaSQL.executeQuery(sql);
            if(rs.next()){
                pro.setNumero_de_Control(rs.getInt("NumerodeControl"));
                pro.setNombre(rs.getString("Nombre"));
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Registro no encontrado");
            }
            rs.close();
            con.CerrarConexion();
        }
         catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Clase no encontrada..."+ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion..."+ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null,"Acceso ilegal a la base de datos..."+ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de sentencia..."+ex);
        }
        return pro;
    }*/
     public DCalificaciones Consulta(DCalificaciones prov){
        try {
            String sql="SELECT * FROM calificaciones WHERE Numero_de_Control="+prov.getNumero_de_Control();
            con=new BDconexion();
            sentenciaSQL=con.Conectarse().createStatement();
           ResultSet rs=sentenciaSQL.executeQuery(sql);
           
            if(rs.next()){
                prov.setNumero_de_Control(rs.getInt("Numero_de_Control"));
                prov.setNombre(rs.getString("Nombre"));
                prov.setCarrera(rs.getString("Carrera"));
                prov.setClaveMateria(rs.getInt("ClaveMateria"));
                prov.setU1(rs.getInt("U1"));
                 prov.setU2(rs.getInt("U2"));
                  prov.setU3(rs.getInt("U3"));
                   prov.setU4(rs.getInt("U4"));
                    prov.setU5(rs.getInt("U5"));
                     prov.setU6(rs.getInt("U6"));
                     
               JOptionPane.showMessageDialog(null,"Registro encontrado","Aviso",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,"Registro inexistente","Aviso",JOptionPane.ERROR_MESSAGE);
                
            }
           
            sentenciaSQL.close();
            con.CerrarConexion();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error por clase no encontrada, instancia, acceso ilegal y sentencia: "+ex,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return prov;
    }
     
}
