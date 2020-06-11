
package Negocio;

import datos.DCalificaciones;
import datos.DLista;
import datos.MantenimientoLista;
import datos.Mantenimiento_Calificaciones;
import javax.swing.JTable;


public class PuenteLista {
    MantenimientoLista mp;
    public void PuenteRegistro(DLista pdto){
        mp=new MantenimientoLista();
        mp.Registro_Nuevo(pdto);
    }
    public JTable PuenteMostrarTabla3(JTable TablaDatos3){
        JTable tbl;
        mp=new MantenimientoLista();
        tbl= mp.MostrarTabla3(TablaDatos3);
        return tbl;
    }
     //***************************CARRERAS**************************************
    public JTable PuenteMostrarTablaSistemas(JTable TablaDatos3){
        JTable tbl;
        mp=new MantenimientoLista();
        tbl= mp.MostrarTablaSistemas(TablaDatos3);
        return tbl;
    }
    public JTable PuenteMostrarTablaElectromecanica(JTable TablaDatos3){
        JTable tbl;
        mp=new MantenimientoLista();
        tbl= mp.MostrarTablaElectromecanica(TablaDatos3);
        return tbl;
    }
    public JTable PuenteMostrarTablaIGE(JTable TablaDatos3){
        JTable tbl;
        mp=new MantenimientoLista();
        tbl= mp.MostrarTablaIGE(TablaDatos3);
        return tbl;
    }
    public JTable PuenteMostrarTablaRenovables(JTable TablaDatos3){
        JTable tbl;
        mp=new MantenimientoLista();
        tbl= mp.MostrarTablaRenovables(TablaDatos3);
        return tbl;
    }
    public JTable PuenteMostrarTablaIndustrial(JTable TablaDatos3){
        JTable tbl;
        mp=new MantenimientoLista();
        tbl= mp.MostrarTablaIndustrial(TablaDatos3);
        return tbl;
    }
    //**************************************************************************
    public void PuenteActualizar(DLista prod){
        mp=new MantenimientoLista();
        mp.Actualizar(prod);
    }
      public void PuenteEliminar(DLista pro){
        mp=new MantenimientoLista();
        mp.Eliminar(pro);
    }
}
