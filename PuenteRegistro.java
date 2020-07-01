
package Negocio;

import datos.DCalificaciones;
import datos.DRegistro;
import datos.MantenimientoRegistro;
import datos.Mantenimiento_Calificaciones;
import javax.swing.JTable;



public class PuenteRegistro {
    MantenimientoRegistro mp;
    public void PuenteRegistro(DRegistro pdto){
        mp=new MantenimientoRegistro();
        mp.Registro_Nuevo(pdto);
    }
    public JTable PuenteMostrarTabla(JTable TablaDatosx){
        JTable tbl;
        mp=new MantenimientoRegistro();
        tbl= mp.MostrarTabla(TablaDatosx);
        return tbl;
    }
    public JTable PuenteMostrarTablax1(JTable TablaDatosx1){
        JTable tbl;
        mp=new MantenimientoRegistro();
        tbl= mp.MostrarTabla(TablaDatosx1);
        return tbl;
    }
     public void PuenteActualizar(DRegistro prod){
        mp=new MantenimientoRegistro();
        mp.Actualizar(prod);
    }
      public void PuenteEliminar(DRegistro pro){
        mp=new MantenimientoRegistro();
        mp.Eliminar(pro);
    }
    
}
