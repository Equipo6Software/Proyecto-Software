
package Negocio;

import datos.DCalificaciones;

import datos.DEvaluacion;
import datos.MantenimientoEvaluacion;
import datos.Mantenimiento_Calificaciones;

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
}
