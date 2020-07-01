
package Negocio;

import datos.DEvaluacion;
import datos.DObservaciones;
import datos.MantenimientoEvaluacion;
import datos.MantenimientoObservaciones;
import javax.swing.JTable;


public class PuenteObservaciones {
    MantenimientoObservaciones mp;
    public void PuenteRegistro(DObservaciones pdto){
        mp=new MantenimientoObservaciones();
        mp.Registro_Nuevo(pdto);
    }
    
    public void PuenteActualizar(DObservaciones prod){
        mp=new MantenimientoObservaciones();
        mp.Actualizar(prod);
    }
    public JTable PuenteMostrarTabla(JTable TablaO){
        JTable tbl;
        mp=new MantenimientoObservaciones();
        tbl= mp.MostrarTabla(TablaO);
        return tbl;
    }
    
      public void PuenteEliminar(DObservaciones pro){
        mp=new MantenimientoObservaciones();
        mp.Eliminar(pro);
    }
}
