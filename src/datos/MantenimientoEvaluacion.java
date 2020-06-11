
package datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
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
            
            String insertar = "INSERT INTO evaluacion(Unidad,Etapa,Actividades,Evidencias,Criterios_de_Evaluacion) VALUES(?,?,?,?,?)"; 
                   
        //*******Convertir la imagen a bits*********
          
           //**************
           PreparedStatement pst=con.Conectarse().prepareStatement(insertar);
           pst.setInt(1,pdto.getUnidad());
           pst.setString(2,pdto.getEtapa());
           pst.setString(3,pdto.getActividades());
           pst.setString(4,pdto.getEvidencias());
           pst.setString(5,pdto.getCriterios_de_Evaluacion());
          
          
           
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
            String sql="DELETE FROM evaluacion WHERE Unidad="+pro.getUnidad();
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
       public void Actualizar(DEvaluacion pdto){
        String sql="UPDATE evaluacion SET Unidad=?,Etapa=?,Actividades=?,Evidencias=?,Criterios_de_Evaluacion=?";
        try {
            
        //*******Convertir la imagen a bits*********
           
           //**************
           con=new BDconexion();
           PreparedStatement pst=con.Conectarse().prepareStatement(sql);
           pst.setInt(1,pdto.getUnidad());
           pst.setString(2,pdto.getEtapa());
           pst.setString(3,pdto.getActividades());
           pst.setString(4,pdto.getEvidencias());
           pst.setString(5,pdto.getCriterios_de_Evaluacion());
          // pst.setInt(6,pdto.getUnidad());
           
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
