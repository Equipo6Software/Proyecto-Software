/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import datos.DCalificaciones;
import datos.Mantenimiento_Calificaciones;
import javax.swing.JTable;

/**
 *
 * @author Alejandro Saenz
 */
public class PuenteCalifas {
    Mantenimiento_Calificaciones mp;
    public void PuenteRegistro(DCalificaciones pdto){
        mp=new Mantenimiento_Calificaciones();
        mp.Registro_Nuevo(pdto);
    }
    public JTable PuenteMostrarTabla(JTable TablaDatos){
        JTable tbl;
        mp=new Mantenimiento_Calificaciones();
        tbl= mp.MostrarTabla(TablaDatos);
        return tbl;
    }
    //***************************CARRERAS**************************************
    public JTable PuenteMostrarTablaSistemas(JTable TablaDatos){
        JTable tbl;
        mp=new Mantenimiento_Calificaciones();
        tbl= mp.MostrarTablaSistemas(TablaDatos);
        return tbl;
    }
    public JTable PuenteMostrarTablaElectromecanica(JTable TablaDatos){
        JTable tbl;
        mp=new Mantenimiento_Calificaciones();
        tbl= mp.MostrarTablaElectromecanica(TablaDatos);
        return tbl;
    }
    public JTable PuenteMostrarTablaIGE(JTable TablaDatos){
        JTable tbl;
        mp=new Mantenimiento_Calificaciones();
        tbl= mp.MostrarTablaIGE(TablaDatos);
        return tbl;
    }
    public JTable PuenteMostrarTablaRenovables(JTable TablaDatos){
        JTable tbl;
        mp=new Mantenimiento_Calificaciones();
        tbl= mp.MostrarTablaRenovables(TablaDatos);
        return tbl;
    }
    public JTable PuenteMostrarTablaIndustrial(JTable TablaDatos){
        JTable tbl;
        mp=new Mantenimiento_Calificaciones();
        tbl= mp.MostrarTablaIndustrial(TablaDatos);
        return tbl;
    }
    //**************************************************************************
    public void PuenteActualizar(DCalificaciones prod){
        mp=new Mantenimiento_Calificaciones();
        mp.Actualizar(prod);
    }
      public void PuenteEliminar(DCalificaciones pro){
        mp=new Mantenimiento_Calificaciones();
        mp.Eliminar(pro);
    }
      
}
