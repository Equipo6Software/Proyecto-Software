
package datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class MantenimientoLista {
    Statement sentenciaSQL;
    BDconexion con;
     public void Registro_Nuevo(DLista pdto) {
        try {
            con=new BDconexion();
            /*sentenciaSQL=con.Conectarse().createStatement();
            sentenciaSQL.executeUpdate("INSERT INTO tblproductos(clavepdto,descripcion,stock,precio,UdMedida,Fecha_Ingreso,NoCompra,Codbarras,rutaImagen,claveProv,imagenes)VALUES("+pdto.getClavePdto()+",'"+pdto.getDescripcion()+"',"+pdto.getStock()+","+pdto.getPrecio()+",'"+pdto.getUnidadmedida()+"','"+pdto.getFecha_ingreso()+"',"+pdto.getNo_compra()+","+pdto.getCodBarras()+",'"+pdto.getImagen()+"',"+pdto.getClave_prov()+",'"+pdto.getImagenes()+"')" );*/
            
            String insertar = "INSERT INTO lista(NC,ClaveMateria,Nombre,Carrera) VALUES(?,?,?,?)"; 
                   
        //*******Convertir la imagen a bits*********
          
           //**************
           PreparedStatement pst=con.Conectarse().prepareStatement(insertar);
          pst.setInt(1,pdto.getNC());
          pst.setInt(2,pdto.getClaveMateria());
           pst.setString(3,pdto.getNombre());
           pst.setString(4,pdto.getCarrera());
           
          
           
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
      public JTable MostrarTabla3(JTable TablaDatos3){
        try {
            String sql="SELECT * FROM lista";
            
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
            TablaDatos3.setModel(modelo);//es la tabla que se muestra en FrmProductos
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
        return TablaDatos3;
    }
      public JTable MostrarTablaSistemas(JTable TablaDatos3){
        try {
            String sql="SELECT * FROM lista where carrera='Sistemas'";
            
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
            TablaDatos3.setModel(modelo);//es la tabla que se muestra en FrmProductos
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
        return TablaDatos3;
    }
    public JTable MostrarTablaElectromecanica(JTable TablaDatos3){
        try {
            String sql="SELECT * FROM lista where Carrera='Electromecanica'";
            
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
            TablaDatos3.setModel(modelo);//es la tabla que se muestra en FrmProductos
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
        return TablaDatos3;
    }
    public JTable MostrarTablaIndustrial(JTable TablaDatos3){
        try {
            String sql="SELECT * FROM lista where Carrera='Industrial'";
            
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
            TablaDatos3.setModel(modelo);//es la tabla que se muestra en FrmProductos
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
        return TablaDatos3;
    }
    public JTable MostrarTablaRenovables(JTable TablaDatos3){
        try {
            String sql="SELECT * FROM lista where Carrera='Renovables'";
            
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
            TablaDatos3.setModel(modelo);//es la tabla que se muestra en FrmProductos
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
        return TablaDatos3;
    }
    public JTable MostrarTablaIGE(JTable TablaDatos3){
        try {
            String sql="SELECT * FROM lista where Carrera='IGE'";
            
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
            TablaDatos3.setModel(modelo);//es la tabla que se muestra en FrmProductos
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
        return TablaDatos3;
    }
       public void Eliminar(DLista pro){
        try {
            String sql="DELETE FROM Lista WHERE NC="+pro.getNC();
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
         public void Actualizar(DLista pdto){
        String sql="UPDATE lista SET NC=?,ClaveMateria=?,Nombre=?,Carrera=?";
        try {
            
        //*******Convertir la imagen a bits*********
           
           //**************
           con=new BDconexion();
           PreparedStatement pst=con.Conectarse().prepareStatement(sql);
           pst.setInt(1,pdto.getNC());
           pst.setInt(2,pdto.getClaveMateria());
           pst.setString(3,pdto.getNombre());
           pst.setString(4,pdto.getCarrera());
          
           
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
         public DLista Consulta(DLista prov){
        try {
            String sql="SELECT * FROM lista WHERE NC="+prov.getNC();
            con=new BDconexion();
            sentenciaSQL=con.Conectarse().createStatement();
           ResultSet rs=sentenciaSQL.executeQuery(sql);
           
            if(rs.next()){
                prov.setNC(rs.getInt("NC"));
                prov.setClaveMateria(rs.getInt("ClaveMateria"));
                prov.setNombre(rs.getString("Nombre"));
                prov.setCarrera(rs.getString("Carrera"));
                
               
                     
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
