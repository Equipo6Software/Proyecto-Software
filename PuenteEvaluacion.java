
package Negocio;

import datos.DCalificaciones;

import datos.DEvaluacion;
import datos.MantenimientoEvaluacion;
import datos.Mantenimiento_Calificaciones;
import java.io.FileNotFoundException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import javax.swing.JTable;


public class PuenteEvaluacion {
    MantenimientoEvaluacion mp;
    public void PuenteRegistro(DEvaluacion pdto){
        mp=new MantenimientoEvaluacion();
        mp.Registro_Nuevo(pdto);
    }
    
    public JTable PuenteMostrarTabla2(JTable TablaDatos2){
        JTable tbl;
        mp=new MantenimientoEvaluacion();
        tbl= mp.MostrarTabla2(TablaDatos2);
        return tbl;
    }
    public void PuenteActualizar(DEvaluacion prod){
        mp=new MantenimientoEvaluacion();
        mp.Actualizar(prod);
    }
    
      public void PuenteEliminar(DEvaluacion pro){
        mp=new MantenimientoEvaluacion();
        mp.Eliminar(pro);
    }
      public ImageIcon puenteObtenerImagen(int clv){
        mp=new MantenimientoEvaluacion();
        ImageIcon img=null;
        try{
            img=mp.obtenerImagen(clv);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error: "+ex);
        }
        return img;
    }
      
      public ImageIcon puenteObtenerImagen2(int clv2){
        mp=new MantenimientoEvaluacion();
        ImageIcon img2=null;
        try{
            img2=mp.obtenerImagen2(clv2);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error: "+ex);
        }
        return img2;
    }
}
