/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandro Saenz
 */
public class MantenimientoPlaneacion {
    
    Statement sentenciaSQL;
    BDconexion con;
     public void Registro_Nuevo(DPlaneacion pdto) throws SQLException {
        try {
            con=new BDconexion();
            /*sentenciaSQL=con.Conectarse().createStatement();
            sentenciaSQL.executeUpdate("INSERT INTO tblproductos(clavepdto,descripcion,stock,precio,UdMedida,Fecha_Ingreso,NoCompra,Codbarras,rutaImagen,claveProv,imagenes)VALUES("+pdto.getClavePdto()+",'"+pdto.getDescripcion()+"',"+pdto.getStock()+","+pdto.getPrecio()+",'"+pdto.getUnidadmedida()+"','"+pdto.getFecha_ingreso()+"',"+pdto.getNo_compra()+","+pdto.getCodBarras()+",'"+pdto.getImagen()+"',"+pdto.getClave_prov()+",'"+pdto.getImagenes()+"')" );*/
            
            String insertar = "INSERT INTO planeacion(clave,plan_de_estudios,periodo,Nombre_de_la_asignatura,catedratico,horas_teoria,horas_practicas,"
                    + "unidades,grupo,Caracterizacion_de_la_asignatura,Competencia,intencion_didactica) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)"; 
                   
        //*******Convertir la imagen a bits*********
          
           //**************
           PreparedStatement pst=con.Conectarse().prepareStatement(insertar);
          
          
           pst.setInt(1,pdto.getClave());
           pst.setString(2,pdto.getPlan_de_estudios());
            pst.setString(3,pdto.getPeriodo());
            pst.setString(4,pdto.getNombre_de_la_asignatura());
            pst.setString(5,pdto.getCatedratico());
            pst.setFloat(6,pdto.getHoras_teoria());
            pst.setFloat(7,pdto.getHoras_practicas());
            pst.setFloat(8,pdto.getUnidades());
             pst.setString(9,pdto.getGrupo());
              pst.setString(10,pdto.getCaracterizacion_de_la_asignatura());
               pst.setString(11,pdto.getCompetencia());
                pst.setString(12,pdto.getIntencion_didactica());
            
           
           
           
          
           
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
      public JTable MostrarTabla4(JTable TablaDatos4){
        try {
            String sql="SELECT * FROM planeacion";
            
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
               /**/ for(int j=0;j<col;j++){//para pasar los datos de RS a el arreglo fila y para luego mandarlo a TABLA DATOS
                    fila[j]=rs.getString(j+1);
                }
                modelo.addRow(fila);//agregar el registro a la tabla temporal modelo
                
            }
            TablaDatos4.setModel(modelo);//es la tabla que se muestra en FrmProductos
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
        return TablaDatos4;
    }
       public void Eliminar(DPlaneacion pro){
        try {
            String sql="DELETE FROM planeacion WHERE clave="+pro.getClave();
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
         public void Actualizar(DPlaneacion pdto){
        String sql="UPDATE planeacion SET clave=?, plan_de_estudios=?, periodo=?, Nombre_de_la_asignatura=?, catedratico=?, horas_teoria=?, horas_practicas=?,"
                    + "unidades=?, grupo=?, Caracterizacion_de_la_asignatura=?, Competencia=?, intencion_didactica=?";
        try {
            
        //*******Convertir la imagen a bits*********
           
           //**************
           con=new BDconexion();
           PreparedStatement pst=con.Conectarse().prepareStatement(sql);
           
           pst.setInt(1,pdto.getClave());
           pst.setString(2,pdto.getPlan_de_estudios());
            pst.setString(3,pdto.getPeriodo());
            pst.setString(4,pdto.getNombre_de_la_asignatura());
            pst.setString(5,pdto.getCatedratico());
            pst.setFloat(6,pdto.getHoras_teoria());
            pst.setFloat(7,pdto.getHoras_practicas());
            pst.setFloat(8,pdto.getUnidades());
             pst.setString(9,pdto.getGrupo());
              pst.setString(10,pdto.getCaracterizacion_de_la_asignatura());
               pst.setString(11,pdto.getCompetencia());
                pst.setString(12,pdto.getIntencion_didactica());
        
           
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
        
}
