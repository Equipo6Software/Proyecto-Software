
package datos;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
 

public class MantenimientoEvaluacion {
    Statement sentenciaSQL;
    BDconexion con;
    
     public void Registro_Nuevo(DEvaluacion pdto) {
        try {
            con=new BDconexion();
            /*sentenciaSQL=con.Conectarse().createStatement();
            sentenciaSQL.executeUpdate("INSERT INTO tblproductos(clavepdto,descripcion,stock,precio,UdMedida,Fecha_Ingreso,NoCompra,Codbarras,rutaImagen,claveProv,imagenes)VALUES("+pdto.getClavePdto()+",'"+pdto.getDescripcion()+"',"+pdto.getStock()+","+pdto.getPrecio()+",'"+pdto.getUnidadmedida()+"','"+pdto.getFecha_ingreso()+"',"+pdto.getNo_compra()+","+pdto.getCodBarras()+",'"+pdto.getImagen()+"',"+pdto.getClave_prov()+",'"+pdto.getImagenes()+"')" );*/
            
           String insertar = "INSERT INTO evaluacion(Identificador,Unidad,Etapa,Actividades,Evidencias,Criterios_de_Evaluacion,ClaveM,RutaImagen,Imagen,RutaImagen2,Imagen2) VALUES(?,?,?,?,?,?,?,?,?,?,?)"; 
                   
        //*******Convertir la imagen a bits*********
          FileInputStream archivofoto;
          archivofoto=new FileInputStream(pdto.getImagen());
          
          FileInputStream archivofoto2;
          archivofoto2=new FileInputStream(pdto.getImagen2());
           //**************
           PreparedStatement pst=con.Conectarse().prepareStatement(insertar);
         pst.setInt(1,pdto.getId());
           pst.setInt(2,pdto.getUnidad());
           pst.setString(3,pdto.getEtapa());
           pst.setString(4,pdto.getActividades());
           pst.setString(5,pdto.getEvidencias());
           pst.setString(6,pdto.getCriterios_de_Evaluacion());
          pst.setInt(7,pdto.getClaveM());
          pst.setString(8,pdto.getRutaImagen());
          pst.setBinaryStream(9, archivofoto);
          pst.setString(10,pdto.getRutaImagen2());
          pst.setBinaryStream(11, archivofoto2);
           
          
           
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
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MantenimientoEvaluacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public JTable MostrarTabla2(JTable TablaDatos2){
        try {
            String sql="SELECT * FROM evaluacion";
            
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
            TablaDatos2.setModel(modelo);//es la tabla que se muestra en FrmProductos
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
        return TablaDatos2;
    }
       public void Eliminar(DEvaluacion pro){
        try {
            String sql="DELETE FROM evaluacion WHERE Identificador="+pro.getId();
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
       public ImageIcon obtenerImagen(int id) throws SQLException{
        InputStream IS=null;
        ImageIcon II=null;
        String sql="SELECT imagen FROM evaluacion WHERE Identificador="+id;
        try{
            con=new BDconexion();
            sentenciaSQL=con.Conectarse().createStatement();
            ResultSet rs=sentenciaSQL.executeQuery(sql);
            if(rs.next()){
                IS=rs.getBinaryStream(1);
                BufferedImage bi=ImageIO.read(IS);
                II=new ImageIcon(bi);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error: "+ex);
        }
        con.CerrarConexion();
        sentenciaSQL.close();
        return II;
    }
       
       public ImageIcon obtenerImagen2(int id) throws SQLException{
        InputStream IS=null;
        ImageIcon II=null;
        String sql="SELECT imagen2 FROM evaluacion WHERE Identificador="+id;
        try{
            con=new BDconexion();
            sentenciaSQL=con.Conectarse().createStatement();
            ResultSet rs=sentenciaSQL.executeQuery(sql);
            if(rs.next()){
                IS=rs.getBinaryStream(1);
                BufferedImage bi=ImageIO.read(IS);
                II=new ImageIcon(bi);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error: "+ex);
        }
        con.CerrarConexion();
        sentenciaSQL.close();
        return II;
    }
       public void Actualizar(DEvaluacion pdto){
        String sql="UPDATE evaluacion SET Identificador=?,Unidad=?,Etapa=?,Actividades=?,Evidencias=?,Criterios_de_Evaluacion=?, ClaveM=?, RutaImagen=?, Imagen=?, RutaImagen2=?, Imagen2=? WHERE Identificador=?";
        try {
            
        //*******Convertir la imagen a bits*********
            FileInputStream archivofoto;
          archivofoto=new FileInputStream(pdto.getImagen());
          
          FileInputStream archivofoto2;
          archivofoto2=new FileInputStream(pdto.getImagen2());
           //**************
           con=new BDconexion();
           
           
           PreparedStatement pst=con.Conectarse().prepareStatement(sql);
           pst.setInt(1,pdto.getId());
           pst.setInt(2,pdto.getUnidad());
           pst.setString(3,pdto.getEtapa());
           pst.setString(4,pdto.getActividades());
           pst.setString(5,pdto.getEvidencias());
           pst.setString(6,pdto.getCriterios_de_Evaluacion());
          pst.setInt(7,pdto.getClaveM());
          pst.setString(8,pdto.getRutaImagen());
          pst.setBinaryStream(9, archivofoto);
          pst.setString(10,pdto.getRutaImagen2());
          pst.setBinaryStream(11, archivofoto2);
           pst.setInt(12,pdto.getId());
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
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MantenimientoEvaluacion.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
