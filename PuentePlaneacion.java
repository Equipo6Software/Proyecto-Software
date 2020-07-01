/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import datos.DPlaneacion;
import datos.MantenimientoPlaneacion;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Alejandro Saenz
 */
public class PuentePlaneacion {
    
    MantenimientoPlaneacion mp;
    public void PuenteRegistro(DPlaneacion pdto) throws SQLException{
        mp=new MantenimientoPlaneacion();
        mp.Registro_Nuevo(pdto);
    }
    public JTable PuenteMostrarTabla4(JTable TablaDatos4){
        JTable tbl;
        mp=new MantenimientoPlaneacion();
        tbl= mp.MostrarTabla4(TablaDatos4);
        return tbl;
    }
    public void PuenteActualizar(DPlaneacion prod){
        mp=new MantenimientoPlaneacion();
        mp.Actualizar(prod);
    }
      public void PuenteEliminar(DPlaneacion pro){
        mp=new MantenimientoPlaneacion();
        mp.Eliminar(pro);
    }
}
