/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import datos.DMaestros;
import datos.DObservaciones;
import datos.MantenimientoMaestros;
import datos.MantenimientoObservaciones;
import javax.swing.JTable;

/**
 *
 * @author Alejandro Saenz
 */
public class PuenteMaestros {
    
    MantenimientoMaestros mp;
    public void PuenteRegistro(DMaestros pdto){
        mp=new MantenimientoMaestros();
        mp.Registro_Nuevo(pdto);
    }
    
    public void PuenteActualizar(DMaestros prod){
        mp=new MantenimientoMaestros();
        mp.Actualizar(prod);
    }
    public JTable PuenteMostrarTabla(JTable tblm){
        JTable tbl;
        mp=new MantenimientoMaestros();
        tbl= mp.MostrarTabla(tblm);
        return tbl;
    }
    public JTable PuenteMostrarTablaEle(JTable tblm){
        JTable tbl;
        mp=new MantenimientoMaestros();
        tbl= mp.MostrarTablaEle(tblm);
        return tbl;
    }
    public JTable PuenteMostrarTablaIGE(JTable tblm){
        JTable tbl;
        mp=new MantenimientoMaestros();
        tbl= mp.MostrarTablaIGE(tblm);
        return tbl;
    }
    public JTable PuenteMostrarTablaIndustrial(JTable tblm){
        JTable tbl;
        mp=new MantenimientoMaestros();
        tbl= mp.MostrarTablaIndustrial(tblm);
        return tbl;
    }
     public JTable PuenteMostrarTablaReno(JTable tblm){
        JTable tbl;
        mp=new MantenimientoMaestros();
        tbl= mp.MostrarTablaReno(tblm);
        return tbl;
    }
     public JTable PuenteMostrarTablaSistemas(JTable tblm){
        JTable tbl;
        mp=new MantenimientoMaestros();
        tbl= mp.MostrarTablaSistemas(tblm);
        return tbl;
    }
      public void PuenteEliminar(DMaestros pro){
        mp=new MantenimientoMaestros();
        mp.Eliminar(pro);
    }
    
}
